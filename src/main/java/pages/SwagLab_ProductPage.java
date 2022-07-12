package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwagLab_ProductPage extends BasePage {
    public SwagLab_ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']") private WebElement firstItemElement;



    public void clickAddToCart(){firstItemElement.click();}


}
