#language:pt

Funcionalidade:  Login

  Cenario: Realizar login válido
    Dado que esteja na pagina de login
    Quando for realizado login com os seguintes dados
      | email | teste@chronosacademy.com.br |
      | senha | 123456                      |
    Entao valido que exibe a tabela de produtos