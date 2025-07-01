# 🔤 Exercício – Manipulação de Strings

## 🧠 Objetivo

Praticar as principais operações com **strings em Java**, como: comparação, transformação, extração e substituição de trechos.

---

## 📌 Instruções

Crie uma classe chamada `AnaliseTexto` que:

1. Crie uma variável `String frase = " Java é uma linguagem poderosa! "`.
2. Realize as seguintes operações e imprima os resultados:
   - a) Remova os espaços do início e do fim da frase.
   - b) Converta a frase para letras maiúsculas.
   - c) Verifique se a frase contém a palavra `"linguagem"`.
   - d) Substitua `"Java"` por `"C++"`.
   - e) Mostre quantos caracteres a frase tem (sem os espaços nas pontas).
   - f) Imprima a palavra "poderosa!" isoladamente (use `substring` e `indexOf`).

---

## 👨‍💻 Exemplo de estrutura básica

```java
public class AnaliseTexto {
    public static void main(String[] args) {
        String frase = "  Java é uma linguagem poderosa!  ";

        // Aplicar operações aqui
    }
}

```

---

## ✅ Resultado Esperado (exemplo)

```yaml
lua
CopiarEditar
Frase sem espaços: Java é uma linguagem poderosa!
Em maiúsculas: JAVA É UMA LINGUAGEM PODEROSA!
Contém "linguagem"? true
Substituída: C++ é uma linguagem poderosa!
Total de caracteres (sem espaços nas pontas): 33
Última palavra: poderosa!

```

---

## 💡 Dica

Métodos úteis:

- `trim()`, `toUpperCase()`, `contains()`, `replace()`, `length()`, `substring()`, `indexOf()`, `lastIndexOf()`
