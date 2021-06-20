Feature: Invite New Users

  Scenario: Getting the invite link
    Given I am in Profile
    When I press the Invite button
    Then The system shows me invite links for different methods

  Scenario Outline: Getting a new user invited by my invite link
    Given I am in Home
    When A new user <username> registers with my invite link
    Then The system notifies me with the message <message>
    Examples:
      |username |message|
      |"sadaakisz"|"sadaakisz has registered using your invite link!"|
      |"oserigez" |"oserigez has registered using your invite link!" |

  Scenario Outline: Claim Bounty for inviting users
    Given I am in Invites
    And I play a lot of <gameName>
    When <invitedAmount> users registers in TeamMatch
    Then The system shows me the notification <notification>
    Examples:
      | gameName        | invitedAmount | notification |
      |"CSGO"           |0              |"You have nothing to claim, invite users to get Bounties!"|
      |"Valorant"       |2              |"You can claim Valorant bounties!"                        |
      |"Rocket League"  |2              |"You can claim Rocket League bounties!"                   |