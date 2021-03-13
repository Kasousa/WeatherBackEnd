#language: pt

@ByZIPCode
Funcionalidade: ByZIPCode

  Contexto: ByZIPCode
    Dado Que solicito a temperatura pelo código ZIP '33122'
    Então valido que o retorno é 200 OK
    
  @ByZIPCodeTest-001
  Cenario: Valida coordenadas chamando pelo código ZIP
    E valido as 'coordinates' no retorno da pesquisa

  @ByZIPCodeTest-002
  Cenario: Valida weather chamando pelo código ZIP
    E valido a 'weather' no retorno da pesquisa

  @ByZIPCodeTest-003
  Cenario: Valida base chamando pelo código ZIP
    E valido a 'base' no retorno da pesquisa

  @ByZIPCodeTest-004
  Cenario: Valida main chamando pelo código ZIP
    E valido a 'main' no retorno da pesquisa

  @ByZIPCodeTest-005
  Cenario: Valida visibility chamando pelo código ZIP
    E valido a 'visibility' no retorno da pesquisa

  @ByZIPCodeTest-006
  Cenario: Valida wind chamando pelo código ZIP
    E valido a 'wind' no retorno da pesquisa

  @ByZIPCodeTest-007
  Cenario: Valida cloud chamando pelo código ZIP
    E valido a 'cloud' no retorno da pesquisa

  @ByZIPCodeTest-008
  Cenario: Valida dt chamando pelo código ZIP
    E valido a 'dt' no retorno da pesquisa

  @ByZIPCodeTest-009
  Cenario: Valida sys chamando pelo código ZIP
    E valido a 'sys' no retorno da pesquisa

  @ByZIPCodeTest-010
  Cenario: Valida timezone chamando pelo código ZIP
    E valido a 'timezone' no retorno da pesquisa

  @ByZIPCodeTest-011
  Cenario: Valida id chamando pelo código ZIP
    E valido a 'id' no retorno da pesquisa

  @ByZIPCodeTest-012
  Cenario: Valida name chamando pelo código ZIP
    E valido o 'name' no retorno da pesquisa

  @ByZIPCodeTest-013
  Cenario: Valida cod chamando pelo código ZIP
    E valido a 'cod' no retorno da pesquisa



