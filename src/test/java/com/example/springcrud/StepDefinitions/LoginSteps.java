package com.example.springcrud.StepDefinitions;

import io.cucumber.java.en.*;


public class LoginSteps {

    @Given("User is on Home Page")
    public void userIsOnHomePage() {
      
    }

    @When("User navigate to Client Page")
    public void userNavigatesToClientPage() {
        // Navigation logic
    }

    @Then("User enters {string}, {string} and {string}")
    public void userEntersDetails(String name, String email, String address) {
        // Form fill logic
    }

    @And("User clicks Submit button")
    public void userClicksSubmit() {
        // Submit logic
    }

    @Then("User should get into Home page")
    public void userShouldReturnHome() {
        // Assertion logic
    }

    @And("new client should be {string} added")
    public void clientShouldBeAdded(String caseStatus) {
        // Conditional assertion
    }
}
