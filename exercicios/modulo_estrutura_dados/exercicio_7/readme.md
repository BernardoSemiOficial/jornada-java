# 🔁 Exercício – Trabalhando com `Iterator`

---

## 🧠 Objetivo

Praticar o uso da interface **`Iterator`** em Java para **percorrer** e **remover elementos** de uma coleção de forma segura durante a iteração.

---

## 📌 Instruções

Crie uma classe chamada `RemocaoDeNumeros` que:

1. Crie um `List<Integer>` chamado `numeros` (pode ser `ArrayList`).
2. Adicione os seguintes valores: `2, 5, 8, 3, 10, 1, 7, 4`.
3. Use um `Iterator` para remover todos os números **menores que 5**.
4. Após a remoção, exiba todos os números restantes na lista.

---

## 👨‍💻 Exemplo de estrutura básica

```java

import java.util.*;

public class RemocaoDeNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 2, 5, 8, 3, 10, 1, 7, 4);

        // Use Iterator aqui
    }
}

```

---

## ✅ Resultado Esperado

```
Números restantes: [5, 8, 10, 7]

```

---

## 💡 Dica

- Use `Iterator<Integer> it = numeros.iterator();`
- Para remover, utilize `it.remove()` dentro do `while (it.hasNext())`
- Nunca use `for-each` com `remove()`, pois causará `ConcurrentModificationException`.
