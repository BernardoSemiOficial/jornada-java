package entradaSaida;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class LeituraEscrita {
    
    public static void main(String[] args) {
        /*
         * FileReader e FileWriter são usados para ler e escrever arquivos de texto.
         * FileReader lê caracteres de um arquivo, enquanto FileWriter escreve caracteres em um arquivo.
         * Ambos podem lançar IOException se ocorrer um erro de I/O.
         */

        
        // try {
        //     File file = new File("leitura.txt");
        //     file.createNewFile();
        //     FileReader fileReader = new FileReader(file);

        //     if(fileReader.ready()) { // Verifica se o arquivo está pronto para leitura
        //         System.out.println("O arquivo está pronto para leitura.");
        //         boolean lerArquivo = true; // Variável para controlar o loop de leitura
        //         while(lerArquivo)  {
        //             int character = fileReader.read(); // Lê o próximo caractere do arquivo
        //             if(character == -1) { // Verifica se chegou ao final do arquivo
        //                 lerArquivo = true; // Sai do loop se o final do arquivo for alcançado
        //             } else {
        //                 System.out.print((char) character); // Imprime o caractere lido
        //             }
        //         } 
        //     } else {
        //         System.out.println("O arquivo não está pronto para leitura.");
        //     }
            
        //     fileReader.close(); // Fecha o FileReader após a leitura
        // } catch (Exception e) {
        //     System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        // }

        try {
            File file = new File("escrita.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Olá, mundão, Bernardo!");
            fileWriter.append(" Bora! Bora!");
            fileWriter.close();
            System.out.println("Arquivo escrito");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
