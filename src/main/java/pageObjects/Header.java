package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

    public Header(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="")
    public WebElement logoICon;

    @FindBy(id="")
    public WebElement searchTxtFld;

    @FindBy(id="")
    public WebElement searchIcon;

    @FindBy(xpath="")
    public WebElement bagIcon;

    @FindBy(xpath="")
    public WebElement FavIcon;

    @FindBy(linkText = "")
    public WebElement storeLocatorLink;

    @FindBy(id="")
    public WebElement languageIcon;


    public void enterSearchTerm(String searchTerm)
    {
        searchTxtFld.sendKeys(searchTerm);
    }

    public void clickSearchIcon()
    {
        searchIcon.click();
    }

    public void clickBagIcon()
    {
        bagIcon.click();
    }

}
