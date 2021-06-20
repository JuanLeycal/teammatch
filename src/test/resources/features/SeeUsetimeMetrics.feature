Feature: See Usetime Metrics

  Scenario Outline: Seeing usetime metrics for player profile
    Given I am in Profile
    And used the application for <hours>
    When I press the button Hours in TeamMatch
    Then The system shows me the message <message>
    Examples:
      | hours | message |
      |5     |"You used TeamMatch for 5 hours"|
      |0     |"We don't have enough info, return when you have played some matches"|