package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwagLab_CheckoutPage extends BasePage {
    public SwagLab_CheckoutPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement FirstNameElement;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement LastNameElement;
    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement PostcodeZipElement;
    @FindBy(xpath = "//input[@name='continue']")
    private WebElement ContinueCheckOutElement;

    @FindBy(xpath = "//button[@name='finish']")
    private WebElement FinishButtonElement;



    public void enterFirstName(String fNAME) {
        FirstNameElement.sendKeys(fNAME);
    }

    public void enterLastName(String lNAME) {
        LastNameElement.sendKeys(lNAME);
    }

    public void enterPostcode(String ZIP) {
        PostcodeZipElement.sendKeys(ZIP);
    }

    public void clickContinueButton(){ContinueCheckOutElement.click();}

    public void clickOnFinishButton(){FinishButtonElement.click();}
}
