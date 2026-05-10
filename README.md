# 🕵️‍♂️📦Missão Suprimentos - InterFatecs 2025(Problema F)

## 📜 Sobre o Projeto
Este repositório contém a solução em **Java** para o problema de lógica e otimização de algoritmos "Suprimentos de Campo", ambientado no conflito fictício entre os Sneakys e a gloriosa República da Esbórnia.

O desafio consiste em calcular a **menor quantidade inicial de suprimentos** necessária para que o espião Joãozinho 001 conclua sua missão sem nunca ficar com um saldo negativo de recursos, baseando-se em uma série de eventos de ganhos e perdas.

## 🧠 Lógica e Otimização
A solução implementada foca em eficiência. O algoritmo foi projetado com uma complexidade de tempo linear **$O(n)$**. 

Em vez de testar múltiplos valores iniciais usando força bruta (tentativa e erro), o programa percorre a lista de eventos uma única vez simulando um saldo inicial de zero. Durante essa iteração, ele rastreia qual foi o "fundo do poço" (o menor saldo atingido). O valor absoluto desse menor saldo negativo dita exatamente a reserva inicial necessária para que a missão nunca falhe.

## 💡 Estrutura de Entrada e Saída
* **Entrada:** A primeira linha recebe um inteiro `n` indicando o número de eventos. As `n` linhas subsequentes contêm números inteiros onde valores `> 0` representam a chegada de suprimentos e `< 0` representam o consumo.
* **Saída:** Um único número inteiro que representa o recurso mínimo inicial exigido.

## 📥 Exemplo de Entrada

```text
3
3
-5
3
```
## 📥 Exemplo de Saída

```text
2
```
