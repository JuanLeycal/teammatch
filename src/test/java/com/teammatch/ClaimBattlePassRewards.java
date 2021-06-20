package com.teammatch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClaimBattlePassRewards {

    private String registered;
    private String accountType;
    private String rewardsType;
    private String speedType;

    @Given("I am a {string} user in TeamMatch")
    public void IamRegisterdUser(String registered){
        this.registered = registered;
        if(registered.equals("Not registered"))
            this.accountType = "Non account";
            this.rewardsType = "No rewards";
            this.speedType = "When I sign up";
    }

    @And("I have a {string}")
    public void IhaveaAccountType(String accountType){
        this.accountType = accountType;
    }

    @When("I pass time in the app looking for players")
    public void IpassTimeInTheAppLookingForPlayers(){}

    @Then("I could claim {string}")
    public void IcouldClaimRewardsType(String rewardsType){
        if (accountType.equals("Free account"))
            this.rewardsType = "Free rewards";
        if (accountType.equals("Premium rewards"))
            this.rewardsType = "Premium rewards";
        this.rewardsType = rewardsType;
    }

    @And("I could level up my account {string}")
    public void IcouldLevelUpMyAccountSpeedType(String speedType){
        if (accountType.equals("Free acoount")){
            this.speedType = "Slowly";
        }
        if (accountType.equals("Premium account")){
            this.speedType = "Quickly";
        }
        this.speedType = speedType;
    }


}
