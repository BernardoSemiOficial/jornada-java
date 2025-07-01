# 🧺 Exercício – Trabalhando com `ArrayList` e `LinkedList`

## 🧠 Objetivo

Entender como utilizar as classes **`ArrayList`** e **`LinkedList`** para armazenar e manipular listas dinâmicas em Java, observando o uso básico de ambas.

---

## 📌 Instruções

Crie uma classe chamada `ListaDeCompras` que:

1. Crie uma `ArrayList<String>` chamada `comprasArray`.
2. Crie uma `LinkedList<String>` chamada `comprasLinked`.
3. Adicione os seguintes itens em **ambas** as listas:
   - "Arroz"
   - "Feijão"
   - "Macarrão"
   - "Leite"
   - "Café"
4. Remova o item "Macarrão" de ambas as listas.
5. Exiba o conteúdo das duas listas após a remoção.
6. Imprima o tempo de execução para adicionar e remover os itens em cada lista (usando `System.nanoTime()`).

---

## 👨‍💻 Exemplo de estrutura básica

```java
import java.util.ArrayList;
import java.util.LinkedList;

public class ListaDeCompras {
    public static void main(String[] args) {
        ArrayList<String> comprasArray = new ArrayList<>();
        LinkedList<String> comprasLinked = new LinkedList<>();

        // Adicionar itens
        // Remover "Macarrão"
        // Exibir conteúdo das listas
        // Medir tempo com System.nanoTime()
    }
}

```

---

## ✅ Resultado Esperado (exemplo simplificado)

```yaml
ArrayList: [Arroz, Feijão, Leite, Café]
LinkedList: [Arroz, Feijão, Leite, Café]

Tempo ArrayList: 13200 ns
Tempo LinkedList: 10400 ns
```

> Os tempos vão variar a cada execução, mas o importante é mostrar como medir e comparar.

---

## 💡 Dica

- `ArrayList` é mais rápido para leitura sequencial.
- `LinkedList` costuma ter melhor desempenho em inserções/remoções no início da lista.
- Este exercício mostra o **uso igual** das duas listas, ideal para introdução.
