# Sprint1-monitoramento-vegetacao
Sistema de monitoramento e priorização de vegetação em rodovias desenvolvido em Java com Programação Orientada a Objetos.

# Integrantes 👤
Ana Luiza Santos Bertão RM 563171

Gisleine Muñoz Ticona RM 563804

Larissa Machado Silva RM564168

Raira de Teves Costa RM RM564850

Sofia Bill Franken RM RM562767


# Sprint 1 - Monitoramento de Vegetação em Rodovias

## Descrição

Sistema desenvolvido em Java para monitoramento de vegetação em trechos rodoviários.

O projeto simula o crescimento da vegetação em diferentes trechos da rodovia e associa equipes de manutenção para áreas críticas.

## Conceitos aplicados

- Classes e Objetos
- Métodos e Comportamentos
- Encapsulamento
- Getters e Setters
- Associação entre objetos
- Clean Code

## Tecnologias

- Java
- Eclipse IDE

## Estrutura do Projeto

- Main.java
- TrechoRodovia.java
- EquipeManutencao.java

## Perguntas de Reflexão

### 1. Por que `TrechoRodovia` é uma classe e "BR-116 KM 10 ao 15" é um objeto?

`TrechoRodovia` é uma classe porque representa um modelo genérico de trecho rodoviário, definindo características e comportamentos que todos os trechos podem possuir. Já "BR-116 KM 10 ao 15" é um objeto, pois é uma instância específica criada a partir dessa classe, com valores próprios para seus atributos.

No projeto, diferentes objetos da classe `TrechoRodovia` foram criados para representar trechos reais monitorados pelo sistema.

---

### 2. Como um método difere de uma função solta em programação estruturada?

Um método difere de uma função solta da programação estruturada porque ele pertence a um objeto e atua diretamente sobre os dados desse objeto.

No projeto, o método `registrarCrescimento()` altera o nível de vegetação de um trecho específico da rodovia, mantendo a organização e o encapsulamento do sistema.

---

### 3. Se o `nivelVegetacao` fosse público, que tipo de quebra no sistema poderia acontecer?

Se o atributo `nivelVegetacao` fosse público, qualquer parte do sistema poderia alterar seu valor sem validação. Isso poderia gerar dados incorretos, como valores negativos, comprometendo o monitoramento dos trechos e a identificação de áreas críticas para manutenção.

No contexto do projeto, isso afetaria relatórios e decisões da equipe responsável pela roçada da vegetação nas rodovias. O encapsulamento garante maior segurança e integridade dos dados do sistema.
