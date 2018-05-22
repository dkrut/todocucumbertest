Feature: Action with list

Scenario: Choose completed todo
    Given user create 2 new todo
    When user click checkbox at 1 todo
    And click button completed
    Then list completed todo have 1 todo
  
Scenario: Choose all todo
    Given user create 2 new todo
    When user click checkbox at 1 todo
    And click button all
    Then list todo have 2 todo