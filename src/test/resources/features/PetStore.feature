
Feature: Automatización de Pruebas del API Store en PetStore

  @crearOrder
  Scenario Outline: Creación de un pedido en la tienda con diferentes datos
    Given la url es "https://petstore.swagger.io/v2"
    When creo una orden con ID "<idOrden>", petId "<petId>", cantidad "<cantidad>", fecha "<fecha>", status "<status>" y complete "<complete>"
    Then valido el código de respuesta sea 200
    And valido que el ID de la orden en el body sea "<idOrden>"

    Examples:
      | idOrden | petId | cantidad | fecha                       | status | complete |
      | 1       | 101   | 5        | 2024-12-18T00:30:46.022Z     | placed | true     |
      | 2       | 102   | 3        | 2024-12-19T12:15:30.123Z     | placed | false    |
      | 3       | 103   | 1        | 2024-12-20T08:45:00.456Z     | shipped| true     |

  @consultarOrder
  Scenario Outline: Consulta de una orden existente
    Given la url es "https://petstore.swagger.io/v2"
    When consulto la orden con ID "<idOrden>"
    Then valido el código de respuesta sea 200
    And valido que el status de la orden sea "<status>"
    And valido que el ID de la orden sea "<idOrden>"

    Examples:
      | idOrden | status |
      | 1       | placed |
      | 2       | placed |
      | 3       | shipped|


