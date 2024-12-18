

  Feature: Automatización de Pruebas del API Store en PetStore

    @crearOrder
    Scenario: Creación de un pedido en la tienda
      Given la url es "https://petstore.swagger.io/v2"
      When creo una orden con ID "1", petId "101", cantidad "5", fecha "2024-12-18T00:30:46.022Z", status "placed" y complete "true"
      Then valido el código de respuesta sea 200
      And valido que el ID de la orden en el body sea "1"

    @consultarOrder
    Scenario: Consulta de una orden existente
      Given la url es "https://petstore.swagger.io/v2"
      When consulto la orden con ID "1"
      Then valido el código de respuesta sea 200
      And valido que el status de la orden sea "placed"
      And valido que el ID de la orden sea "1"

