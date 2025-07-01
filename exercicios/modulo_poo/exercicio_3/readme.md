# 🔐 Exercício – Modificadores em Java

## 🧠 Objetivo

Compreender e aplicar os diferentes **modificadores de acesso** e **modificadores de classe/método** em Java, analisando seus comportamentos e restrições.

---

## 📌 Instruções

Crie duas classes:

### 📦 1. Classe `Pessoa` (em outro arquivo ou no mesmo)

**Atributos:**

- `public String nome`
- `private int idade`
- `protected String cidade`
- (sem modificador) `String documento`

**Métodos:**

- `public void exibirNome()` → imprime o nome
- `private void exibirIdade()` → imprime a idade
- `protected void exibirCidade()` → imprime a cidade
- `void exibirDocumento()` → imprime o documento

---

### 🧪 2. Classe `Main`

No método `main`, crie um objeto `Pessoa` e tente acessar cada atributo e método.

⚠️ **Observe quais acessos funcionam e quais causam erro. Comente os que não forem possíveis.**

---

## 👨‍💻 Exemplo de uso no `main`

```java
ublic class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Ana";
        // p.idade = 30;          // Erro: idade é private
        p.cidade = "São Paulo";
        p.documento = "123456789";

        p.exibirNome();
        // p.exibirIdade();       // Erro: método privado
        p.exibirCidade();
        p.exibirDocumento();
    }
}

```

---

## ✅ Resultado Esperado (para os métodos permitidos)

```yaml
Nome: Ana
Cidade: São Paulo
Documento: 123456789
```

---

## 💡 Dica

Use esse exercício para entender:

- Quem pode acessar o quê.
- Diferença entre os modificadores em **atributos** e **métodos**.
- Como o Java restringe o acesso entre classes com base nesses modificadores.
