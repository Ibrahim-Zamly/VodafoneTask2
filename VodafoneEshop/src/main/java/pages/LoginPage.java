package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    WebElement inputUsername;
    @FindBy(id = "password")
    WebElement inputPassword;
    @FindBy(id = "submitBtn")
    WebElement submitBtn;
    public void UserLogin(String username, String password) {
        setTextElementText(inputUsername,username);
        setTextElementText(inputPassword,password);
        clickButton(submitBtn);
    }
}
