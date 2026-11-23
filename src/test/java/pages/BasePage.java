package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriverWait wait;
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.driver.manage().window().maximize();
    }

    public WebElement findElement(By locator){
        this.wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return this.driver.findElement(locator);
    }

    public void click(By locator){
        findElement(locator).click();
    }

    public void type(By locator, String key){
        findElement(locator).sendKeys(key);
    }

    public String getText(By locator) {
        return findElement(locator).getText();
    }
}
