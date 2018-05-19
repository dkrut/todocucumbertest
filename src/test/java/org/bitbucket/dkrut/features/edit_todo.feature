Feature: Editing todo
    
Scenario: Apply editing by Enter
    Given user create 1 new todo
    When user edit 1 todo by enter adding Editing task.
    Then 1 line todo have text Editing task

Scenario: Apply editing by blur
    Given user create 1 new todo
    When user edit 1 todo by blur adding Editing task
    Then 1 line todo have text Editing task

Scenario: Cancel editing blur
    Given user create 1 new todo
    When user edit todo adding Editing task clicking ESC
    Then 1 line todo have text New todo 1

Scenario: Trimming spaces before text
    Given user add new todo with value  Space before and after .
    Then 1 line todo have text Space before and after

Scenario: Deleting empty todo
    Given user create 2 new todo
    When user edit 1 todo by enter adding .
    Then list todo have 1 todo