package com.globant.testing.steps;

import com.globant.testing.pageobjects.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    private final LoginPage loginPage = new LoginPage();

    @Step
    public void validatePage() {
        loginPage.validate();
    }

    @Step
    public void loginClick() {
        loginPage.clickOnLogin();
    }

    @Step
    public void setPassword(String password) {
        loginPage.setPassword(password);
    }

    @Step
    public void setUsername(String username) {
        loginPage.setUsername(username);
    }

    @Step
    public void open() {
        this.loginPage.open();
    }

}
