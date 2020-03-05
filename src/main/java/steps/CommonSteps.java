package steps;

import helpers.DriverManager;
import io.cucumber.java.en.And;

public class CommonSteps {
    private DriverManager driverManager;
    private final String browser = "firefox";

    public CommonSteps(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @And("I start the browser")
    public void startBrowser() {
        driverManager.createWebDriver(browser);
    }

    @And("I stop the browser")
    public void stopBrowser() {
        driverManager.quitDriver();
    }

    @And("^I open (.*) url$")
    public void navigateToUrl(String url) {
        driverManager.getDriver().get(url);
    }


}