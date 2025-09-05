package br.com.bernardopereira.gestao_cursos.modules.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bernardopereira.gestao_cursos.modules.auth.dto.UserAuthRequest;
import br.com.bernardopereira.gestao_cursos.modules.auth.dto.UserAuthResponse;
import br.com.bernardopereira.gestao_cursos.modules.auth.useCases.UserAuthUseCase;
import br.com.bernardopereira.gestao_cursos.modules.users.entities.UserRole;


@RestController
@RequestMapping("/auth")
public class UserAuthController {

  @Autowired
  private UserAuthUseCase userAuthUseCase;

  @PostMapping("/teacher")
  public ResponseEntity<?> createTeacher(@RequestBody UserAuthRequest userAuthRequest) {
      try {
        UserAuthResponse token = this.userAuthUseCase.execute(userAuthRequest, UserRole.TEACHER);
        return ResponseEntity.ok(token);
      } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
      }   
  }
  
  @PostMapping("/student")
  public ResponseEntity<?> createStudant(@RequestBody UserAuthRequest userAuthRequest) {
      try {
        UserAuthResponse token = this.userAuthUseCase.execute(userAuthRequest, UserRole.STUDENT);
        return ResponseEntity.ok(token);
      } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
      }
      
  }
  
}
