package exercicios.modulo_estrutura_dados.exercicio_6;

public class MontadorDeMensagem {
  public static void main(String[] args) {
    StringBuilder mensagem = new StringBuilder();

    mensagem.append("Olá, ");
    mensagem.append("meu nome é ");
    mensagem.append("João.");

    System.out.println(mensagem);

    mensagem.replace(16, 20, "Carlos");

    System.out.println(mensagem);
    
    mensagem.insert(0, "tudo bem? ");
    System.out.println(mensagem);

    mensagem.reverse();
    
    System.out.println(mensagem);



  }
}
