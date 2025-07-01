# ⚙️ Exercício – `static` e `final` em Java

## 🧠 Objetivo

Entender a diferença entre **atributos e métodos estáticos** (`static`) e de instância, além de aprender a declarar e utilizar **constantes** com `final`.

---

## 📌 Instruções

Crie uma classe chamada `MatematicaUtil` com:

### 🔧 Atributos e métodos:

- `public static final double PI = 3.14159;`
- `public static int dobrar(int numero)`: retorna o dobro do número
- `public int triplicar(int numero)`: retorna o triplo do número
- `public final void saudacao()`: imprime `"Bem-vindo à matemática!"`

---

## 👨‍💻 Classe `Main` de Teste

No método `main`, teste o uso dos métodos e atributos:

- Acesse o valor de `PI` diretamente pela classe.
- Chame o método `dobrar()` diretamente pela classe.
- Crie um objeto de `MatematicaUtil` para chamar `triplicar()` e `saudacao()`.

---

## 🧪 Exemplo de uso no `main`

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Valor de PI: " + MatematicaUtil.PI);
        System.out.println("Dobro de 4: " + MatematicaUtil.dobrar(4));

        MatematicaUtil util = new MatematicaUtil();
        System.out.println("Triplo de 4: " + util.triplicar(4));
        util.saudacao();
    }
}

```

---

## ✅ Resultado Esperado

```yaml
Valor de PI: 3.14159
Dobro de 4: 8
Triplo de 4: 12
Bem-vindo à matemática!

```

---

## 💡 Dica

- `static` pertence à classe, não ao objeto.
- `final` define algo que **não pode ser alterado** ou sobrescrito.
- Combinar `static` e `final` é o jeito padrão de declarar **constantes**.
