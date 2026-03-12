# Sistema de Cadastro de Alunos e Notas

Uma pequena escola ainda não possui um sistema digital para organizar as informações básicas dos alunos. Atualmente, o controle é feito manualmente, com anotações em papel ou planilhas simples, o que dificulta consultas rápidas, lançamento de notas e acompanhamento do desempenho da turma.

Pensando nisso, foi proposto o desenvolvimento de um programa em Java executado no terminal para ajudar no cadastro de alunos, no registro de notas e na visualização dos resultados.

Este projeto foi pensado para praticar os conteúdos básicos da linguagem Java já estudados até o momento, sem utilizar Programação Orientada a Objetos, sem `ArrayList`, sem banco de dados e sem múltiplas classes. Toda a lógica será desenvolvida de forma procedural, concentrada na classe `Main`.

---

## Objetivo

Desenvolver um sistema simples no terminal que permita:

- cadastrar alunos
- listar alunos cadastrados
- lançar notas
- calcular médias
- consultar boletim individual
- visualizar alunos aprovados e reprovados

---

## Requisitos Funcionais 

O sistema deve possuir as seguintes funcionalidades:

### 1. Cadastrar aluno

O usuário deverá informar o nome do aluno. O sistema deve armazenar esse nome em um array.

**Regras:**

- Não permitir cadastro com nome vazio.
- Deve existir um limite máximo de alunos.
- Ao atingir o limite do array, o sistema deve informar que não há mais espaço para novos cadastros.

---

### 2. Listar alunos cadastrados

O sistema deve exibir todos os alunos cadastrados até o momento.

As informações mínimas mostradas devem ser:

- Número/índice do aluno
- Nome do aluno

Se não houver alunos cadastrados, o sistema deve informar isso ao usuário.

---

### 3. Lançar notas

O usuário deve selecionar um aluno já cadastrado e informar:

- Nota 1
- Nota 2

Após isso, o sistema deverá calcular a média do aluno e armazenar o resultado.

**Regras:**

- Só pode lançar nota para aluno já cadastrado.
- As notas devem estar no intervalo de **0 a 10**.
- Se o usuário informar um valor inválido, o sistema deve avisar.

---

### 4. Consultar boletim de um aluno

O sistema deve permitir escolher um aluno e exibir:

- Nome
- Nota 1
- Nota 2
- Média
- Situação final

Se o aluno ainda não tiver notas lançadas, o sistema pode:

- Exibir as notas zeradas, ou
- Informar que as notas ainda não foram cadastradas.

O importante é que o comportamento seja claro para o usuário.

---

### 5. Mostrar alunos aprovados e reprovados

O sistema deve percorrer os alunos cadastrados e mostrar a situação de cada um com base na média.

Pode exibir, por exemplo:

- Nome do aluno
- Média
- Situação

Também é possível separar em dois grupos:

- Aprovados
- Reprovados

---

### 6. Encerrar sistema

O programa deve permitir que o usuário escolha a opção de sair. Ao sair, o sistema deve encerrar normalmente.

---

## Requisitos Não Funcionais

Além das funcionalidades, o projeto deve seguir alguns cuidados de organização:

- O menu deve ser claro e fácil de entender.
- As mensagens exibidas ao usuário devem ser objetivas.
- O código deve estar bem indentado.
- Os nomes das variáveis devem ser compreensíveis.
- O programa deve evitar erros por entrada inválida sempre que possível.

---

## Regras de Negócio

O projeto deve considerar as seguintes regras de negócio:

- O sistema terá capacidade máxima de **30 alunos**.
- Não será permitido cadastrar aluno com nome vazio.
- As notas devem estar entre **0 e 10**.
- A média deve ser calculada com base em **duas notas**.
- A situação final depende da média:
    - Média maior ou igual a **7,0** → **Aprovado**
    - Média menor que **7,0** → **Reprovado**
- Só devem aparecer nas listagens os alunos realmente cadastrados.
