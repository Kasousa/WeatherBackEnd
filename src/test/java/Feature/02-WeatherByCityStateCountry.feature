#language: pt

@ByCityNameStateCountry
Funcionalidade: ByCityNameStateCountry

  Contexto: ByCityNameStateCountry
    Dado Que solicito a temperatura para cidade de 'Granada', 'GR', 'NI'
    Então valido que o retorno é 200 OK
    
  @ByCityNameStateCountryTest-001
  Cenario: Valida coordenadas chamando pelo nome da cidade, estado e país
    E valido as 'coordinates' no retorno da pesquisa

  @ByCityNameStateCountryTest-002
  Cenario: Valida weather chamando pelo nome da cidade, estado e país
    E valido a 'weather' no retorno da pesquisa

  @ByCityNameStateCountryTest-003
  Cenario: Valida base chamando pelo nome da cidade, estado e país
    E valido a 'base' no retorno da pesquisa

  @ByCityNameStateCountryTest-004
  Cenario: Valida main chamando pelo nome da cidade, estado e país
    E valido a 'main' no retorno da pesquisa

  @ByCityNameStateCountryTest-005
  Cenario: Valida visibility chamando pelo nome da cidade, estado e país
    E valido a 'visibility' no retorno da pesquisa

  @ByCityNameStateCountryTest-006
  Cenario: Valida wind chamando pelo nome da cidade, estado e país
    E valido a 'wind' no retorno da pesquisa

  @ByCityNameStateCountryTest-007
  Cenario: Valida cloud chamando pelo nome da cidade, estado e país
    E valido a 'cloud' no retorno da pesquisa

  @ByCityNameStateCountryTest-008
  Cenario: Valida dt chamando pelo nome da cidade, estado e país
    E valido a 'dt' no retorno da pesquisa

  @ByCityNameStateCountryTest-009
  Cenario: Valida sys chamando pelo nome da cidade, estado e país
    E valido a 'sys' no retorno da pesquisa

  @ByCityNameStateCountryTest-010
  Cenario: Valida timezone chamando pelo nome da cidade, estado e país
    E valido a 'timezone' no retorno da pesquisa

  @ByCityNameStateCountryTest-011
  Cenario: Valida id chamando pelo nome da cidade, estado e país
    E valido a 'id' no retorno da pesquisa

  @ByCityNameStateCountryTest-012
  Cenario: Valida name chamando pelo nome da cidade, estado e país
    E valido o 'name' no retorno da pesquisa

  @ByCityNameStateCountryTest-013
  Cenario: Valida cod chamando pelo nome da cidade, estado e país
    E valido a 'cod' no retorno da pesquisa