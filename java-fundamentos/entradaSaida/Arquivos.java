package entradaSaida;

import java.io.File;
import java.io.IOException;

public class Arquivos {
    
    public static void main(String[] args) {
        File arquivo = new File("exemplo.txt");
        File arquivo1 = new File("exemplo1.txt");
        File arquivo2 = new File("exemplo2.txt");

        System.out.println(arquivo.isFile()); // Verifica se é um arquivo
        System.out.println(arquivo.isDirectory()); // Verifica se é um diretório
        System.out.println(arquivo.canRead()); // Verifica se o arquivo pode ser lido
        System.out.println(arquivo.canWrite()); // Verifica se o arquivo pode ser escrito
        System.out.println(arquivo.length()); // Exibe o tamanho do arquivo em bytes
        System.out.println(arquivo.lastModified()); // Exibe a data da última modificação do arquivo

        // Verifica se o arquivo existe
        try {
            if (arquivo.exists()) {
                System.out.println("O arquivo " + arquivo.getName() + " existe.");
                arquivo.delete(); // Deleta o arquivo
                System.out.println("O arquivo " + arquivo.getName() + " foi deletado.");
            } else {
                System.out.println("O arquivo " + arquivo.getName() + " não existe.");
                arquivo.createNewFile(); // Cria um novo arquivo
                System.out.println("O arquivo " + arquivo.getName() + " foi criado.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro no arquivo: " + e.getMessage());
        }

        try {
            arquivo1.createNewFile(); // Cria o arquivo1
            arquivo1.renameTo(arquivo2); // Renomeia o arquivo1 para arquivo2
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
    }
}
