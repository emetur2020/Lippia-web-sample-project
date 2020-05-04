Feature: As a potential client i need send message in citycurator

  @Smoke
  Scenario Outline: 01 - The client send a message to citycurator
    Given the client is in contact-us page
    When  the Client enters his Name <Name>
    And   the Client enters his Lastname <Lastname>
    And   the Client enters his EmailAddress <EmailAddress>
    And   the Client enters his Message <Message>
    Then  the client verifies that the message is sent correctly

    Examples:
      | Name | Lastname | EmailAddress | Message |
      | Juan A  | Trejo | comturmza2020@gmail.com | Text automation test |
      | Eme  | Tur | comturmza2018@gmail.com | Text automation test |