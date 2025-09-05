package br.com.bernardopereira.gestao_cursos.config.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.SecretKey;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class SecurityFilter extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {
        
    System.out.println("SecurityFilter: Processing request for " + request.getRequestURI());
    String authorization = request.getHeader("Authorization");
    
    if (authorization != null && authorization.startsWith("Bearer ")) {
      SecretKey key = Keys.hmacShaKeyFor("@SECRET_KEY_MANAGE_COURSES_SECRET_KEY@".getBytes());
      String token = authorization.replace("Bearer ", "");
  
      try {
        Jws<Claims> tokenParsed = Jwts.parser().verifyWith(key).build()
            .parseSignedClaims(token);
        
        String userId = tokenParsed.getPayload().getSubject();
        var role = tokenParsed.getPayload().get("role");

        // ROLE_TEACHER
        // ROLE_STUDENT
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + role.toString()));

        System.out.println(tokenParsed);
        System.out.println(userId);
        System.out.println(role);
        request.setAttribute("userId", userId);
        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userId, key, authorities);
        SecurityContextHolder.getContext().setAuthentication(auth);
  
      } catch (Exception e) {
        System.out.println("SecurityFilter: Invalid token - " + e.getMessage());
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        return;
      }
    }

    filterChain.doFilter(request, response);
  }
  
}
