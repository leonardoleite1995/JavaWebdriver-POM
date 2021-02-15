#language: pt
@login @usuario
Funcionalidade: Login
  @login
  Esquema do Cenario: Login - <cenario>

    Dado que vou para a pagina "https://inm-test-app.herokuapp.com/accounts/login/"
    E faco login: "<usuario>"
    Entao o login e realizado com "<fluxo>":
      | mensagem | <mensagem> |

    Exemplos:
      | cenario                        | fluxo   | usuario                       | mensagem                         |
      | Dados preenchidos corretamente | sucesso | USUARIO_SIMPLES_LOGIN         |                                  |
      | Usuario e senha invalidos      | falha   | USUARIO_SENHA_INVALIDOS_LOGIN | LOGIN_USUARIO_OU_SENHA_INVALIDOS |