package com.globant.testing.pageobjects;

import com.globant.testing.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.Matchers;
import org.junit.Assert;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    private WebElementFacade inputName;

    @FindBy(id = "password")
    private WebElementFacade inputPassword;

    @FindBy(id = "login-button")
    private WebElementFacade loginBtn;

    @FindBy(css = "span.title")
    private WebElementFacade labelTitle;



    public void clickOnLogin() {
        this.loginBtn.click();
    }

    public void setPassword(String password) {
        this.inputPassword.sendKeys(password);
    }

    public void setUsername(String username) {
        this.inputName.sendKeys(username);
    }

    public void validate() {
        Assert.assertThat("the title of the page is ", labelTitle.getText(), Matchers.equalTo(Constants.TITLE) );
    }
}
