package thread;

public class RestauranteConcorrencia {
  
  public static void main(String[] args) {
    Thread cozinheiro1 = new Thread(new Cozinha("Preparar salada"));
    Thread cozinheiro2 = new Thread(new Cozinha("Preparar prato principal"));
    Thread cozinheiro3 = new Thread(new Cozinha("Preparar sobremesa"));

    cozinheiro1.start();
    cozinheiro2.start();
    cozinheiro3.start();
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
