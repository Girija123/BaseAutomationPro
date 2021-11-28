package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.Header;

import java.util.List;

public class SearchSteps extends CommonFunctions {

    Header header = new Header(driver);

    @When("I enter search term {string}")
    public void i_enter_search_term(String searchTerm) {
        header.enterSearchTerm(searchTerm);
    }

    @When("I click search icon")
    public void i_click_search_icon() {
        header.clickSearchIcon();
    }

    @Then("I should get relevant resluts contains {string} in product name")
    public void i_should_get_relevant_resluts_contains_in_product_name(String expectedTextInProductName) {

        List<WebElement> productNameList = driver.findElements(By.xpath("//article/section/div/h2/a/span"));
        for (WebElement productName : productNameList) {
            Assert.assertTrue(productName.getText().contains(expectedTextInProductName));
        }
    }

}
