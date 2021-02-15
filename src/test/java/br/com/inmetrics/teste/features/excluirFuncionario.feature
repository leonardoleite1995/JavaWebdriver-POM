#language: pt
Funcionalidade: Excluir Funcionario

  Esquema do Cenario: Excluir Funcionario - <cenario>

    Dado que vou para a pagina "https://inm-test-app.herokuapp.com/accounts/login/"
    E faco login: "<usuario>"
    Quando excluo um funcionario
    Entao o funcionario e excluido com "<fluxo>":
      | mensagem | <mensagem> |

    Exemplos:
      | cenario              | fluxo   | usuario               | mensagem                         |
      | exclusao com sucesso | sucesso | USUARIO_SIMPLES_LOGIN | FUNCIONARIO_EXCLUIDO_COM_SUCESSO |