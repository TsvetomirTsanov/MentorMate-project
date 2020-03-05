package steps;

import helpers.DriverManager;
import io.cucumber.java.en.When;
import screens.DemoHomeScreen;

import java.util.ArrayList;

public class DemoHomeSteps {
    private DriverManager driverManager;

    public DemoHomeSteps(DriverManager driverManager){
        this.driverManager = driverManager;
    }


    @When("^I click on the (\\d+)(st|nd|rd) demo site redirect button$")
    public void clickDemoSiteRedirectButton(Integer buttonIndex, String str) {
        DemoHomeScreen demoHomeScreen = new DemoHomeScreen(driverManager);
        String oldTab = driverManager.getDriver().getWindowHandle();
        demoHomeScreen.demoSiteRedirectButtons.get(buttonIndex - 1).click();
        ArrayList<String> newTab = new ArrayList<String>(driverManager.getDriver().getWindowHandles());
        newTab.remove(oldTab);
        driverManager.getDriver().switchTo().window(newTab.get(0));
    }

}
