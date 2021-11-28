package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.event.KeyEvent;

public class MenuTestSteps extends CommonFunctions {

    static String menuOpt;

    @When("I click on Menu Option {string}")
    public void i_click_on_menu_option(String menuOption) {
        driver.findElement(By.xpath("//span[text()='" + menuOption + "']")).click();
    }

    @Then("I should be in appropriate product list page with title {string}")
    public void i_should_be_in_appropriate_product_list_page_with_title(String expectedPageTitle) {
        String actualPageTitle = driver.getTitle();
        Assert.assertTrue(actualPageTitle.contains(expectedPageTitle));
    }

    @When("I mouseover on Menu Option {string}")
    public void i_mouseover_on_menu_option(String menuOption) {
        WebElement menu = driver.findElement(By.xpath("//span[text()='" + menuOption + "']"));
        mouseOver(menu);
        menuOpt = menuOption;
    }

    @When("I click on sub menu option {string}")
    public void i_click_on_sub_menu_option(String subMenuOption) {
        WebElement subMenu = driver.findElement(By.xpath("//div[@data-parentname='" + menuOpt + "']/div/ul/li/div/a[text()='" + subMenuOption + "']"));
        clickWithJS(subMenu);
    }

}
