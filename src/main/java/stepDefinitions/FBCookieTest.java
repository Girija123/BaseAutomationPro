package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBCookieTest  extends CommonFunctions {

    @When("I accept cookie")
    public void i_accept_cookie() {
       waitAndClick(driver.findElement(By.xpath("//button[@title='Allow All Cookies']")));
    }
}
