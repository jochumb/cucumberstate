Feature: Persistent state between step def files, not between scenarios

  Scenario: Change state
    Given the state is not changed
    When i change the state
    Then the state is changed

  Scenario: State is not changed
    Given the state is not changed
    When i dont change the state
    Then the state is the same