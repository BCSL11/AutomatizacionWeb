
@Regresion
Feature: Abrir Ebay 
 
  @Ingreso
  Scenario: Ingresar a ebay
    Given Ingreso a Ebay
    When I complete action
    Then I validate the outcomes

