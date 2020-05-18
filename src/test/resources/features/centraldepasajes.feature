Feature: Un potencial usuario necesita encontrar informacion y reservar pasajes

  @Ignore
  Scenario: 01 - Verificar envio de consulta. Este test sólo funcionará los fines de semana
    Given un usuario de central de pasajes
    When  solicita informacion a traves de solapa Dejanos tu consulta
    And   ingresa nombre de usuario qwerty
    And   ingresa mail de usuario qwerty@asdfg.net
    And   ingresa telefono de usuario 2617777777
    And   ingresa mensaje de usuario Text automation
    Then  se visualiza el mensaje de consulta enviado satisfactoriamente

  @Smoke
  Scenario: 02 - Verificar envio de opinion
    Given un usuario de central de pasajes
    When  solicita enviar opinion en solapa Dejanos tu opinion
    And   ingresa puntaje
    And   ingresa barrio
    And   ingresa motivo Barrio de residencia
    And   ingresa mail qwerty@asdfg.net
    Then  se visualiza el mensaje de envio satisfactorio

  @Smoke
  Scenario: 03 - Verificar reserva de pasaje en micro low-cost con datos erroneos. Puede fallar si la butaca 44 esta ocupada
    Given un usuario de central de pasajes
    When  solicita reservar en la primer opcion
    And   ingresa a link de primer precio
    And   ingresa butaca 44
    And   envia datos sin llenar fomularios con datos personales
    Then  se visualiza el mensaje de ingresar correctamente datos validos

  @Smoke
  Scenario: 04 - Verificar error de reenvio de pasaje sin cargar informacion en formularios
    Given un usuario de central de pasajes
    When  solicita reenviar pasaje
    And   envia sin rellenar formularios ni captcha
    Then  se visualiza el mensaje de error completar data

  @Smoke
  Scenario: 05 - Verificar modulo de ayuda
    Given un usuario de central de pasajes
    When  solicita ayuda
    And   ingresa palabra a buscar pasajes
    And   ingresa a primer link
    Then  se visualiza el contenido del FAQ elegido


  @Smoke
  Scenario: 06 - Verificar consulta de promociones
    Given un usuario de central de pasajes
    When  solicita informacion de promociones a traves de link
    And   ingresa al primer link
    Then  se visualiza la informacion de forma satisfactoria

  @Smoke
  Scenario: 07 - Verificar consulta de devolucion de pasajes
    Given un usuario de central de pasajes
    When  solicita informacion de promociones a traves de link
    And   ingresa a devolver mi pasaje
    Then  se visualiza el mensaje de devolucion online no disponible


  @Ignore
  Scenario: 08 - Verificar que se realice suscripción a Newsletter
    Given un usuario de central de pasajes
    When  solicita informacion por Newsletter al mail aeviajes@umail2.com
    And   hace click en el boton Submit
    Then  se visualiza el mensaje de suscripcion al Newsletter

  @Smoke
  Scenario Outline: 09 - Verificar que se arroje error al intentar emitir reserva para viaje terrestre
    Given un usuario de central de pasajes
    When  realiza una consulta de pasaje con origen <Origen>
    And   realiza una consulta de pasaje con destino <Destino>
    And   realiza una consulta de pasajes con una semana de antelacion
    And   hace click en el boton Buscar
    Then  el mensaje de error informando que no hay servicios en la fecha seleccionada

    Examples:
      | Origen   | Destino      |
      | Mendoza  | Buenos Aires |
      | Buenos Aires | Mendoza  |

  @Smoke
  Scenario: 10 - Verificar que se visualiza Bases y Condiciones
    Given  un usuario de central de pasajes
    When   hace click en el linkfooter de Bases y Condiciones
    Then   se visualiza pagina de Bases y Condiciones
