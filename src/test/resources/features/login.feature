# language: es
Característica: Google Search
  Como usuario web
  Quiero usar google search
  Para encontrar la pagina de Devco

  Escenario: Buscar devco
    Dado Sergey has an activate account
    Cuando he sends their valid credentials
    Entonces he should have access to manage his account


  Escenario: Remember things
    Dado Pepito wants to remember something
    Cuando he tries to remember Foo
    Entonces he should get Foo


  Escenario: Succesful login
    Dado Pepito has a token

  @dev
  Escenario: Failed 1
    Dado Pepito Failed1

  @dev
  Escenario: Failed 2
    Dado Pepito Failed2

  @dev
  Escenario: Compromised 1
    Dado Pepito compromised