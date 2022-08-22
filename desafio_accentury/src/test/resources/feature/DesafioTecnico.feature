@DesafioTecnico
Feature: Desafio 

  Scenario Outline: Preencher formulário no sistema sampleapp
    Given que estou na tela inicial do sistema sampleapp
    And preencher o formulário Enter Vehicle Data 
    And clicar no botão next
    And preencher o formulário, aba Enter Insurant Data
    And clicar no botão next aba Enter Innsurante Data
    And preencher o formulário, aba Enter Product Data
    And clicar no botão next aba Enter Product Data
    And preencher o formulário, aba Select Price Option
    And clicar no botão next aba Select Price Option
    And preencher o formulário, aba Send Quote
    When clicar no botão send 
    Then validar mensagem de sucesso "<mensagemDeSucesso>"

    Examples:
      |mensagemDeSucesso      |
      |Sending e-mail success!|