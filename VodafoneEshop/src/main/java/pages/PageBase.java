package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver;
    JavascriptExecutor jse;
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    protected static void clickButton(WebElement button)
    {
        button.click();
    }

    protected static void setTextElementText(WebElement textElement,String value)
    {
        textElement.sendKeys(value);
    }

    public void scrollToCategory()
    {
        jse.executeScript("scrollBy(0,1200)");
    }

}
