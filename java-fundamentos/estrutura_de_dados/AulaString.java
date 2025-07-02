package estrutura_de_dados;

public class AulaString {
    
    public void main(String[] args) {
        // Exemplo de uso de String em Java
        String texto = "Olá, Mundo!";
        
        // Imprimindo o texto original
        System.out.println("Texto original: " + texto);
        
        // Verificando o tamanho da string
        System.out.println("Tamanho da string: " + texto.length());
        
        // Convertendo para maiúsculas
        String maiusculas = texto.toUpperCase();
        System.out.println("Texto em maiúsculas: " + maiusculas);
        
        // Convertendo para minúsculas
        String minusculas = texto.toLowerCase();
        System.out.println("Texto em minúsculas: " + minusculas);
        
        // Verificando se a string contém uma substring
        boolean contemMundo = texto.contains("Mundo");
        System.out.println("Contém 'Mundo'? " + contemMundo);
        
        // Substituindo uma parte da string
        String substituido = texto.replace("Mundo", "Java");
        System.out.println("Texto após substituição: " + substituido);
        
        // Dividindo a string em partes
        String[] partes = texto.split(", ");
        System.out.println("Partes do texto:");
        for (String parte : partes) {
            System.out.println(parte);
        }
    }
}
