package actions;

import pageobjects.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static test.Testable.driver;
public class MainActions {

    public static MainElements mainElements = PageFactory.initElements(driver, MainElements.class);
    public static Login loginPage = PageFactory.initElements(driver, Login.class);
    public static MyAccountPage myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
    public static ProductPages productPages = PageFactory.initElements(driver, ProductPages.class);
    public static Logout logoutPage = PageFactory.initElements(driver, Logout.class);
    public static Mp3PlayersCategory mp3category = PageFactory.initElements(driver, Mp3PlayersCategory.class);
    public static Cart cart = PageFactory.initElements(driver, Cart.class);


    public static void waitFor (WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void clickOnWebElement(WebElement webElement) {
        webElement.click();
    }

    public static void sendKeys(WebElement field, String characters) {
        field.sendKeys(characters);
    }
}
