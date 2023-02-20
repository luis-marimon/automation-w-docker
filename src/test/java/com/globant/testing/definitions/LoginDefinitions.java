package com.globant.testing.definitions;

import com.globant.testing.steps.LoginSteps;

import com.globant.testing.utils.Constants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @Given("^the user visit the login page$")
    public void visitThePage() {
        loginSteps.open();
    }

    @When("^the user enter the values for username and password$")
    public void fillForm() {
        loginSteps.setUsername(Constants.USER_NAME);
        loginSteps.setPassword(Constants.PASSWORD);
        loginSteps.loginClick();
    }

    @Then("^he should see the welcome page$")
    public void seeWelcomePage() {
        loginSteps.validatePage();
    }
}
