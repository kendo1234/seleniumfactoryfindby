package basictests;

import components.HomePage;
import components.SearchResultsPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class FeelinLucky {
    WebDriver driver;

    @Before
    public void setup() {
        //use FF Driver
        FirefoxOptions opts = new FirefoxOptions();
        opts.setHeadless(true);
        driver = new FirefoxDriver(opts);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //Perform a simple google search and verify the results page renders
    @Test
    public void feelingLucky(){
        HomePage home = new HomePage(driver);
        SearchResultsPage searchResults =  new SearchResultsPage(driver);

        home.feelingLucky();
        searchResults.luckyResultsAreReturned();
    }

    @After
    public void close(){
        driver.close();
    }
}

