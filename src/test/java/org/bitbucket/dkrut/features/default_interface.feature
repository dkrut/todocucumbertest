Feature: Default settings of the page
    
Scenario: Placeholder text
    Given new todo field have text What needs to be done?

Scenario: New todo field status
    Given new todo field is focused

Scenario: Header text
    Given header have text todos

Scenario: Footer status with the empty list of todo
    Given footer is not visible