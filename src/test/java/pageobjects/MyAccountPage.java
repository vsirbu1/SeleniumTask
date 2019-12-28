package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
    @FindBy(xpath = "//*[@id='search']/input")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id='search']/span/button")
    private WebElement searchButton;

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
