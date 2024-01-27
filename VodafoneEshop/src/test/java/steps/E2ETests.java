package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddItemToCartPage;
import pages.HomePage;
import pages.LoginPage;
import tests.TestBase;

public class E2ETests extends TestBase {
    HomePage homePageObject;
    LoginPage loginPageObject;
    AddItemToCartPage cartPageObject;
    @Given("^From the homepage the user can go to login page$")
    public void UserCanGoToLoginPage(){
        homePageObject = new HomePage(driver);
        homePageObject.UserCanClickOnLoginPage();
    }
    @When("^The user can login with his credentials \"([^\"]*)\",\"([^\"]*)\"$")
    public void UserCanLogin(String username, String password){
        loginPageObject = new LoginPage(driver);
        loginPageObject.UserLogin(username,password);
    }
    @And("The user can select first item and added to the shopping cart then go back to home page")
    public void UserCanAddFirstItemToShoppingCart(){
        homePageObject = new HomePage(driver);
        cartPageObject = new AddItemToCartPage(driver);
        homePageObject.UserCanClickOnFirstItem();
        cartPageObject.UserCanAddItemToCart();
        cartPageObject.UserCanGoToHomePage();
    }
    @And("The user can select second item and added to the shopping cart then go back to home page")
    public void UserCanAddSecondItemToShoppingCart(){
        homePageObject = new HomePage(driver);
        cartPageObject = new AddItemToCartPage(driver);
        homePageObject.UserCanClickOnSecondItem();
        cartPageObject.UserCanAddItemToCart();
        cartPageObject.UserCanGoToHomePage();
    }
    @Then("The user can search for {string} and select it and added to the shopping cart")
    public void UserCanSelectSearchedItem(String productName){
        homePageObject = new HomePage(driver);
        homePageObject.UserCanSelectSearchedItem(productName);
        cartPageObject = new AddItemToCartPage(driver);
        cartPageObject.UserCanAddItemToCart();
        cartPageObject.UserCanGoToHomePage();
    }
}
