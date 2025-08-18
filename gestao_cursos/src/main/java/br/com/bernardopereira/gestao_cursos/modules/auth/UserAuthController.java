package br.com.bernardopereira.gestao_cursos.modules.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bernardopereira.gestao_cursos.modules.auth.dto.UserAuthRequest;
import br.com.bernardopereira.gestao_cursos.modules.auth.useCases.UserAuthUseCase;


@RestController
@RequestMapping("/auth")
public class UserAuthController {

  @Autowired
  private UserAuthUseCase userAuthUseCase;

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody UserAuthRequest userAuthRequest) {
      try {
        String token = this.userAuthUseCase.execute(userAuthRequest);
        return ResponseEntity.ok(token);
      } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
      }
      
  }
  
}
