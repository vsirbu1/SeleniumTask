package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart {
    @FindBy(xpath = "//*[@id='content']/form/div/table/tbody/tr/td[4]/div/input")
    private WebElement countOfProduct;

    @FindBy(xpath = "//*[@id='cart-total']")
    private WebElement numberOfProducts;

    @FindBy(xpath = "//*[@id='content']/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]")
    private WebElement btnRemoveFromCart;

    public WebElement getCountOfProduct() {
        return countOfProduct;
    }

    public WebElement getNumberOfProducts() {
        return numberOfProducts;
    }

    public WebElement getBtnRemoveFromCart() {
        return btnRemoveFromCart;
    }
}
