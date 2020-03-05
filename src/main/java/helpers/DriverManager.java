package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager {
    private WebDriver driver;
    private final String geckoDriverPath ="E:/geckodriver.exe";

    public void createWebDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                System.setProperty("webdriver.gecko.driver", geckoDriverPath);
                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                throw new RuntimeException("Unsupported browser " + browser);
        }
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        driver.quit();
    }

}
