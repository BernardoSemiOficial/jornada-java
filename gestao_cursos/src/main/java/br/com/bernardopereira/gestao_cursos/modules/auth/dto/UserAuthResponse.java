package br.com.bernardopereira.gestao_cursos.modules.auth.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAuthResponse {
  private String access_token;
  private Date expires_in;
  private Date created_at;
}
