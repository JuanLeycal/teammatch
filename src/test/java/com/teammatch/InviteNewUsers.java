package com.teammatch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InviteNewUsers {
    @When("I press the Invite button")
    public void iPressTheInviteButton() { }

    @Then("The system shows me invite links for different methods")
    public void theSystemShowsMeInviteLinksForDifferentMethods() {
    }

    private String username;
    private String message;

    @Given("I am in Home")
    public void iAmInHome() { }

    @When("A new user {string} registers with my invite link")
    public void aNewUserUsernameRegistersWithMyInviteLink(String username) { this.username=username; }

    @Then("The system notifies me with the message {string}")
    public void theSystemNotifiesMeWithTheMessageMessage(String message) {
        this.message=String.format("%s has registered using your invite link!",this.username);
        assertEquals(message, this.message);
    }

    private String gameName;
    private int invitedAmount;
    private String notification;

    @Given("I am in Invites")
    public void iAmInInvites() { }

    @And("I play a lot of {string}")
    public void iPlayALotOfGameName(String gameName) { this.gameName=gameName; }

    @When("{int} users registers in TeamMatch")
    public void invitedAmountUsersRegistersInTeamMatch(int invitedAmount) { this.invitedAmount=invitedAmount; }

    @Then("The system shows me the notification {string}")
    public void theSystemShowsMeTheNotificationNotification(String notification) {
        if (this.invitedAmount<2){
            this.notification="You have nothing to claim, invite users to get Bounties!";
        } else {
            this.notification=String.format("You can claim %s bounties!",this.gameName);
        }
        assertEquals(notification, this.notification);
    }
}
