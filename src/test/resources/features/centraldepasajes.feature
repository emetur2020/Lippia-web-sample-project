Feature: As a potential client i need send message in citycurator

  @Smoke
  Scenario Outline: 01 - Verificar que se arroje error al intentar emitir reserva para viaje terrestre
    Given un usuario de central de pasajes
    When  realiza una consulta de pasaje con origen <Origen>
    And   realiza una consulta de pasaje con destino <Destino>
    And   realiza una consulta de pasajes con una semana de antelacion
    And   hace click en el boton Buscar
    Then  el mensaje de error informando que no hay servicios en la fecha seleccionada

    Examples:
      | Origen   | Destino      |
      | Mendoza  | Buenos Aires |
