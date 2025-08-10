package br.com.bernardopereira.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/meu-primeiro-servlet")
public class MeuPrimeiroServlet extends HttpServlet {
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");
    resp.getWriter().println("<html><body>");
    resp.getWriter().println("<h1>Meu Primeiro Servlet</h1>");
    resp.getWriter().println("<p>Olá, mundo! Este é o meu primeiro servlet.</p>");
    resp.getWriter().println("</body></html>");
  };

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String email = req.getParameter("email");
    String nome = req.getParameter("nome");

    resp.setContentType("text/html");
    resp.getWriter().println("<html><body>");
    resp.getWriter().println("<h1>Meu Primeiro Servlet - POST</h1>");
    resp.getWriter().println("<p>Dados recebidos via POST.</p>");
    resp.getWriter().println("<p>Nome: " + nome + "</p>");
    resp.getWriter().println("<p>Email: " + email + "</p>");
    resp.getWriter().println("</body></html>");
  }
}
