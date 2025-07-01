# 📦 Exercício – Trabalhando com Wrapper Classes

## 🧠 Objetivo

Compreender o uso das **wrapper classes** em Java e praticar a conversão entre **tipos primitivos** e **objetos**, além de utilizar métodos utilitários das wrappers.

---

## 📌 Instruções

Crie uma classe chamada `ConversaoWrapper` que:

1. Crie as seguintes variáveis usando wrapper classes:
   - `Integer numero = 42;`
   - `Double preco = 19.99;`
   - `Boolean ativo = true;`
2. Faça as seguintes operações:
   - Converta `numero` para `String` e imprima.
   - Converta `preco` para `int` e imprima.
   - Converta `ativo` para `String` e imprima.
   - Some `numero` com 10 (auto unboxing + soma).
   - Compare dois `Integer` com `.equals()`.

---

## 👨‍💻 Exemplo de estrutura básica

```java
public class ConversaoWrapper {
    public static void main(String[] args) {
        Integer numero = 42;
        Double preco = 19.99;
        Boolean ativo = true;

        // Conversões e operações aqui
    }
}

```

---

## ✅ Resultado Esperado

```yaml
Número como string: 42
Preço como inteiro: 19
Ativo como string: true
Soma: 52
Comparação: true
```

> Para a comparação, use: Integer outroNumero = 42; numero.equals(outroNumero)

---

## 💡 Dica

- Wrappers permitem usar métodos úteis como `intValue()`, `toString()`, `parseInt()` etc.
- Também são importantes quando usamos coleções (`List`, `Map`, etc.), já que **não aceitam tipos primitivos**.
