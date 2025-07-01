# 🐾 Exercício – Herança e Polimorfismo: `Animal`

## 🧠 Objetivo

Praticar os conceitos de **herança** (extends) e **polimorfismo** (métodos sobrescritos) em Java.

---

## 📌 Instruções

Crie uma estrutura de classes baseada no mundo animal.

### 🐶 Classe base: `Animal`

**Atributos:**

- `nome` (String)
- `idade` (int)

**Método:**

- `fazerSom()`: imprime uma mensagem genérica, como `"O animal faz um som."`

---

### 🐕 Subclasses que herdam de `Animal`:

1. **`Cachorro`**
   - Sobrescreve o método `fazerSom()` para imprimir `"O cachorro late."`
2. **`Gato`**
   - Sobrescreve o método `fazerSom()` para imprimir `"O gato mia."`

---

### 👨‍💻 Classe de teste (`main`):

Crie um array ou lista de `Animal`, com objetos `Cachorro` e `Gato`, e chame o método `fazerSom()` para cada um.

---

## 🧪 Exemplo de uso no `main`

```java
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        a1.nome = "Rex";
        a1.idade = 3;

        Animal a2 = new Gato();
        a2.nome = "Mimi";
        a2.idade = 2;

        a1.fazerSom();  // Deve imprimir: O cachorro late.
        a2.fazerSom();  // Deve imprimir: O gato mia.
    }
}

```

---

## ✅ Resultado Esperado

```
mathematica
CopiarEditar
O cachorro late.
O gato mia.

```

---

## 💡 Dica

O poder do polimorfismo está em **tratar diferentes tipos específicos como se fossem o tipo genérico**, e ainda assim obter comportamentos diferentes.
