Feature: Level up an account

  Scenario Outline: Leveling up an account
    Given I <have An account> user
    And I am <logged> in my account
    And I use the application constantly
    When I <level up> my account
    Then I should receive a <bonification>

    Examples:
      |have An account     |logged      |level up|bonification|
      |"No"                |"error"     |"error" |"error"     |
      |"Yes"               |"Logged out"|"no"    |"no"        |
      |"Yes"               |"Logged in" |"no"    |"no"        |
      |"Yes"               |"Logged in" |"yes"   |"yes"       |
