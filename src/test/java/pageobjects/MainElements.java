package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainElements {
    @FindBy(xpath = "//*[@id='top-links']/ul/li[2]/a")
    private WebElement dropDownMyAccount;

    @FindBy(xpath = "//*[@id='top-links']/ul/li[2]/ul/li[2]/a")
    private WebElement loginOption;

    @FindBy(xpath = "//*[@id='top-links']/ul/li[2]/ul/li[5]/a")
    private WebElement logOutOption;

    public WebElement getDropDownMyAccount() {
        return dropDownMyAccount;
    }

    public WebElement getLoginOption() {
        return loginOption;
    }

    public WebElement getLogOutOption() {
        return logOutOption;
    }
}
