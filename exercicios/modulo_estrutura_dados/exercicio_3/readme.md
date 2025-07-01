# 🌳 Exercício – Trabalhando com `HashSet` e `TreeSet`

## 🧠 Objetivo

Praticar o uso das classes **`HashSet`** e **`TreeSet`**, entendendo como funcionam em relação à **ordenação** e **armazenamento de elementos únicos**.

---

## 📌 Instruções

Crie uma classe chamada `ConjuntosDeNomes` que:

1. Crie um `HashSet<String>` chamado `nomesHash`.
2. Crie um `TreeSet<String>` chamado `nomesTree`.
3. Adicione os seguintes nomes em **ambos os conjuntos**:
   - "Ana"
   - "Carlos"
   - "Beatriz"
   - "Ana" (nome repetido)
   - "Eduardo"
   - "Daniela"
4. Exiba os elementos de cada conjunto no console.
5. Mostre claramente que:
   - Elementos **duplicados não são adicionados**.
   - O `TreeSet` mantém os elementos em **ordem alfabética**.
   - O `HashSet` **não garante ordem**.

---

## 👨‍💻 Exemplo de estrutura básica

```java
import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntosDeNomes {
    public static void main(String[] args) {
        HashSet<String> nomesHash = new HashSet<>();
        TreeSet<String> nomesTree = new TreeSet<>();

        // Adicionar nomes nos dois conjuntos...

        System.out.println("HashSet: " + nomesHash);
        System.out.println("TreeSet: " + nomesTree);
    }
}

```

---

## ✅ Resultado Esperado (exemplo)

```yaml
HashSet: [Carlos, Eduardo, Ana, Beatriz, Daniela]
TreeSet: [Ana, Beatriz, Carlos, Daniela, Eduardo]
```

> A ordem do HashSet pode variar.
>
> O nome "Ana" só aparece uma vez, mesmo tendo sido adicionado duas vezes.

---

## 💡 Dica

- `HashSet` é **mais rápido**, mas **não ordena**.
- `TreeSet` mantém os elementos em **ordem natural**, mas é um pouco **mais lento**.
- Ambos garantem que **não existam elementos duplicados**.
