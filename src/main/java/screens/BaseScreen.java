package screens;

import helpers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BaseScreen {

    private DriverManager driverManager;
    private WebDriver driver;
    private int waitTimeout = 10;

    public BaseScreen(DriverManager driverManager) {
        this.driverManager = driverManager;
        driver = driverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void waitForElement(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, waitTimeout);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public WebElement getElementByText(List<WebElement> elements, String text){
        for(int i = 0; i < elements.size(); i++){
            if(elements.get(i).getText().equals(text)){
                return elements.get(i);
            }
        }
        throw new RuntimeException(text + " tab can't be found." );

    }
}