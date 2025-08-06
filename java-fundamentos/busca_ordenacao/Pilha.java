package busca_ordenacao;

public class Pilha {
  public static void main(String[] args) {
    Pilha pilha = new Pilha(5);
    
    pilha.push(10);
    pilha.push(20);
    pilha.push(30);
    pilha.push(40);
    pilha.push(50);
    
    System.out.println("Topo da pilha: " + pilha.peek()); // 30
    System.out.println("Tamanho da pilha: " + pilha.size()); // 3
    
    System.out.println("Removendo elemento: " + pilha.pop()); // 30
    System.out.println("Tamanho da pilha após remoção: " + pilha.size()); // 2
    
    while (!pilha.isEmpty()) {
      System.out.println("Removendo elemento: " + pilha.pop());
    }
    
    System.out.println("Pilha vazia? " + pilha.isEmpty()); // true
  }
  int tamanho = 0;
  int topo = -1;

  int[] elementos;

  public Pilha(int tamanho) {
    this.tamanho = tamanho;
    this.elementos = new int[tamanho];
  }

  public boolean isEmpty() {
    return topo == -1;
  }

  public boolean isFull() {
    return topo == tamanho - 1;
  }

  public void push(int elemento) {
    if (isFull()) {
      throw new RuntimeException("Pilha cheia");
    }
    elementos[++topo] = elemento;
  }

  public int pop() {
    if (isEmpty()) {
      throw new RuntimeException("Pilha vazia");
    }
    return elementos[topo--];
  }

  public int peek() {
    if (isEmpty()) {
      throw new RuntimeException("Pilha vazia");
    }
    return elementos[topo];
  }

  public int size() {
    return topo + 1;
  }
}
