package br.com.bernardopereira.gestao_cursos.modules.auth.dto;

import lombok.Data;

@Data
public class UserAuthRequest {
  private String email;
  private String password;
}
