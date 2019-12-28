package driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static Driver instanceDriver = null;

    private static WebDriver webDriver;

    private Driver() {
        webDriver = new ChromeDriver();
    }

    public static Driver getInstance() {
        if (instanceDriver == null) {
            return new Driver();
        } else {
            return instanceDriver;
        }
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
