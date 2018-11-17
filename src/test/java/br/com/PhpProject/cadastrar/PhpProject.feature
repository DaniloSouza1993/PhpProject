#Author: Danilo Alberto de Souza your daniloinfoprojetos@gmail.com
# language: en

Feature: Realizar cadastros
  - Eu quero fazer login no sistema
  - Eu quero realizar cadastro de customers
  - Eu quero realizar cadastro de admins

  @RealizarLogin
  Scenario Outline: Realizar login
    Given Quando eu acesso o sistema com o email "<email>"
    When Quando eu acesso com a senha "<senha>"
    Then eu clico no botao login para acessar o sistema

    Examples: 
      | email                | senha     |
      | admin@phptravels.com | demoadmin |

  @CadastrarCustomers
  Scenario: Realizar cadastro em ACCOUNTS -> CUSTOMERS
    And clico no menu ACCOUNTS e no sub menu CUSTOMERS
    And sistema carrega a tela de CUSTOMERS MANAGEMENT
    And clico no botao ADD
    And preencho os campos First Name
    And Preencho o campo Last name
    And Preencho o campo email
    And Preencho o campo password
    And Preencho o campo country
    And clico no botao submit
    Then conta cadastro efetuado com sucesso

  @CadastrarAdmins
  Scenario: Realizar cadastro em ACCOUNTS -> ADMINS
    And clico no menu ACCOUNTS e no sub menu ADMINS
    And sistema carrega a tela de ADMINS MANAGEMENT
    And clico no botao ADD em admins
    And preencho os campos First Name em admins
    And Preencho o campo Last name em admins
    And Preencho o campo email em admins
    And Preencho o campo password em admins
    And Preencho o campo country em admins
    And clico no botao submit em admins
    Then conta cadastro efetuado com sucesso em admins
