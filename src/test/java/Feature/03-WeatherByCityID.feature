#language: pt

@ByCityID
Funcionalidade: ByCityID

  Contexto: ByCityID
    Dado Que solicito a temperatura pelo ID '5101760'
    Então valido que o retorno é 200 OK

  @ByCityIDTest-001
  Cenario: Valida coordenadas chamando pelo ID da cidade
    E valido as 'coordinates' no retorno da pesquisa

  @ByCityIDTest-002
  Cenario: Valida weather chamando pelo nome da cidade
    E valido a 'weather' no retorno da pesquisa

  @ByCityIDTest-003
  Cenario: Valida base chamando pelo ID da cidade
    E valido a 'base' no retorno da pesquisa

  @ByCityIDTest-004
  Cenario: Valida main chamando pelo ID da cidade
    E valido a 'main' no retorno da pesquisa

  @ByCityIDTest-005
  Cenario: Valida visibility chamando pelo ID da cidade
    E valido a 'visibility' no retorno da pesquisa

  @ByCityIDTest-006
  Cenario: Valida wind chamando pelo ID da cidade
    E valido a 'wind' no retorno da pesquisa

  @ByCityIDTest-007
  Cenario: Valida cloud chamando pelo ID da cidade
    E valido a 'cloud' no retorno da pesquisa

  @ByCityIDTest-008
  Cenario: Valida dt chamando pelo ID da cidade
    E valido a 'dt' no retorno da pesquisa

  @ByCityIDTest-009
  Cenario: Valida sys chamando pelo ID da cidade
    E valido a 'sys' no retorno da pesquisa

  @ByCityIDTest-010
  Cenario: Valida timezone chamando pelo ID da cidade
    E valido a 'timezone' no retorno da pesquisa

  @ByCityIDTest-011
  Cenario: Valida id chamando pelo ID da cidade
    E valido a 'id' no retorno da pesquisa

  @ByCityIDTest-012
  Cenario: Valida name chamando pelo ID da cidade
    E valido o 'name' no retorno da pesquisa

  @ByCityIDTest-013
  Cenario: Valida cod chamando pelo ID da cidade
    E valido a 'cod' no retorno da pesquisa



