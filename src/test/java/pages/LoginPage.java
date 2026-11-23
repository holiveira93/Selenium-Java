package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private String url = "https://the-internet.herokuapp.com/login";
    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By loginBtnLocator = By.cssSelector("#login > button > i") ;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUsername(String username){
        type(usernameLocator, username);
    }

    public void setPassword(String password){
        type(passwordLocator, password);
    }

    public SecureAreaPage clickLoginButton(){
        click(loginBtnLocator);
        return new SecureAreaPage(driver);
    }
}