package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddItemToCartPage extends PageBase{
    public AddItemToCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()=' أضف الي عربة التسوق ']")
    WebElement AddToCartBtn;
    @FindBy(className = "header-link")
    WebElement closeLoginPage;
    @FindBy(className = "logo-text")
    WebElement ClickOnHomePage;

    public void UserCanAddItemToCart(){
        clickButton(AddToCartBtn);
    }
    public void UserCanGoToHomePage(){
        clickButton(ClickOnHomePage);
    }
}
