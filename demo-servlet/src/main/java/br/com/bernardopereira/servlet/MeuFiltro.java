package br.com.bernardopereira.servlet;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "/*") // Aplica o filtro a todas as URLs
public class MeuFiltro implements Filter {

  // Implementação do método init, que é chamado quando o filtro é inicializado
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    System.out.println("Filtro inicializado");
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    
    HttpServletRequest httpRequest = (HttpServletRequest) request;
    HttpServletResponse httpResponse = (HttpServletResponse) response;

    if(httpRequest.getRequestURI().contains("bloquear")) {
      // Se a URL contém "bloquear", retorna um erro 403
      httpResponse.sendError(HttpServletResponse.SC_FORBIDDEN, "Acesso proibido");
      return;
    }

    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {
    System.out.println("Filtro destruído");
  }
  
}
