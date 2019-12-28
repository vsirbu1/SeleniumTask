package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPages {
    @FindBy(xpath = "//a[@href='https://demo.opencart.com/index.php?route=product/category&path=33']")
    private WebElement btnCameraCategory;

    @FindBy(xpath = "//*[@id='content']/div[2]/div[2]/div/div[2]/div[2]/button[1]/i")
    private WebElement btnAddToCart;

    @FindBy(xpath = "//*[@id='top-links']/ul/li[5]/a")
    private WebElement btnCheckout;

    @FindBy(xpath = "//*[@id='content']/form/div/table/thead/tr/td[2]")
    private WebElement sideLeft;

    @FindBy(xpath = "//*[@id='content']/form/div/table/thead/tr/td[5]")
    private WebElement sideRight;

    @FindBy(xpath = "//*[@id='content']/form/div/table/thead/tr/td[1]")
    private WebElement sideCenter;

    @FindBy(xpath = "//*[@id='content']/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]")
    private WebElement btnDeleteFromCart;

    @FindBy(xpath = "//*[@id='column-left']/div[1]/a[8]")
    private WebElement btnMpCategory;

    @FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[8]/a")
    private WebElement btnShowAllMp3;

    public WebElement getBtnMpCategory() {
        return btnMpCategory;
    }

    public WebElement getBtnShowAllMp3() {
        return btnShowAllMp3;
    }

    public WebElement getBtnDeleteFromCart() {
        return btnDeleteFromCart;
    }

    public WebElement getBtnCameraCategory() {
        return btnCameraCategory;
    }

    public WebElement getBtnAddToCart() {
        return btnAddToCart;
    }

    public WebElement getBtnCheckout() {
        return btnCheckout;
    }

    public WebElement getSideLeft() {
        return sideLeft;
    }

    public WebElement getSideRight() {
        return sideRight;
    }

    public WebElement getSideCenter() {
        return sideCenter;
    }
}
