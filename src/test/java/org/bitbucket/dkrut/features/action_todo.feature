Feature: Action with todo

Scenario: Mark todo
    Given user create a new todo
    When user click checkbox
    Then checkbox is selected

Scenario: Unmark todo
    Given user create a new todo
    When user click checkbox
    And click checkbox else
    Then checkbox is unselected