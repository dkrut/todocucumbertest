Feature: Click togle all todo completed
    
Scenario: Select all todo completed
    Given user create 2 new todo
    When click toggle all completed
    Then checkbox at 1 todo is selected
    And checkbox at 2 todo is selected

Scenario: Unselect all todo completed
    Given user create 2 new todo
    When click toggle all completed
    And click toggle all completed
    Then checkbox at 1 todo is unselected
    And checkbox at 2 todo is unselected