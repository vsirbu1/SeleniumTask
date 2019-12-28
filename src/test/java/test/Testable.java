package test;

import actions.MainActions;
import additional.NumberProducts;
import driver.Driver;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.is;

import static actions.MainActions.*;

public class Testable {
    public static WebDriver driver;

    @BeforeAll
    public static void Before() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = Driver.getInstance().getWebDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

    }

    @BeforeEach
    public void beforeTests() {
        MainActions.clickOnWebElement(mainElements.getDropDownMyAccount());
        MainActions.waitFor(mainElements.getLoginOption());
        MainActions.clickOnWebElement(mainElements.getLoginOption());
        MainActions.waitFor(loginPage.getLoginButton());
        MainActions.sendKeys(loginPage.getEmailField(), "vvs@vvs.vvs");
        MainActions.sendKeys(loginPage.getPasswordField(), "123123");
        MainActions.clickOnWebElement(loginPage.getLoginButton());
        MainActions.waitFor(myAccountPage.getSearchButton());
    }

    @AfterEach
    public void afterTest() {
        MainActions.clickOnWebElement(mainElements.getDropDownMyAccount());
        MainActions.waitFor(mainElements.getLoginOption());
        MainActions.clickOnWebElement(mainElements.getLogOutOption());
        MainActions.waitFor(logoutPage.getLogoutPage());
        clickOnWebElement(logoutPage.getHomePageButton());
    }



    @Test
    public void addProductToCart() throws InterruptedException {
        clickOnWebElement(productPages.getBtnCameraCategory());
        clickOnWebElement(productPages.getBtnAddToCart());
        clickOnWebElement(productPages.getBtnCheckout());
        MatcherAssert.assertThat(productPages.getSideCenter().isDisplayed(), is(true));
        MatcherAssert.assertThat(productPages.getSideLeft().isDisplayed(), is(true));
        MatcherAssert.assertThat(productPages.getSideRight().isDisplayed(), is(true));
    }

    @Test
    public void addTheSameProductAndDelete() throws InterruptedException {
        clickOnWebElement(productPages.getBtnCameraCategory());
        clickOnWebElement(productPages.getBtnAddToCart());
        clickOnWebElement(productPages.getBtnCheckout());
        while (!driver.getPageSource().contains("0 item(s) - $0.00")) {
            clickOnWebElement(productPages.getBtnDeleteFromCart());
            driver.navigate().refresh();
        }
        driver.navigate().refresh();
        MatcherAssert.assertThat(driver.getPageSource().contains("0 item(s) - $0.00"), is(true));
    }

    @Test
    public void addMultipleProductsAndDeleteOne() throws InterruptedException {
        waitFor(productPages.getBtnCameraCategory());
        clickOnWebElement(productPages.getBtnCameraCategory());
        waitFor(productPages.getBtnAddToCart());
        clickOnWebElement(productPages.getBtnAddToCart());
        driver.navigate().refresh();
        waitFor(productPages.getBtnMpCategory());
        clickOnWebElement(productPages.getBtnMpCategory());
        waitFor(mp3category.getBtnAddToCart1());
        clickOnWebElement(mp3category.getBtnAddToCart1());
        clickOnWebElement(mp3category.getBtnAddToCart2());
        clickOnWebElement(mp3category.getBtnAddToCart3());
        clickOnWebElement(productPages.getBtnCheckout());
        String s = cart.getNumberOfProducts().getText();
        int k = NumberProducts.numberProducts(s);
        int t = Integer.parseInt(cart.getCountOfProduct().getAttribute("value"));
        clickOnWebElement(cart.getBtnRemoveFromCart());
        driver.navigate().refresh();
        s = cart.getNumberOfProducts().getText();
        int j = NumberProducts.numberProducts(s);
        MatcherAssert.assertThat(k - j == t, is(true));

    }
    @AfterAll
    static void afterAll() {
        driver.quit();
    }
}
