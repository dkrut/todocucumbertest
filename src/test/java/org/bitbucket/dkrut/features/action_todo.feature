Feature: Action with todo

Scenario: Mark todo
    Given user create 1 new todo
    When user click checkbox at 1 todo
    Then checkbox at 1 todo is selected

Scenario: Unmark todo
    Given user create 1 new todo
    When user click checkbox at 1 todo
    And click checkbox at 1 todo else
    Then checkbox at 1 todo is unselected