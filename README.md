# Sistema de Folha de Pagamento em Java 💻

Projeto desenvolvido para a disciplina de **Algoritmos e Programação / Programação Orientada a Objetos (POO)** no curso de **Ciência da Computação**.

O sistema permite cadastrar diferentes tipos de funcionários e gerar uma folha de pagamento simples utilizando conceitos básicos de Java e orientação a objetos.

---

# 📌 Funcionalidades

O programa possui um menu interativo no terminal com as seguintes opções:

```text
1 - Cadastrar Funcionário Padrão
2 - Cadastrar Funcionário Comissionado
3 - Cadastrar Funcionário Produção
4 - Gerar Folha de Pagamento
0 - Sair do Programa
```

---

# 👨‍💼 Tipos de Funcionários

## Funcionário Padrão

Recebe apenas o salário base.

---

## Funcionário Comissionado

Recebe:
- salário base
- comissão sobre vendas

Fórmula:

```text
comissão = vendas * (percentual / 100)
```

---

## Funcionário Produção

Recebe:
- salário base
- bônus por produtividade

Fórmula:

```text
bônus = quantidadePeças * valorPorPeça
```

---

# 🧠 Conceitos Aplicados

Durante o desenvolvimento foram utilizados conceitos fundamentais de Java:

- Estrutura de decisão (`switch`)
- Estrutura de repetição (`do while`)
- Classes e Objetos
- Herança
- Polimorfismo
- Sobrescrita de métodos (`@Override`)
- Encapsulamento básico
- `ArrayList`
- Entrada de dados com `Scanner`

---

# 🛠️ Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)

IDEs recomendadas:
- IntelliJ IDEA
- NetBeans
- Eclipse

---

# 📂 Estrutura do Projeto

```text
Main.java
```

O projeto foi desenvolvido em um único arquivo para facilitar a execução e o aprendizado durante o primeiro semestre.

---

# ▶️ Como Executar

1. Abra o projeto em uma IDE Java
2. Execute o arquivo:

```text
Main.java
```

3. Utilize o menu no terminal.

---

# 💰 Exemplo de Saída

```text
===== FOLHA DE PAGAMENTO =====

Total de pessoas cadastradas: 3

Nome: Flavio
Matrícula: 123
Salário Base: 2000.0
Salário Final: 2000.0

Nome: Maria
Matrícula: 234
Salário Base: 2000.0
Comissão: 400.0
Salário Final: 2400.0

Nome: Paulo
Matrícula: 456
Salário Base: 2000.0
Produtividade: 150.0
Salário Final: 2150.0
```

---

# 🎯 Objetivo do Projeto

O principal objetivo deste projeto foi praticar:

- lógica de programação
- organização de código
- orientação a objetos
- manipulação de listas
- cálculo de salários
- estruturação de menus interativos

---
