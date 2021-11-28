package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps extends CommonFunctions {

    LoginPage loginPage =  new LoginPage(driver);

    @When("I enter username {string}")
    public void i_enter_username(String email) {
       loginPage.enterUsername(email);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
       loginPage.enterPassword(password);
    }

    @When("I click Login Button")
    public void i_click_login_button() {
       loginPage.clickLoginBtn();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
       
    }

}
