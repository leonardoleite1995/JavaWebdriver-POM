#language: pt
Funcionalidade: Cadastro Funcionario

  Esquema do Cenario: Cadastro Funcionario - <cenario>

    Dado que vou para a pagina "https://inm-test-app.herokuapp.com/accounts/login/"
    E faco login:
      | usuario | <usuario> |
      | senha   | <senha>   |
    Quando acesso a pagina de cadastro de funcionarios
    E preencho os dados do funcionario: "<funcionario>"
    Entao o funcionario e cadastrado com "<fluxo>":
      | mensagem | <mensagem> |

    Exemplos:
      | cenario         | fluxo   | funcionario     | usuario | senha | mensagem |
      | funcionario clt | sucesso | FUNCIONARIO_CLT | teste   | teste |          |
      | funcionario pj  | sucesso | FUNCIONARIO_PJ  | teste   | teste |          |