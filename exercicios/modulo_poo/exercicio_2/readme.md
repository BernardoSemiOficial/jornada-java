# 💡 Exercício – Abstração e Interface: `FormaGeometrica`

## 🧠 Objetivo

Praticar os conceitos de **abstração** e **interface** em Java, criando um contrato comum para formas geométricas e implementando comportamentos diferentes.

---

## 📌 Instruções

### 🧱 Interface: `Forma`

- Método `double calcularArea();`
- Método `double calcularPerimetro();`

---

### 📐 Classes que implementam a interface `Forma`:

1. **`Retangulo`**
   - Atributos públicos: `largura` (double), `altura` (double)
   - Implementa os métodos da interface:
     - Área: largura × altura
     - Perímetro: 2 × (largura + altura)
2. **`Circulo`**
   - Atributo público: `raio` (double)
   - Implementa os métodos da interface:
     - Área: π × raio²
     - Perímetro: 2 × π × raio

> Use Math.PI para o valor de π.

---

## 👨‍💻 Classe de teste (`main`):

Crie um `Retangulo` e um `Circulo`, atribua valores e imprima a área e o perímetro usando os métodos da interface.

---

## 🧪 Exemplo de uso no `main`

```java
java
CopiarEditar
public class Main {
    public static void main(String[] args) {
        Forma f1 = new Retangulo(5, 3);
        Forma f2 = new Circulo(2);

        System.out.println("Área do retângulo: " + f1.calcularArea());
        System.out.println("Perímetro do retângulo: " + f1.calcularPerimetro());

        System.out.println("Área do círculo: " + f2.calcularArea());
        System.out.println("Perímetro do círculo: " + f2.calcularPerimetro());
    }
}

```

---

## ✅ Resultado Esperado (valores aproximados)

```yaml
arduino
CopiarEditar
Área do retângulo: 15.0
Perímetro do retângulo: 16.0
Área do círculo: 12.566...
Perímetro do círculo: 12.566...

```

---

## 💡 Dica

Interfaces ajudam a definir **contratos** que diferentes classes podem seguir. Isso promove flexibilidade e desacoplamento entre as partes do sistema.
