package exercicios.modulo_estrutura_dados.exercicio_5;

public class AnaliseTexto {
  public static void main(String[] args) {
    String frase = " Java é uma linguagem poderosa! ";
    System.out.println(frase);

    String fraseSemEspacos = frase.trim();
    System.out.println(fraseSemEspacos);

    String fraseEmMaiusculas = fraseSemEspacos.toUpperCase();
    System.out.println(fraseEmMaiusculas);

    Boolean contemPalavraLinguagem = fraseSemEspacos.contains("linguagem");
    System.out.println("Contém a palavra 'linguagem': " + contemPalavraLinguagem);

    String fraseAlterada = fraseSemEspacos.replace("Java", "C++");
    System.out.println(fraseAlterada);

    int quantidadeCaracteres = fraseSemEspacos.length();
    System.out.println("Quantidade de caracteres: " + quantidadeCaracteres);

    System.out.println(fraseSemEspacos.substring(21));


  }
}
