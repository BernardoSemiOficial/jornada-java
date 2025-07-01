# 🗺️ Exercício – Trabalhando com `Map`

## 🧠 Objetivo

Praticar o uso da interface **`Map`** em Java, entendendo como armazenar, acessar, atualizar e remover **pares chave-valor** com `HashMap`.

---

## 📌 Instruções

Crie uma classe chamada `EstoqueProdutos` que:

1. Crie um `HashMap<String, Integer>` chamado `estoque`, onde:
   - A **chave** representa o nome do produto (String).
   - O **valor** representa a quantidade em estoque (Integer).
2. Adicione os seguintes produtos ao mapa:
   - "Arroz" → 10
   - "Feijão" → 5
   - "Macarrão" → 8
   - "Café" → 3
3. Faça o seguinte:
   - Atualize a quantidade de "Feijão" para 7.
   - Remova o produto "Café".
   - Verifique se "Arroz" está no estoque.
   - Imprima todos os produtos e suas quantidades usando um `for` com `entrySet()`.

---

## 👨‍💻 Exemplo de estrutura básica

```java
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();

        // Adicionar produtos
        // Atualizar quantidade
        // Remover item
        // Verificar existência
        // Iterar sobre o mapa
    }
}

```

---

## ✅ Resultado Esperado

```yaml
Produto encontrado: Arroz
Lista de produtos no estoque:
Arroz - 10 unidades
Feijão - 7 unidades
Macarrão - 8 unidades

```

---

## 💡 Dica

- Use `put()` para adicionar ou atualizar.
- Use `containsKey()` para verificar se uma chave existe.
- Use `entrySet()` para percorrer o mapa de forma eficiente.
