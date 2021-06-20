package com.teammatch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindATeam {

    private String registered;
    private String username;
    private String filters;
    private String team;

    @Given("I have {string} my account")
    public void iHaveRegisteredMyAccount(String registered) {
        this.registered = registered;
    }

    @And("I have logged in with my {string}")
    public void iHaveLoggedInWithMyUser(String Username) {
        if(this.registered.equals("yes")){
            this.username = Username;
        }
        else if(this.registered.equals("no")){
            this.username="error";
        }
        assertEquals(this.username, Username);
    }

    @And("I select the option of Find Teams")
    public void iSelectTheOptionOfFindTeams() {

    }

    @When("I have registered a {string} of filters")
    public void iHaveRegisteredANumberFOfFilters(String filters) {
        if(this.username.equals("error")){
            this.filters = "error";
        }
        else{
            this.filters= filters;
        }
        assertEquals(this.filters, filters);
    }


    @Then("I should be able to see {string} teams that match my filters")
    public void iShouldBeAbleToSeeNumberTeamsTeamsThatMatchMyFilters(String Team) {
        if(this.filters.equals("error")){
            this.team = "error";
        }
        else{
            this.team= Team;
        }
        assertEquals(this.team, Team);
    }
}
