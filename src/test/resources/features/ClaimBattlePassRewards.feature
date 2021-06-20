Feature: Claim Battle Pass Rewards

  Scenario Outline: Claim a reward from the Battle Pass
    Given I am a <registered> user in TeamMatch
    And I have a <account type>
    When I pass time in the app looking for players
    Then I could claim <rewards type>
    And I could level up my account <speed type>
    Examples:
    |registered      |account type     |rewards type     |speed type      |
    |"Not registered"|"Non account"    |"No rewards"     |"When I sign up"|
    |"Registered"    |"Free account"   |"Free rewards"   |"Slowly"        |
    |"Registered"    |"Premium account"|"Premium rewards"|"Quickly"       |

