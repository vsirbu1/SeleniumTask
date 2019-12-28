package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mp3PlayersCategory {
    @FindBy(xpath = "//*[@id='content']/div[4]/div[1]/div/div[2]/div[2]/button[1]")
    private WebElement btnAddToCart1;

    @FindBy(xpath = "//*[@id='content']/div[4]/div[2]/div/div[2]/div[2]/button[1]")
    private WebElement btnAddToCart2;

    @FindBy(xpath = "//*[@id='content']/div[4]/div[3]/div/div[2]/div[2]/button[1]")
    private WebElement btnAddToCart3;

    public WebElement getBtnAddToCart1() {
        return btnAddToCart1;
    }

    public WebElement getBtnAddToCart2() {
        return btnAddToCart2;
    }

    public WebElement getBtnAddToCart3() {
        return btnAddToCart3;
    }
}
