# 🚗 Exercício de Classe e Objeto – `Carro`

## 🧠 Objetivo

Praticar a criação de **classe**, **atributos públicos**, **métodos** e a **instanciação de objetos** em Java.

---

## 📌 Instruções

Crie uma classe chamada `Carro` com os seguintes elementos:

### 🔧 Atributos (todos públicos):

- `marca` (String)
- `modelo` (String)
- `ano` (int)
- `velocidade` (int) – deve começar com 0

### 🛠️ Métodos:

- `acelerar()`: aumenta a velocidade em 10.
- `frear()`: reduz a velocidade em 10. A velocidade não pode ser menor que 0.
- `exibirInformacoes()`: imprime todos os atributos do carro.

---

## 🧪 Exemplo de uso no `main`

```java
java
CopiarEditar
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Volkswagen";
        carro1.modelo = "Gol";
        carro1.ano = 2015;

        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();

        carro1.exibirInformacoes();
    }
}

```

---

## ✅ Resultado Esperado
