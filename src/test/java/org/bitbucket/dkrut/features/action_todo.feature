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

Scenario: Edit todo
    Given user create 1 new todo
    When user make double click at 1 line todo
    Then 1 line todo not be a readonly

Scenario: Show delete button
    Given user create 1 new todo
    When user hover to 1 line todo
    Then delete button at 1 line todo is visible