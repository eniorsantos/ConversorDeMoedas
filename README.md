# Conversor de Moedas 
Projeto Final do curso de Java e Orientação a Objetos G7 - ONE

## 🚀 Começando
Para a implementação do projeto foi utlitizado  a IDE IntelliJ IDEA Community Edition, 
a Biblioteca externa Gson e API ExchangeRate e Java 21

O Projeto foi dividido em 5 pacotes

### Cálculco

Com as classe de conversão

### Conexão

Contémm a classe de conexão

### Menu

Contémm a classe para criação o menu

### Modelos

Contém as classes para criação dos objetos principais: Cotação, Moeda e SalvarHist.

### Útil

O pacote Útil contém a classe para a leitura das variaveis de ambiente.

### Classe Main
A classe Main contém apenas a instancia do Menu Iniciar da aplicação.

![image](https://github.com/user-attachments/assets/f8592b03-a202-4c7b-b371-2a1405cb82fc)

## Objetivo

A função do programa é converter uma moeda em outra de acordo com a contação do dia atravês da conexão com  a API ExchangeRate.
Com a requisição recebida em formato json, deserializamos a biblioteca externa Gson, extraimos a cotação referente a escolha do 
usuário e devolvemos o valor convertido.
Ao finalizar o programa salvamos o historico de conversões em arquivo serializado para o formado json e imprimos em tela.






