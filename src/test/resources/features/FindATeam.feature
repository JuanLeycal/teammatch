Feature: Find a Team

  Scenario Outline: Finding a Team
    Given I have <registered> my account
    And I have logged in with my <user>
    And I select the option of Find Teams
    When I have registered a <number-f> of filters
    Then I should be able to see <number-teams> teams that match my filters

    Examples:
      |registered |user     |number-f  |number-teams |
      |"yes"      |"Empe"   |"3"       |"9"          |
      |"yes"      |"ChatoV" |"5"       |"3"          |
      |"no"       |"error"  |"error"   |"error"      |