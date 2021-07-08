#Autor: cefit.pablo@gmail.com
#encoding: iso-8859-1
Feature: Probar las funcionalidad de la pagina https://www.travelocity.com/

  Background: 
    Given que Juan ingresa a la pagina travelocity

  @caso1
  Scenario: Boton Stay
    When escoge la opcion stay y llena el formulario
      | lugar    | fecha inicio | fecha fin |
      | Medellin | Julio      | Julio   |
    Then vera la pagina de estadias
    And buscara la opcion mas economica

  @caso2
  Scenario: Boton Cars
    When escoge la opcion Cars y llena el formulario
      | lugar    | fecha inicio | fecha fin |
      | Medellin | Julio      | Julio   |
    Then vera la pagina de carros
    And buscara la opcion mas economica de carros
