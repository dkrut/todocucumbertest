Feature: Create todo
    
Scenario: Add few todo
    Given user create 2 new todo
    Then list todo have 2 todo

Scenario: Empty input field for new todo
    Given user create 1 new todo
    Then input field for new todo should be visible
    And input field for new todo should be focused
    And input field for new todo shouldn't be readonly

Scenario: Sorting todo
    Given user create 2 new todo
    Then 1 line todo have text New ToDo 1
    And 2 line todo have text New ToDo 2