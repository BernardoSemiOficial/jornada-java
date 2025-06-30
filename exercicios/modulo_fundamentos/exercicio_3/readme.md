# 🎚️ Exercício – Calculadora de Dias da Semana com `switch`

---

### 📝 Descrição

Você vai criar um programa que recebe um número de 1 a 7 e imprime o **dia da semana** correspondente. Para isso, deverá usar a estrutura `switch` do Java.

---

### 🎯 Objetivos

- Praticar a estrutura condicional `switch`
- Trabalhar com `int` e `String`
- Entender o funcionamento de `case`, `break` e `default`

---

### 🧱 Requisitos

**1.** Crie uma classe chamada `DiasDaSemana` com o método `main`.

**2.** Dentro do `main`, declare uma variável `dia` do tipo `int` e atribua um valor de 1 a 7:

```java
int dia = 3;

```

**3.** Use uma estrutura `switch` para imprimir o nome do dia da semana com base no valor da variável `dia`.

---

### 🧠 Regras do `switch`

- Se o número for **1**, imprimir: `Domingo`
- Se **2**, imprimir: `Segunda-feira`
- Se **3**, imprimir: `Terça-feira`
- Se **4**, imprimir: `Quarta-feira`
- Se **5**, imprimir: `Quinta-feira`
- Se **6**, imprimir: `Sexta-feira`
- Se **7**, imprimir: `Sábado`
- Para qualquer outro número, imprimir: `Valor inválido. Digite um número de 1 a 7.`

---

### ✅ Exemplo de saída

**Para `dia = 3`:**

```
Terça-feira

```

**Para `dia = 8`:**

```
Valor inválido. Digite um número de 1 a 7.

```

---

### 🌟 Desafio Extra

- Trate casos inválidos (números negativos, maiores que 7, etc.)

---

### 💡 Dica

Lembre-se de usar `break` após cada `case` para evitar que os próximos blocos sejam executados!
