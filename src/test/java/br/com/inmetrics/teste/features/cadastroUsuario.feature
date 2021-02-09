#language: pt
Funcionalidade: Cadastro Usuario

  Esquema do Cenario: Cadastro Usuario - <cenario>

    Dado que vou para a pagina "https://inm-test-app.herokuapp.com/accounts/signup/"
    E preencho os dados do usuario: "<usuario>"
    Entao o usuario e cadastrado com "<fluxo>"

    Exemplos:
      | cenario                                                 | fluxo   | usuario                     |
      | informando todos os dados                               | sucesso | USUARIO_SIMPLES             |
      | informando valores diferentes na senha e na confirmacao | falha   | SENHA_DIFERENTE_CONFIRMACAO |
      | cadastrando um usuario com username ja cadastrado       | falha   | USERNAME_JA_CADASTRADO      |