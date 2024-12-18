Feature: Test Assertion

  @TestAssertion
  Scenario Outline: prueba de login exitoso
    Given prueba de assertion
    When pruebo un servicio url "http://www.google.com"
    When inicio sesion con "<usuario>" y "<password>"

    Examples:
      | usuario   | password                      | url         | rutaCSV                 |
      | jackl007  | Peru2020                      | google.com  | C:\NTTDATA\archivo.csv  |
      | monica008 | egresedadelsenaticonvalidando | nttdata.com | C:\NTTDATA\archivo2.csv |
