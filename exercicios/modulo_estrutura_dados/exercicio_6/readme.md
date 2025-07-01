# 🧱 Exercício – Trabalhando com `StringBuilder`

## 🧠 Objetivo

Praticar o uso da classe **`StringBuilder`** em Java, aplicando métodos para **construção eficiente de strings**, além de operações como inserção, remoção e inversão.

---

## 📌 Instruções

Crie uma classe chamada `MontadorDeMensagem` que:

1. Crie um objeto `StringBuilder` chamado `mensagem`.
2. Adicione os seguintes textos **em sequência**:
   - "Olá, "
   - "meu nome é "
   - "João."
3. Altere o nome de "João" para "Carlos".
4. Insira a palavra "tudo bem? " no início da frase.
5. Inverta o conteúdo final da `mensagem`.
6. Imprima o conteúdo final da `StringBuilder`.

---

## 👨‍💻 Exemplo de estrutura básica

```java

public class MontadorDeMensagem {
    public static void main(String[] args) {
        StringBuilder mensagem = new StringBuilder();

        // Adicionar partes do texto
        // Substituir "João" por "Carlos"
        // Inserir no início
        // Inverter
        // Imprimir
    }
}

```

---

## ✅ Resultado Esperado (invertido)

```
.ocslraC é em onem uem ,álO ?meb odut

```

---

## 💡 Dica

- Para substituir o nome, você pode usar `replace(início, fim, "Carlos")`.
- Para inserir no início, use `insert(0, "texto")`.
- Para inverter, use `reverse()`.
- Para saber onde começa "João", use `indexOf("João")`.
