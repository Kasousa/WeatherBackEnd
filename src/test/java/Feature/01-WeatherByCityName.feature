#language: pt

@ByCityName
Funcionalidade: ByCityName

  Contexto: Solicito a temperatura pelo nome cidade
    Dado Que solicito a temperatura para cidade de 'Granada'
    Então valido que o retorno é 200 OK
    
  @ByCityNameTest-001
  Cenario: Valida coordenadas chamando pelo nome da cidade
    E valido as 'coordinates' no retorno da pesquisa

  @ByCityNameTest-002
  Cenario: Valida weather chamando pelo nome da cidade
    E valido a 'weather' no retorno da pesquisa

  @ByCityNameTest-003
  Cenario: Valida base chamando pelo nome da cidade
    E valido a 'base' no retorno da pesquisa

  @ByCityNameTest-004
  Cenario: Valida main chamando pelo nome da cidade
    E valido a 'main' no retorno da pesquisa

  @ByCityNameTest-005
  Cenario: Valida visibility chamando pelo nome da cidade
    E valido a 'visibility' no retorno da pesquisa

  @ByCityNameTest-006
  Cenario: Valida wind chamando pelo nome da cidade
    E valido a 'wind' no retorno da pesquisa

  @ByCityNameTest-007
  Cenario: Valida cloud chamando pelo nome da cidade
    E valido a 'cloud' no retorno da pesquisa

  @ByCityNameTest-008
  Cenario: Valida dt chamando pelo nome da cidade
    E valido a 'dt' no retorno da pesquisa

  @ByCityNameTest-009
  Cenario: Valida sys chamando pelo nome da cidade
    E valido a 'sys' no retorno da pesquisa

  @ByCityNameTest-010
  Cenario: Valida timezone chamando pelo nome da cidade
    E valido a 'timezone' no retorno da pesquisa

  @ByCityNameTest-011
  Cenario: Valida id chamando pelo nome da cidade
    E valido a 'id' no retorno da pesquisa

  @ByCityNameTest-012
  Cenario: Valida name chamando pelo nome da cidade
    E valido o 'name' no retorno da pesquisa

  @ByCityNameTest-013
  Cenario: Valida cod chamando pelo nome da cidade
    E valido a 'cod' no retorno da pesquisa