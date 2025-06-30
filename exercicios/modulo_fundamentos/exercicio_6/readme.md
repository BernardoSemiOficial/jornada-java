# 🔁 Exercício – Contador Progressivo com `do-while`

---

### 📝 Descrição

Você vai criar um programa que conta de 1 até 5 usando a estrutura `do-while`. Esse exercício ajuda a entender que o `do-while` **sempre executa pelo menos uma vez**, mesmo que a condição seja falsa no início.

---

### 🎯 Objetivos

- Praticar a estrutura de repetição `do-while`
- Compreender a diferença entre `while` e `do-while`
- Trabalhar com incremento e controle de fluxo

---

### 🧱 Requisitos

**1.** Crie uma classe chamada `ContadorProgressivo`.

**2.** No método `main`, crie uma variável `contador` iniciando com o valor `1`.

```java
int contador = 1;

```

**3.** Use um laço `do-while` para imprimir os números de 1 até 5, um por linha.

---

### ✅ Exemplo de saída esperada

```
1
2
3
4
5

```

---

### 💡 Dica

Use a estrutura abaixo:

```java
do {
    System.out.println(contador);
    contador++;
} while (contador <= 5);

```

---

### 🌟 Desafio Extra

Altere o valor inicial de `contador` para 10. O que acontece?

**Explique por que o número 10 ainda é impresso mesmo que a condição seja falsa desde o início.**

---
