package br.com.bernardopereira.gestao_cursos.modules.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bernardopereira.gestao_cursos.modules.users.dto.CreateUserRequest;
import br.com.bernardopereira.gestao_cursos.modules.users.useCases.CreateUserUseCase;


@RestController
@RequestMapping("/users")
public class UserController {
  
  @Autowired
  private CreateUserUseCase createUserUseCase;

  @PostMapping()
  public ResponseEntity<?> createUser(@RequestBody CreateUserRequest user) {
    try {
      String response = this.createUserUseCase.execute(user);
      return ResponseEntity.ok(response);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
  
}
