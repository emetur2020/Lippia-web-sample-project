Feature: Un potencial usuario de nacionalidad mexicana necesita reservar habitacion de Hotel de Mendoza y Buenos Aires

  @Smoke
  Scenario Outline: 01 - Verificar que se arroje error al intentar pagar la emision de reserva
    Given un usuario de phptravels
    When  ingresa Ciudad destino <Destination>
    And   ingresa fecha de checkin <CheckIn>
    And   ingresa fecha de checkout <CheckOut>
    And   hace click en el boton Buscar
    And   selecciona el primer hotel de la busqueda
    And   selecciona primera suite en el listado
    And   ingresa Nombre <FirstName>
    And   ingresa Apellido <LastName>
    And   ingresa Email <EmailRegister>
    And   ingresa Pais de Residencia <Country>
    And   ingresa Telefono personal <Phone>
    And   ingresa info para completar transaccion <EmailCompra>
    And   ingresa Pais donde se encuentra
    And   hace click en el boton Pagar con Tarjeta
    And   ingresa Numero de tarjeta <CreditCard>
    And   ingresa propietario tarjeta <NameCard>
    And   ingresa Mes de vencimiento <ExpirationMonth>
    And   ingresa Vencimiento <ExpirationYear>
    And   ingresa Codigo de Seguridad/CVV <SecurityCode>
    And   hace click en el boton Pagar ahora
    Then  el mensaje de error informando que el pago ha sido rechazado por el Banco

    Examples:
      | Destination   |  CheckIn    |  CheckOut  | FirstName   |  LastName   |  EmailRegister    | Country    |   Phone    |  EmailCompra      | CreditCard       |  NameCard      | ExpirationMonth | ExpirationYear | SecurityCode |
      | Mendoza       |  17-06-2020 | 23-06-2020 |   Qwerty    |   Asdfg     | qwerty@asdfg.net  | Mexico     | 1234567890 | asdfg@qwerty.net  | 4263982640269299 |  Qwerty Asdfg  | 02              | 2023           | 837          |
      | Buenos Aires  |  24-06-2020 | 30-06-2020 |   Qwerty    |   Asdfg     | qwerty@asdfg.net  | Mexico     | 1234567890 | asdfg@qwerty.net  | 4263982640269299 |  Qwerty Asdfg  | 02              | 2023           | 837          |

