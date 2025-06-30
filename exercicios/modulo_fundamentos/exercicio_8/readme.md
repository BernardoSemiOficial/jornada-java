# 🎒 Exercício de Encapsulamento – `Aluno`

## 🧠 Objetivo

Praticar o conceito de **encapsulamento**, utilizando **atributos privados** e métodos públicos (`get` e `set`) para controlar o acesso aos dados da classe.

---

## 📌 Instruções

Crie uma classe chamada `Aluno` com os seguintes atributos **privados**:

### 🔐 Atributos:

- `nome` (String)
- `matricula` (String)
- `nota` (double)

### 🛠️ Métodos públicos:

- `getNome()` e `setNome(String nome)`
- `getMatricula()` e `setMatricula(String matricula)`
- `getNota()` e `setNota(double nota)` → **só aceite valores entre 0.0 e 10.0**
- `exibirInformacoes()`: exibe os dados do aluno formatados.

---

## 👨‍💻 Exemplo de uso no `main`

```java
java
CopiarEditar
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Maria Oliveira");
        aluno.setMatricula("A123");
        aluno.setNota(8.5);

        aluno.exibirInformacoes();
    }
}

```

---

## ✅ Resultado Esperado

```yaml
Nome: Maria Oliveira
Matrícula: A123
Nota: 8.5
```

> Se alguém tentar definir a nota como -1 ou 11, a nota não deve ser alterada.

---

## 💡 Dica

Use o encapsulamento para **proteger os dados** e garantir que só valores válidos sejam atribuídos.
