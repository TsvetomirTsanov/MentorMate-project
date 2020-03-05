package helpers;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/features/BookCheapiestTour.feature"},
        glue = {"steps"}
)

public class RunCucumberTest extends AbstractTestNGCucumberTests {

}

