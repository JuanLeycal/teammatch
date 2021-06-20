package com.teammatch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelUpAccount {
    private String registered;
    private String log;
    private String level_up;
    private String bonus;

    @Given("I {string} user")
    public void iHaveAnAccountUser(String registered) {
        this.registered = registered;
    }

    @And("I am {string} in my account")
    public void iAmLoggedInMyAccount(String log) {
        if(this.registered.equals("Yes")){
            this.log = log;
        }
        else if(this.registered.equals("No")){
            this.log="error";
        }
        assertEquals(this.log, log);
    }

    @And("I use the application constantly")
    public void iUseTheApplicationConstantly() {
    }

    @When("I {string} my account")
    public void iLevelUpMyAccount(String level) {
        if(this.log.equals("error")){
            this.level_up = "error";
        }
        else if(this.log.equals("Logged out")){
            this.level_up= "no";
            //this.level_up = level;
        }
        else{
            this.level_up= level;
            //this.level_up = level;
        }
        assertEquals(this.level_up, level);
    }

    @Then("I should receive a {string}")
    public void iShouldReceiveABonification(String Bonus) {
        if(this.level_up.equals("error")){
            this.bonus = "error";
        }
        else if(this.level_up.equals("no")){
            this.bonus= "no";
            //this.level_up = level;
        }
        else{
            this.bonus= "yes";
            //this.level_up = level;
        }
        assertEquals(this.bonus, Bonus);
    }
}
