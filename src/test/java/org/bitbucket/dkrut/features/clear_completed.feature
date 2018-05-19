Feature: Click clear completed button
    
Scenario: Button clear completed unvisible
    Given user create 1 new todo
    Then button clear completed is not visible

Scenario: Button clear completed unvisible
    Given user create 2 new todo
    When user click checkbox at 1 todo
    And click button clear completed
    Then list todo have 1 todo
    And 1 line todo have text New ToDo 2