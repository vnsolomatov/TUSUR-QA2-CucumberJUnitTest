
Feature: This is my math-calculator.feature file

Scenario: Sequence of arithmetic operations with online calculator
    Given I launch https://www.calculator.net
    When I switch on Math Calculators
    And I click "AC" button
    #And I enter "2"
    #And I click "*" button
    #And I enter "20"
    #And I click "=" button
    Then Expected result is "0"