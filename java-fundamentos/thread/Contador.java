package thread;

public class Contador extends Thread {
  
  public static void main(String[] args) {
    Contador contador1 = new Contador("Thread 1", 100);
    Contador contador2 = new Contador("Thread 2", 100);
    Contador contador3 = new Contador("Thread 3", 100);

    contador1.setPriority(MIN_PRIORITY);
    contador2.setPriority(NORM_PRIORITY);
    contador3.setPriority(MAX_PRIORITY);''

    try {
      contador1.join();
      contador2.join();
      contador3.join();
      System.out.println("Threads finalizadas.");
    } catch (Exception err) {
      System.out.println("Thread interrompida.");
    }
  }
  String threadName;

  int delay;

  public Contador(String threadName, int delay) {
    this.threadName = threadName;
    this.delay = delay;
    start();
  }

  public void run() {
    for(int i = 1; i <= 10; i++) {
      System.out.println(threadName + ": " + i);

      try {
        Thread.sleep(delay);
      } catch (Exception err) {
        System.out.println(threadName + " interrompida.");
      }
    }
  }
}
