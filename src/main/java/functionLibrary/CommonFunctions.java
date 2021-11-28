package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {

    public static WebDriver driver;
    public String screenShotFilePath = new File("src/main/resources/screenShots").getAbsolutePath();
    public String propFilePath = new File ("src/main/resources/testData/config.properties").getAbsolutePath();
    public void openBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

    }

    public void closeBrowser()
    {
        driver.quit();
    }

    public void waitForTime(int waitTime)
    {

        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
    }

    public void mouseOver(WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void keyPress(int key) throws Exception
    {
        Robot robot = new Robot();
        robot.keyPress(key);
    }

    public void clickWithJS(WebElement element)
    {
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("arguments[0].click();", element);
    }

    public void waitAndClick(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void takeScreenShot(String fileName) throws Exception
    {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File virtualFile = screenshot.getScreenshotAs(OutputType.FILE);
        File actualFile = new File (screenShotFilePath + fileName);
        FileUtils.copyFile(virtualFile, actualFile);
    }

    public String readPropertyFile(String key) throws Exception
    {
        FileInputStream propFile = new FileInputStream(propFilePath);
        Properties properties = new Properties();
        properties.load(propFile);
        String urlVal = properties.getProperty(key);
        return urlVal;

    }
}
