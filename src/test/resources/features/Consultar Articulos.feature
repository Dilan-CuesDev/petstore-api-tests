@todo
Feature: Consulta un servicio

  @consultaArticulos1
  Scenario: Consulta un servicio
    Given la url "https://jsonplaceholder.typicode.com" del servicio
    When hago la consulta de los articulos
    Then imprimo los articulos

  @consultaArticulos2
  Scenario: Consulta un servicio
    Given la url "https://jsonplaceholder.typicode.com" del servicio
    When hago la consulta de los articulos
    Then imprimo los articulos