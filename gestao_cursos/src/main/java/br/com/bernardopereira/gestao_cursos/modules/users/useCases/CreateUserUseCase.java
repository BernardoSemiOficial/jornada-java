package br.com.bernardopereira.gestao_cursos.modules.users.useCases;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bernardopereira.gestao_cursos.config.security.SecurityConfig;
import br.com.bernardopereira.gestao_cursos.exceptions.ValidationException;
import br.com.bernardopereira.gestao_cursos.modules.users.UserRepository;
import br.com.bernardopereira.gestao_cursos.modules.users.dto.CreateUserRequest;
import br.com.bernardopereira.gestao_cursos.modules.users.entities.UserEntity;
import br.com.bernardopereira.gestao_cursos.utils.EmailValidation;
import br.com.bernardopereira.gestao_cursos.utils.PasswordValidation;

@Service
public class CreateUserUseCase {

  @Autowired
  UserRepository userRepository;

  @Autowired
  SecurityConfig securityConfig;

  public String execute(CreateUserRequest user) {
    // Verificar dados obrigatórios
    if(user.getName() == null || user.getEmail() == null || user.getPassword() == null || user.getPassword() == null) {
      throw new ValidationException("Preencher campos obrigatórios");
    }

    // Verificar se o e-mail é válido
    if(!EmailValidation.isValid(user.getEmail())) {
      throw new ValidationException("E-mail inválido");
    }

    // Verificar se a senha é válida
    if(!PasswordValidation.isValid(user.getPassword())) {
      throw new ValidationException("Senha inválida. A senha deve ter entre 8 e 15 caracteres, conter pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial.");
    }

    Optional<UserEntity> userExists = this.userRepository.findByEmail(user.getEmail());
    if(userExists.isPresent()) {
      throw new ValidationException("E-mail já cadastrado");
    }

    // Criptografar a senha
    user.setPassword(this.securityConfig.passwordEncoder().encode(user.getPassword()));

    UserEntity newUser = UserEntity
      .builder()
        .name(user.getName())
        .email(user.getEmail())
        .password(user.getPassword())
        .role(user.getRole())
        .build();

    UserEntity userCreated = this.userRepository.save(newUser);

    // Enviar e-mail de criação de conta
    // Enviar url do usuário

    return "url-do-usuario/" + userCreated.getId().toString();
  }
}
