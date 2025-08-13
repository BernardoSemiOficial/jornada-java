package br.com.bernardopereira.gestao_cursos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/primeiro-controller")
public class PrimeiroController {
  
  record Usuario(
    String nome,
    int idade
  ) {}

  @GetMapping()
  String primeiraMensagem() {
      return "Meu primeiro controller";
  }

  @GetMapping("/segunda-mensagem")
  Usuario segundaMensagem() {
    Usuario user = new Usuario("Bernardo", 20);
      return user;
  }

  @PostMapping()
  String receberDados(@RequestBody Usuario usuario) {
    return "Dados recebidos: " + usuario.nome() + ", " + usuario.idade();
  }

  @GetMapping("pathParams/{id}")
  String pathParams(@PathVariable String id) {
    return "Path Params: " + id;
  }

  @GetMapping("queryParams")
  String queryParams(@RequestParam String nome, @RequestParam int idade) {
    return "Query Params: Nome = " + nome + ", Idade = " + idade;
  }
  
}
