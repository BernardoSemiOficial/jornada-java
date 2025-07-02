package entradaSaida;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraEscritaBuffer {
    
    public static void main(String[] args) throws FileNotFoundException {
        /*
         * BufferedReader e BufferedWriter são usados para ler e escrever arquivos de texto de forma eficiente.
         * BufferedReader lê linhas de texto de um arquivo, enquanto BufferedWriter escreve linhas de texto em um arquivo.
         * Ambos podem lançar IOException se ocorrer um erro de I/O.
         */
        
        // Implementação do BufferedReader e BufferedWriter pode ser adicionada aqui
        // Exemplo de uso:
        BufferedReader bufferedReader = new BufferedReader(new FileReader("leitura.txt"));   
        String linha;
        try {
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha); // Lê e imprime cada linha do arquivo
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        } finally {
            try {
                bufferedReader.close(); // Fecha o BufferedReader após a leitura
            } catch (Exception e) {
                System.out.println("Erro ao fechar o BufferedReader: " + e.getMessage());
            }
        }

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new java.io.FileWriter("escrita.txt"));
            bufferedWriter.write("Olá, mundão, Bernardo!");
            bufferedWriter.newLine(); // Adiciona uma nova linha
            bufferedWriter.write("Bora! Bora!");
            System.out.println("Arquivo escrito com BufferedWriter");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close(); // Fecha o BufferedWriter após a escrita
                } catch (Exception e) {
                    System.out.println("Erro ao fechar o BufferedWriter: " + e.getMessage());
                }
            }
        }
    }
}
