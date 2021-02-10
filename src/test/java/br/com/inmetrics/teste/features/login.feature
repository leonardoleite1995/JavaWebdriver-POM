#language: pt
Funcionalidade: Login

  Esquema do Cenario: Login - <cenario>

    Dado que vou para a pagina "https://inm-test-app.herokuapp.com/accounts/login/"
    E faco login:
      | usuario | <usuario> |
      | senha   | <senha>   |
    Entao o login e realizado com "<cenario>":
      | mensagem | <mensagem> |

    Exemplos:
      | cenario | usuario | senha        | mensagem                         |
      | sucesso | teste   | teste        |                                  |
      | falha   | teste   | sdfsdfsfdsdf | LOGIN_USUARIO_OU_SENHA_INVALIDOS |