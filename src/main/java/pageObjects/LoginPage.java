package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="")
    public WebElement usernameTxtFld;

    @FindBy(xpath="")
    public WebElement passwordTxtFld;

    @FindBy(xpath="")
    public WebElement loginBtn;

    public void enterUsername(String email)
    {
        usernameTxtFld.sendKeys(email);
    }

    public  void enterPassword(String password)
    {
        passwordTxtFld.sendKeys(password);
    }

    public void clickLoginBtn()
    {
        loginBtn.click();
    }
}
