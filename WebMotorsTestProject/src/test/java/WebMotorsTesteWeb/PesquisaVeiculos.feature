#Author: Eduardo Barbosa
#Feature Teste Webmotors
@tag
Feature: Como usuario faço pesquisa de veiculos no site Webmotors
         Com marca, modelos e versão, além de validar um estoque de uma loja com sucesso.

  @tag1
  Scenario: validar campo de busca de marca com sucesso
    Given que estou na pagina inicial do site Webmotors
    When digito no campo de pesquisas
    And insiro a marca Honda com sucesso
    Then então sou levado a pagina seguinte com varias opçoes de modelos
    And e posso selecionar um modelo com sucesso.

  @tag2
  Scenario: validar campo de busca de modelo com sucesso
    Given que estou na pagina inicial do site Webmotors
    When Quando digito no campo de pesquisas
    And insiro um modelo  Honda City com sucesso
    Then então sou levado a pagina seguinte com varias opçoes  de versões
    And e posso selecionar uma versão com sucesso.

  @tag3
  Scenario: validar campo de busca de versão com sucesso
    Given que estou na pagina inicial do site Webmotors
    When digito no campo de pesquisas
    And insiro um detalhe a versão desejada do veiculo Honda City com sucesso
    Then então sou levado a pagina seguinte com varias opçoes  de versões
    And e posso selecionar uma versão com sucesso.

  @tag4
  Scenario: validar a listagem de estoque de uma determinada loja.
    Given que estou na pagina inicial do site Webmotors
    When insiro um modelo  Honda City com sucesso
    And clico sobre ir para o estoque da loja
    Then então sou levado a pagina com varias opçoes de veiculos daquela loja   
    