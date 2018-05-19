Feature: Count of remaining todos
    
Scenario: Count new todo
    Given user create 1 new todo
    Then count todo have text 1 item left

Scenario: Count active todo
    Given user create 3 new todo
    When user click checkbox at 1 todo
    And user click checkbox at 3 todo
    Then count todo have text 1 item left