package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.SwagLab_CheckoutPage;
import pages.SwagLab_ProductPage;
import utilities.PropertiesReader;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SwagLab_StepDef extends BaseUtil {
    private BaseUtil base;

    public SwagLab_StepDef(BaseUtil base) {
        this.base = base;
    }

//SUCCESSFULLY ADDING THE ITEM
    @Given("I am on the sauce demo home page - Swag Labs")
    public void iAmOnTheSauceDemoHomePageSwagLabs() {
        base.driver.navigate().to("https://www.saucedemo.com/");
    }

    @When("I enter an acceptable username {string} and password {string}, and click the LOG IN button")
    public void iEnterAnAcceptableUsernameAndPasswordAndClickTheLOGINButton(String userNAME, String passWORD) {

        base.driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(userNAME);
        base.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWORD);
        base.driver.findElement(By.xpath("//input[@name='login-button']")).click();
    }

    @When("I add an item to cart by clicking on “ADD TO CART” button for the item")
    public void iAddAnItemToCartByClickingOnADDTOCARTButtonForTheItem() {

        SwagLab_ProductPage swagLab_productPage = new SwagLab_ProductPage(base.driver);
        swagLab_productPage.clickAddToCart();
    }

    @Then("my Cart should show that an item has just been added in it")
    public void myCartShouldShowThatAnItemHasJustBeenAddedInIt() {
        assertThat(base.driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).isDisplayed(), equalTo(true));
    }


    @When("I checkout the item by entering my information as first name{string}, last name {string} and ZIP code as {string} on the Checkout Your Information page")
    public void iCheckoutTheItemByEnteringMyInformationAsFirstNameLastNameAndZIPCodeAsOnTheCheckoutYourInformationPage(String fNAME, String lNAME, String ZIP) {
        base.driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
        base.driver.findElement(By.xpath("//button[@name='checkout']")).click();
        SwagLab_CheckoutPage swagLab_checkoutPage = new SwagLab_CheckoutPage(base.driver);
        swagLab_checkoutPage.enterFirstName(fNAME);
        swagLab_checkoutPage.enterLastName(lNAME);
        swagLab_checkoutPage.enterPostcode(ZIP);

    }

    @Then("I click the CONTINUE button, I should be directed to the Checkout Overview page which should display the correct information {string}.")
    public void iClickTheCONTINUEButtonIShouldBeDirectedToTheCheckoutOverviewPageWhichShouldDisplayTheCorrectInformation(String ITEM) {
        SwagLab_CheckoutPage swagLab_checkoutPage = new SwagLab_CheckoutPage(base.driver);
        swagLab_checkoutPage.clickContinueButton();
        assertThat(base.driver.findElement(By.xpath("//div[@class='inventory_item_name']")).isDisplayed(), equalTo(true));
    }

    @When("I click Finish on the Checkout Overview page")
    public void iClickFinishOnTheCheckoutOverviewPage() {
        SwagLab_CheckoutPage swagLab_checkoutPage = new SwagLab_CheckoutPage(base.driver);
        swagLab_checkoutPage.clickOnFinishButton();

    }

    @Then("I am directed to the “CHECKOUT: COMPLETE!” page")
    public void iAmDirectedToTheCHECKOUTCOMPLETEPage() {
        assertThat(base.driver.findElement(By.xpath("//span[@class='title']")).isDisplayed(), equalTo(true));
    }



//SUCCESSFULLY REMOVING THE ITEM

    @Given("I am on the sauce demo home page,")
    public void iAmOnTheSauceDemoHomePage() throws IOException {

        PropertiesReader propertiesReader=new PropertiesReader();
        base.driver.get(propertiesReader.getSwagLabsURL());

    }
    @When("I enter acceptable username {string} and password {string}, and click the LOGIN")
    public void iEnterAcceptableUsernameAndPasswordAndClickTheLOGIN(String userNAME, String passWORD) {
        base.driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(userNAME);
        base.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWORD);
        base.driver.findElement(By.xpath("//input[@name='login-button']")).click();
    }

    @When("I add one item to cart by clicking on “ADD TO CART” button for the item,")
    public void iAddOneItemToCartByClickingOnADDTOCARTButtonForTheItem() {
        SwagLab_ProductPage swagLab_productPage = new SwagLab_ProductPage(base.driver);
        swagLab_productPage.clickAddToCart();
    }

    @Then("my Cart should show that the item I just added is in it,")
    public void myCartShouldShowThatTheItemIJustAddedIsInIt() {
        assertThat(base.driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).isDisplayed(), equalTo(true));

    }

    @When("I Click on Remove button on the “YOUR CART” page,")
    public void iClickOnRemoveButtonOnTheYOURCARTPage() {
        base.driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
        base.driver.findElement(By.xpath("//button[@name='remove-sauce-labs-backpack']")).click();
    }

    @Then("item is removed from cart,")
    public void itemIsRemovedFromCart() {

        assertThat(base.driver.findElement(By.xpath("//span[@class='title']")).isDisplayed(), equalTo(true));
    }


}
