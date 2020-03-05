package screens;

import helpers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PHPTravelHomeScreen extends BaseScreen{

    @FindBy(xpath = "//div[contains(@class, 'hero-form')]//nav//li")
    public List<WebElement> searchTabs;

    @FindBy(xpath = "//div[contains(@class, 'hero-form')]")
    public WebElement heroForm;

    public PHPTravelHomeScreen(DriverManager driverManager){
        super(driverManager);
        waitForElement(heroForm);
    }


    public WebElement findTabByName(String tabName){
        return getElementByText(searchTabs,tabName);
    }
}
