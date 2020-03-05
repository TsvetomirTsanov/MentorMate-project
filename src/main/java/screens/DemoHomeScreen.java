package screens;

import helpers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class DemoHomeScreen extends BaseScreen {

    @FindBy(xpath = "//div[contains(@class, 'resource-box')]//small")
    public List<WebElement> demoSiteRedirectButtons;

    public DemoHomeScreen(DriverManager driverManager) {
        super(driverManager);
    }

}
