
Feature: This is my isosceles-triangle.feature file

Scenario: Calculating an acute isosceles triangle
    Given I launch https://www.calculator.net/triangle-calculator.html
    When I press Clear button
    And I enter "2" into field of side a
    And I enter "2" into field of side b
    And I enter "1" into field of side c
    And I press Calculate button
    Then Expected result is "Acute Isosceles Triangle"