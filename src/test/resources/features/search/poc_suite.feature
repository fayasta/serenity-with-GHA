Feature: Proyecto Yevo - POC

  Background: Open website

  @poc
  Scenario Outline: Registrar nuevo usuario
    Given El usuario abre el sitio de Yevo
    Then El usuario hace click en Registrarme ahora
    And El usuario completa los campos obligatorios "<documentNumber>", "<phone>", "<name>", "<lastName>", "<secondLastName>"

    Examples:
    |documentNumber| phone | name | lastName| secondLastName|
    |837373838     | 9898987787| Renzo | Flores | Gomez |
    |547464646     | 9898987888| Ruby | Suarez | Torres |