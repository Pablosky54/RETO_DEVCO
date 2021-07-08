#Autor: cefit.pablo@gmail.com
#encoding: iso-8859-1
Feature: I want test of https://www.travelocity.com/

  Background: 
    Given Juan star of page

  @case1
  Scenario: Boton Stay
    When chose option Stay and complete of form
    Then look page in stay
    And search option cheap in page stay

  @case2
  Scenario: Boton Cars
    When chose option Cars and complete of form
      | placeCar    | date_star | date_finish |
      | Medellin | Julio      | Julio   |
    Then look page cars
    And search option cheap in page cars
