#language:pt
@pagamento
Funcionalidade: Pagamento

  Contexto:
    Dado que esteja na pagina de login
    Quando for realizado login com os seguintes dados
      | email | teste@chronosacademy.com.br |
      | senha | 123456                      |
    Entao valido que exibe a tabela de produtos

  Cenario: Realizar compra de curso
    Quando seleciono o pacote de cursos
    E clico em ir para pagamento
    E seleciono a opcao cartao de credito
    E realizo a compra com os seguintes dados
      | numeroCartao | 5396647383776696 |
      | vencimento   | 06/2026          |
      | cvv          | 598              |
      | nomeTitular  | Titular Teste    |
      | cpfTitular   | 42444402081      |
  Entao valido que foi exibido a mensagem "Pagamento Realizado!"