Feature: Un potencial usuario necesita encontrar informacion sobre servicios de traducción

  @Smoke
  Scenario: 01 - Verificar envio de pedido de presupuesto ads
    Given un usuario de latino bridge solicita cotizacion sin cargo
    When  ingresa nombre de usuario cotizacion Qwerty Asdfg
    And   ingresa mail de usuario cotizacion qwerty@asdfg.net
    And   ingresa telefono de usuario cotizacion 1234567890
    And   ingresa mensaje de usuario cotizacion Text automation
    Then  se visualiza el mensaje de pedido de cotizacion enviado satisfactoriamente
