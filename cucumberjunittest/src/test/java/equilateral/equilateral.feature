
Feature: This is my equilateral-triangle.feature file

Scenario: Calculating an equilateral triangle
    Given I launch https://www.calculator.net/triangle-calculator.html
    When I press Clear button
    And I enter "2" into field of side a
    And I enter "2" into field of side b
    And I enter "2" into field of side c
    And I press Calculate button
    Then Expected result is "Equilateral Triangle"