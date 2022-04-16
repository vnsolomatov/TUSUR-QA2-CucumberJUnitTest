
Feature: This is my isosceles-triangle.feature file

Scenario: Calculating an acute isosceles triangle
    Given I do launch https://www.calculator.net/triangle-calculator.html
    When I do press Clear button
    And I do enter "2" into field of side a
    And I do enter "2" into field of side b
    And I do enter "1" into field of side c
    And I do press Calculate button
    Then Expected result does "Acute Isosceles Triangle"