package com.teammatch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeeVideogameRecomendations {

    private String registered;
    private String buttonType;
    private String sectionName;
    private String informationType;

    @Given("I am a {string} user in TeamMatch app")
    public void ImAregisterdUserInTeamMatch(String registered){
        this.registered = registered;
        if (registered.equals("Not registered")){
            this.sectionName = "Nothing";
            this.buttonType = "When I sign up in TeamMatch";
            this.informationType = "Nothing.";
        }
    }

    @And("I am in the screen of recommendations")
    public void IamInTheScreenOfRecommendations(){}

    @When("I press the button {string}")
    public void IpressTheButton(String buttonType){
        this.buttonType = buttonType;
    }

    @Then("The app shows in a new screen the section {string}")
    public void TheAppShowsInAnewScreenTheSectionSectionName(String sectionName){
        if(buttonType.equals("Recommended for you")){
            this.sectionName = "Recommendations for you!";
        }
        if(buttonType.equals("New releases")){
            this.sectionName = "New releases";
        }
        if(buttonType.equals("ESports News")){
            this.sectionName = "ESports News";
        }
        if(buttonType.equals("Upgrades")){
            this.sectionName = "Upgrades";
        }
        this.sectionName = sectionName;
    }

    @And("Shows information about {string}")
    public void ShowsInformationAboutInformationType(String informationType){
        if(sectionName.equals("Recommendations for you!")){
            this.informationType = "Some games that could be funny for you.";
        }
        if(sectionName.equals("New releases")){
            this.informationType = "New games that was launched currently.";
        }
        if(sectionName.equals("ESports News")){
            this.informationType = "The most relevant news about the world of electronic sports.";

        }
        if(sectionName.equals("Upgrades")){
            this.informationType = "The most recent updates for the most famous games.";
        }
    }
}
