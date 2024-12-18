
  Feature: PetStore API

    @consulta
    Scenario: Consulta Mascota

      Given la url es "https://petstore.swagger.io/v2"
      When consulto la mascota con ID "1"
      Then valido el codigo de respuesa sea 200
      And valido el nombre de la mascota sea "Pinky"

    @crearMascota
    Scenario: Crear mascota

      Given la url es "https://petstore.swagger.io/v2"
      When creo la mascota "Rocky" con ID "345"
      Then valido el codigo de respuesa sea 200