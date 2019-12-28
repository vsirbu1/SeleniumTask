package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
    @FindBy(xpath = "//*[@id='common-success']/ul/li[3]/a")
    WebElement logoutPage;

    @FindBy(xpath = "//*[@id='logo']/h1/a")
    WebElement btnHomePage;

    public WebElement getLogoutPage() {
        return logoutPage;
    }

    public WebElement getHomePageButton() {
        return btnHomePage;
    }
}
