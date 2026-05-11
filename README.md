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

## Pergunta de Reflexão

Se o atributo `nivelVegetacao` fosse público, qualquer parte do sistema poderia alterar seu valor sem validação. Isso poderia gerar dados incorretos, como valores negativos, comprometendo o monitoramento dos trechos e a identificação de áreas críticas para manutenção. No contexto do projeto, isso afetaria relatórios e decisões da equipe responsável pela roçada da vegetação nas rodovias. O encapsulamento garante maior segurança e integridade dos dados do sistema.
