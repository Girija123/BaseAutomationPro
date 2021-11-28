package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class RegistrationTestSteps extends CommonFunctions {

    @Given("I'm on Home Page {string}")
    public void i_m_on_home_page(String url) throws Exception {

        String urlVal = readPropertyFile("url");
        driver.get(urlVal);

        waitForTime(2);
        takeScreenShot("/homeScreen.png");
    }

    @When("I click on My Account link")
    public void i_click_on_my_account_link() throws Exception {
        driver.findElement(By.linkText("My Account")).click();
        takeScreenShot("/LoginScreen.png");
    }

    @When("I click Register Now button")
    public void i_click_register_now_button() {
        driver.findElement(By.xpath("//*[@id=\"sec\"]/div/a")).click();
    }

    @Then("I should on the sign up page with text {string}")
    public void i_should_on_the_sign_up_page_with_text(String expectedRegPageText) {
        String actualRegPageText = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/h2")).getText();
        Assert.assertEquals(expectedRegPageText, actualRegPageText);

        new Select(driver.findElement(By.id("Title"))).selectByVisibleText("Miss");

        driver.findElement(By.id("Title")).click();
        driver.findElement(By.xpath("//*[@id=\"dk_container_Size-417-188\"]/div/ul/li[5]/a")).click();
    }

}
