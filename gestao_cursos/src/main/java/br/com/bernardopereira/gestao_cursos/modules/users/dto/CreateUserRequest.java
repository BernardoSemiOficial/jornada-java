package br.com.bernardopereira.gestao_cursos.modules.users.dto;

import br.com.bernardopereira.gestao_cursos.modules.users.entities.UserRole;
import lombok.Data;

@Data
public class CreateUserRequest {
  public String name;
  public String email;
  public String password;
  public UserRole role;
}
