package br.com.bernardopereira.gestao_cursos.modules.auth.useCases;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.bernardopereira.gestao_cursos.config.security.SecurityConfig;
import br.com.bernardopereira.gestao_cursos.modules.auth.dto.UserAuthRequest;
import br.com.bernardopereira.gestao_cursos.modules.auth.dto.UserAuthResponse;
import br.com.bernardopereira.gestao_cursos.modules.users.UserRepository;
import br.com.bernardopereira.gestao_cursos.modules.users.entities.UserEntity;
import br.com.bernardopereira.gestao_cursos.modules.users.entities.UserRole;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class UserAuthUseCase {
  
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private SecurityConfig securityConfig;

  public UserAuthResponse execute(UserAuthRequest userAuthRequest, UserRole userRole) {
    /*
     * TODO: Implementar lógica de autenticação de usuário
     * Verificar se o usuário existe
     * Verificar se a senha está correta
     * Gerar token JWT
     */

    Optional<UserEntity> user = this.userRepository.findByEmail(userAuthRequest.getEmail());
    if(user.isEmpty()) {
      throw new UsernameNotFoundException("Usuário ou senha inválidos");
    }

    if(!user.get().getRole().equals(userRole)) {
      throw new UsernameNotFoundException("Usuário ou senha inválidos");
    }

    Boolean isValidPassword = this.securityConfig.passwordEncoder().matches(userAuthRequest.getPassword(), user.get().getPassword());
    if(!isValidPassword) {
      throw new UsernameNotFoundException("Usuário ou senha inválidos");
    }

    /*
     * Gerar token JWT
     */ 
    Instant now = Instant.now();
    Instant expiration = now.plus(Duration.ofMinutes(3)); // Token válido por 3 minutos

    SecretKey key = Keys.hmacShaKeyFor("@SECRET_KEY_MANAGE_COURSES_SECRET_KEY@".getBytes());
    
    Map<String, String> claims = new HashMap<>();
    claims.put("role", userRole.toString());

    String token = Jwts.builder()
      .subject(user.get().getId().toString())
      .issuer("GESTAO_CURSOS")
      .issuedAt(Date.from(now))
      .expiration(Date.from(expiration))
      .claims(claims)
      .signWith(key)
      .compact();

    UserAuthResponse response = UserAuthResponse.builder()
      .access_token(token)
      .created_at(Date.from(now))
      .expires_in(Date.from(expiration)).build();

    return response;
  }
}
