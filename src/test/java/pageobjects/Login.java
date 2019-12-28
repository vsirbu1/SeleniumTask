package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
    @FindBy(xpath = "//*[@id='input-email']")
    private WebElement txtEmail;

    @FindBy(xpath = "//*[@id='input-password']")
    private WebElement txtPassword;

    @FindBy(xpath = "//*[@id='content']/div/div[2]/div/form/input")
    private WebElement btnLogin;

    public WebElement getEmailField() {
        return txtEmail;
    }

    public WebElement getPasswordField() {
        return txtPassword;
    }

    public WebElement getLoginButton() {
        return btnLogin;
    }
}
