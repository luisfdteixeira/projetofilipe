# Projeto "Sistema de Venda"

### Aluno: Luís Fernando Dias Teixeira - 6º P. Sistemas de Informação - Noturno

Projeto criado para entrega do trabalho do Filipe Guelber (16-10-2017).

Para elaboração desse trabalho foram usados 4 patterns, sendo eles:
```
Factory
```
```
Template
```
```
Builder
```
```
Strategy
```
  O Factory foi usado para a criação dos produtos e seus diferentes tipos. Nesse caso, os produtos vendidos são Churros de Chocolate e Churros de Doce de Leite. A factory proporciona baixo acoplamento e maior flexibilidade. Um ponto negativo é o número grande de classes que devem ser criadas.
  O Template foi usado para emitir os recibos de venda. No projeto existem dois tipos de recibo, sendo eles modelo 1 e modelo 2, e o template possibilita você escolher entre esses modelos. O Template é usado porque ao emitir um recibo a parte que efetua a busca e os cálculos de preço é igual em ambos os modelos, portanto esses métodos ficam na superclasse. A única parte que muda é a forma de exportar para determinado modelo.
  Builder foi usado para efetuar o cadastro do cliente e seus dados (Nome, Data de Nascimento e Endereço de Entrega). O Builder é um pattern que auxilia no entendimento do código.
  Por último, foi usado o Strategy. O Strategy foi usado na seleção da forma de pagamento. Para efetuar o pagamento você pode selecionar a forma de pagamento dinheiro ou a forma de pagamento cartão de crédito. O Strategy é usado para permitir que a forma de pagamento seja alterada em tempo de execução. Ao selecionar determinada forma de pagamento, uma mensagem é mostrada avisando da seleção. No main coloquei duas seleções, uma após a outra, pra mostrar esse aviso.
  
