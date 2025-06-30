# 🔄 Exercício – Contador Regressivo com `while`

---

### 📝 Descrição

Você vai criar um programa que faz uma contagem regressiva a partir de um número definido no código. A contagem deve ir até 1 e utilizar a estrutura `while`.

---

### 🎯 Objetivos

- Praticar a estrutura de repetição `while`
- Reforçar lógica com decremento
- Trabalhar com controle de fluxo sem entrada do usuário

---

### 🧱 Requisitos

**1.** Crie uma classe chamada `ContadorRegressivo`.

**2.** No método `main`, defina uma variável `numero` com valor inicial (por exemplo, `5`):

```java
int numero = 5;

```

**3.** Use um laço `while` para imprimir os valores de `numero` até 1, um por linha.

---

### ✅ Exemplo de saída esperada

Para `numero = 5`:

```
5
4
3
2
1

```

---

### 💡 Dica

Use o `while` com a seguinte estrutura:

```java
while (numero >= 1) {
    System.out.println(numero);
    numero--; // ou numero = numero - 1;
}

```

---

### 🌟 Desafio Extra

- Após terminar a contagem, exiba a mensagem:

```
Fim da contagem!

```

---
