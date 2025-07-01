# 🚫 Exercício – Criando e Lançando Exceção Personalizada

## 🧠 Objetivo

Praticar a criação e o uso de **exceções personalizadas** em Java, utilizando `throw` e `throws` para sinalizar e tratar erros específicos da regra de negócio.

---

## 📌 Instruções

1. Crie uma exceção personalizada chamada `IdadeInvalidaException`, que herda de `Exception`.
   - No construtor, aceite uma mensagem personalizada.
2. Crie uma classe `CadastroPessoa` com um método:

   ```java

   public static void cadastrarPessoa(String nome, int idade) throws IdadeInvalidaException

   ```

   - Se a idade for menor que 0 ou maior que 130, lance a `IdadeInvalidaException`.
   - Caso contrário, imprima: `"Pessoa cadastrada com sucesso: [nome], [idade] anos"`.

3. No `main`, chame `cadastrarPessoa()` com um valor inválido e **trate a exceção no `try-catch`**.

---

## 👨‍💻 Estrutura esperada

```java

public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

```

```java

public class CadastroPessoa {
    public static void cadastrarPessoa(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 130) {
            throw new IdadeInvalidaException("Idade inválida: " + idade);
        }
        System.out.println("Pessoa cadastrada com sucesso: " + nome + ", " + idade + " anos");
    }
}

```

```java

public class Main {
    public static void main(String[] args) {
        try {
            CadastroPessoa.cadastrarPessoa("Carlos", -5);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro ao cadastrar pessoa: " + e.getMessage());
        }
    }
}

```

---

## ✅ Resultado Esperado

```

Erro ao cadastrar pessoa: Idade inválida: -5

```

---

## 💡 Dica

- Use `throw` para **lançar** a exceção.
- Use `throws` na assinatura do método para **informar que ele pode lançar**.
- Exceções personalizadas ajudam a **tratar regras específicas** de negócio com clareza.
