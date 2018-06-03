Feature: Default interface of the page
    
Scenario: Refresh page
    Given user create 1 new todo
    When refresh page
    Then list todo have 1 todo

Scenario: Opening in a new tab
    Given user create 1 new todo
    When create new tab
    And switch to the window 1
    Then list todo have 1 todo
