package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver;
    }

    @FindBy(xpath = "//*[text()=' سامسونج جالاكسي Fold 5 رام 12 جيجابايت، تخزين 256 جيجابايت  ']")
    WebElement clickOnFirstItem;
    @FindBy(id = "onetrust-close-btn-container")
    WebElement closeTrustMsg;
    @FindBy (xpath = "//*[text()=' أوبو هاتف ذكي A78  ']")
    WebElement clickOnSecondItem;
    @FindBy(id = "searchInput")
    WebElement searchBar;
    @FindBy(className = "product-result")
    WebElement searchedItem;
    @FindBy(id = "userProfileMenu")
    WebElement clickOnLoginPage;

    public void UserCanClickOnFirstItem() {
        scrollToCategory();
        clickButton(clickOnFirstItem);
    }

    public void UserCanClickOnSecondItem(){
        scrollToCategory();
        clickButton(clickOnSecondItem);
    }
    public void UserCanSelectSearchedItem(String search){
        setTextElementText(searchBar,search);
        clickButton(searchedItem);
    }
    public void UserCanClickOnLoginPage(){
        clickButton(closeTrustMsg);
        clickButton(clickOnLoginPage);
    }
}
