package estrutura_de_dados;

public class AulaStringBuilder {
    
    public static void main(String[] args) {
        /*
         * O StringBuilder é uma classe em Java que permite criar e manipular strings de forma eficiente.
         * Ele é usado quando você precisa construir ou modificar strings de forma dinâmica, como
         * concatenar várias partes de texto, substituir partes de uma string ou limpar o conteúdo de uma string.
         * * O StringBuilder é mais eficiente do que a classe String para essas operações, pois ele não cria
         * novas instâncias de string a cada modificação, mas sim modifica o conteúdo do objeto existente.
         */
        // Exemplo de uso de StringBuilder em Java
        StringBuilder sb = new StringBuilder("Olá, ");
        
        // Adicionando texto ao StringBuilder
        sb.append("Mundo! ");
        sb.append("Bernardo");
        
        // Imprimindo o conteúdo do StringBuilder
        System.out.println("Conteúdo do StringBuilder: " + sb);
        
        // Verificando o tamanho do StringBuilder
        System.out.println("Tamanho do StringBuilder: " + sb.length());
        
        // Convertendo para maiúsculas
        System.out.println("Texto em maiúsculas: " + sb);
        
        // Convertendo para minúsculas
        System.out.println("Texto em minúsculas: " + sb);
        
        // Substituindo uma parte do texto
        sb.replace(4, 9, "Java");
        System.out.println("Texto após substituição: " + sb);
        
        // Limpando o conteúdo do StringBuilder
        sb.setLength(0);
        System.out.println("Após limpar: " + sb);
    }
}
