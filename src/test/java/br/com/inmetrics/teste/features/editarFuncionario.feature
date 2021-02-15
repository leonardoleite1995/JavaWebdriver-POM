#language: pt
Funcionalidade: Editar Funcionario

  Esquema do Cenario: Editar Funcionario - <cenario>

    Dado que vou para a pagina "https://inm-test-app.herokuapp.com/accounts/login/"
    E faco login: "<usuario>"
    Quando acesso a pagina de edicao de dados de funcionarios
    E preencho os dados do funcionario: "<funcionario>"
    Entao o funcionario e editado com "<fluxo>":
      | mensagem | <mensagem> |

    Exemplos:
      | cenario                | fluxo   | funcionario     | usuario               | mensagem                        |
      | edicao com sucesso clt | sucesso | FUNCIONARIO_CLT | USUARIO_SIMPLES_LOGIN | FUNCIONARIO_EDITADO_COM_SUCESSO |
      | edicao com sucesso pj  | sucesso | FUNCIONARIO_PJ  | USUARIO_SIMPLES_LOGIN | FUNCIONARIO_EDITADO_COM_SUCESSO |