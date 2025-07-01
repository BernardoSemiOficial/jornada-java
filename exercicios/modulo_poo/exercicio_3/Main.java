package exercicios.modulo_poo.exercicio_3;

public class Main {
  
  public static void main(String[] args) {
    Pessoa p = new Pessoa();
    p.nome = "João Silva";
    // p.idade = 30; // Acesso direto à variável idade, pois é private
    p.cidade = "São Paulo"; // Acesso direto à variável cidade, pois é protected
    p.documento = "123456789"; // Acesso direto à variável documento, pois é package-private

    p.exibirNome(); // Método público, pode ser acessado
    // p.exibirIdade(); // Método privado, não pode ser acessado diretamente aqui
    p.exibirCidade(); // Método protegido, pode ser acessado aqui porque estamos na mesma classe
    p.exibirDocumento(); // Método package-private, pode ser acessado aqui porque estamos na mesma classe
  }
}
