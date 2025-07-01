# ⚠️ Exercício – Tratamento de Exceções

## 🧠 Objetivo

Aprender a utilizar **blocos `try-catch`** para capturar exceções em tempo de execução e entender o uso do bloco `finally`.

---

## 📌 Instruções

Crie uma classe chamada `DivisaoSegura` que:

1. Peça dois números inteiros ao usuário (pode simular com valores fixos).
2. Realize a divisão entre eles.
3. Use um bloco `try-catch` para capturar possíveis exceções, como:
   - `ArithmeticException` → divisão por zero
   - `NumberFormatException` → caso use `parseInt` com texto inválido
4. Use um bloco `finally` para exibir a mensagem:

   `"Operação finalizada."`

---

## 👨‍💻 Exemplo de estrutura básica

```java
java
CopiarEditar
public class DivisaoSegura {
    public static void main(String[] args) {
        String valor1 = "10";
        String valor2 = "0";

        try {
            int num1 = Integer.parseInt(valor1);
            int num2 = Integer.parseInt(valor2);
            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero.");
        } catch (NumberFormatException e) {
            System.out.println("Erro: formato inválido.");
        } finally {
            System.out.println("Operação finalizada.");
        }
    }
}

```

---

## ✅ Resultado Esperado (com valor2 = "0")

```
makefile
CopiarEditar
Erro: divisão por zero.
Operação finalizada.

```

---

## 💡 Dica

- Use `try` quando um trecho do código **pode lançar uma exceção**.
- Use `catch` para **tratar o erro** sem quebrar o programa.
- O bloco `finally` sempre será executado, **mesmo se der erro ou não**.
