package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.Set;

public class ForgotPasswordSteps extends CommonFunctions {

    @When("I click on forgot password Link")
    public void i_click_on_forgot_password_link() {
        driver.findElement(By.linkText("Forgotten Password")).click();
    }

    @When("I enter email {string} in reset password window")
    public void i_enter_email_in_reset_password_window(String email) {
        waitForTime(5);
        Set<String> windowsAppear = driver.getWindowHandles();
        if(windowsAppear.size()==2) {
            for (String currentWindow : windowsAppear) {
                    driver.switchTo().activeElement();
                   // driver.switchTo().defaultContent();
                    driver.switchTo().window(currentWindow);
                    driver.findElement(By.id("EmailOrAccountNumber")).sendKeys(email);
                }
        }
    }

    @When("I click reset button")
    public void i_click_reset_button() {

        driver.findElement(By.id("resetPassword")).click();
    }

}
