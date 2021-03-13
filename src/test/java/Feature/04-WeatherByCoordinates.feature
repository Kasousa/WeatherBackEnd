#language: pt

@ByCoordinates
Funcionalidade: ByCoordinates

  Contexto: ByCoordinates
    Dado Que solicito a temperatura pela coordenada latitude='40.167061' e longitude='-74.49987'
    Então valido que o retorno é 200 OK

  @ByCoordinatesTest-001
  Cenario: Valida coordenadas chamando pela coordenada geografica
    E valido as 'coordinates' no retorno da pesquisa

  @ByCoordinatesTest-002
  Cenario: Valida weather chamando pela coordenada geografica
    E valido a 'weather' no retorno da pesquisa

  @ByCoordinatesTest-003
  Cenario: Valida base chamando pela coordenada geografica
    E valido a 'base' no retorno da pesquisa

  @ByCoordinatesTest-004
  Cenario: Valida main chamando pela coordenada geografica
    E valido a 'main' no retorno da pesquisa

  @ByCoordinatesTest-005
  Cenario: Valida visibility chamando pela coordenada geografica
    E valido a 'visibility' no retorno da pesquisa

  @ByCoordinatesTest-006
  Cenario: Valida wind chamando pela coordenada geografica
    E valido a 'wind' no retorno da pesquisa

  @ByCoordinatesTest-007
  Cenario: Valida cloud chamando pela coordenada geografica
    E valido a 'cloud' no retorno da pesquisa

  @ByCoordinatesTest-008
  Cenario: Valida dt chamando pela coordenada geografica
    E valido a 'dt' no retorno da pesquisa

  @ByCoordinatesTest-009
  Cenario: Valida sys chamando pela coordenada geografica
    E valido a 'sys' no retorno da pesquisa

  @ByCoordinatesTest-010
  Cenario: Valida timezone chamando pela coordenada geografica
    E valido a 'timezone' no retorno da pesquisa

  @ByCoordinatesTest-011
  Cenario: Valida id chamando pela coordenada geografica
    E valido a 'id' no retorno da pesquisa

  @ByCoordinatesTest-012
  Cenario: Valida name chamando pela coordenada geografica
    E valido o 'name' no retorno da pesquisa

  @ByCoordinatesTest-013
  Cenario: Valida cod chamando pela coordenada geografica
    E valido a 'cod' no retorno da pesquisa



