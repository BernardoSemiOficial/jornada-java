package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RestauranteParalelismo {
  
  public static void main(String[] args) {
    ExecutorService exec = Executors.newFixedThreadPool(3);

    exec.execute(new Cozinha("Preparar salada"));
    exec.execute(new Cozinha("Preparar prato principal"));
    exec.execute(new Cozinha("Preparar sobremesa"));
  }
}

class Cozinha implements Runnable {
  String tarefa;

  public Cozinha(String tarefa) {
    this.tarefa = tarefa;
  }

  @Override
  public void run() {
    String threadName = Thread.currentThread().getName();
    System.out.println(threadName + " iniciando a tarefa: " + tarefa);
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      System.out.println(threadName + " foi interrompida.");
    }
    System.out.println(threadName + " finalizou a tarefa: " + tarefa);
  }
}
