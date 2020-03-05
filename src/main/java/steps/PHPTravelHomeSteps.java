package steps;

import helpers.DriverManager;
import io.cucumber.java.en.And;
import screens.PHPTravelHomeScreen;

public class PHPTravelHomeSteps {
    private DriverManager driverManager;

    public PHPTravelHomeSteps(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @And("^I select (.*) tab$")
    public void selectTab(String tab) {
        PHPTravelHomeScreen screen = new PHPTravelHomeScreen(driverManager);
        screen.findTabByName(tab).click();
    }
}


