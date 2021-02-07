#language: pt
Funcionalidade: Login

  Esquema do Cenario: Login

    Dado que vou para a pagina de login
    E faco login:
      | usuario | <usuario> |
      | senha   | <senha>   |
    Entao o login e realizado com sucesso

    Exemplos:
      | usuario | senha |
      | teste   | teste |