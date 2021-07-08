#Autor: cefit.pablo@gmail.com
#encoding: iso-8859-1
Feature: I want test of https://www.travelocity.com/

  Background: 
    Given Juan star of page

  @caso1
  Scenario: Boton Stay
    When chose option Stay and complete of form
      | place    | date_init | date_end |
      | Medellin | July      | March   |
    Then look page in stay
    And search option cheap in page stay

  @caso2
  Scenario: Boton Cars
    When chose option Cars and complete of form
      | placeCar    | date_star | date_finish |
      | Medellin | Julio      | Julio   |
    Then look page cars
    And search option cheap in page cars
