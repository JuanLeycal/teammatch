Feature: See Videogame Recomendations

  Scenario Outline: Wee recommendations for new games or new updates
    Given I am a <registered> user in TeamMatch app
    And I am in the screen of recommendations
    When I press the button <button type>
    Then The app shows in a new screen the section <section name>
    And Shows information about <information type>
    Examples:
    |registered      |button type                  |section name              |information type                                              |
    |"Not registered"|"When I sign up in TeamMatch"|"Nothing"                 |"Nothing."                                                    |
    |"Registered"    |"Recommended for you"        |"Recommendations for you!"|"Some games that could be funny for you."                     |
    |"Registered"    |"New releases"               |"New releases"            |"New games that was launched currently."                      |
    |"Registered"    |"ESports News"               |"ESports News"            |"The most relevant news about the world of electronic sports."|
    |"Registered"    |"Upgrades"                   |"Upgrades"                |"The most recent updates for the most famous games."          |
