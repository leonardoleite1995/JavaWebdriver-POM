#language: pt
Funcionalidade: Cadastro Usuario

  Esquema do Cenario: Cadastro Usuario - <cenario>

    Dado que vou para a pagina "https://inm-test-app.herokuapp.com/accounts/signup/"
    E preencho os dados do usuario: "<usuario>"
    Entao o usuario e cadastrado com "<fluxo>":
      | mensagem | <mensagem> |

    Exemplos:
      | cenario                                                 | fluxo   | usuario                     | mensagem                    |
      | informando todos os dados                               | sucesso | USUARIO_SIMPLES             |                             |
      | informando valores diferentes na senha e na confirmacao | falha   | SENHA_DIFERENTE_CONFIRMACAO | USUARIO_SENHAS_NAO_CONFEREM |
      | cadastrando um usuario com username ja cadastrado       | falha   | USERNAME_JA_CADASTRADO      | USUARIO_JA_CADASTRADO       |