package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class CadastroDeProdutos {

  static class RegistrationTask implements Runnable {

    @Override
    public void run() {
      String produto;

      while((produto = filaProdutos.poll()) != null) {
        System.out.println("Cadastrando produto: " + produto + " na thread " + Thread.currentThread().getName());
        tabelaProdutos.add(produto);
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          System.out.println("Thread interrompida.");
        }
      }
    }
  }
  private static List<String> tabelaProdutos = new CopyOnWriteArrayList<>();

  private static BlockingQueue<String> filaProdutos = new LinkedBlockingQueue();

  public static void main(String[] args) {
    List<String> produtos = Arrays.asList(
      "Produto A",
      "Produto B",
      "Produto C",
      "Produto D",
      "Produto E",
      "Produto F"
    );

    filaProdutos.addAll(produtos);

    int numeroDeThreads = 3;
    List<Thread> threads = new ArrayList<>();
    for(int i = 0; i < numeroDeThreads; i++) {
      Thread thread = new Thread(new RegistrationTask(), "Thread-" + (i + 1));
      threads.add(thread);
      thread.start();
    }

    for(Thread thread : threads) {
      try {
        thread.join();
      } catch (InterruptedException e) {
        System.out.println("Thread principal interrompida.");
      }
    }

    System.out.println("Todos os produtos foram cadastrados.");

    for(String produto : tabelaProdutos) {
      System.out.println("Produto cadastrado: " + produto);
    }
    
  }
}
