package com.teammatch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeeUsetimeMetrics {
    private int hours;
    private String message;

    @Given("I am in Profile")
    public void iAmInProfile() { }

    @And("used the application for {int}")
    public void usedTheApplicationForHours(int hours) { this.hours=hours; }

    @When("I press the button Hours in TeamMatch")
    public void iPressTheButton() { }

    @Then("The system shows me the message {string}")
    public void theSystemShowsMeTheMessageMessage(String message) {
        if (hours==0){
            this.message="We don't have enough info, return when you have played some matches";
        } else {
            this.message=String.format("You used TeamMatch for %o hours",this.hours);
        }
        assertEquals(message, this.message);
    }
}
