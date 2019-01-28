package basictests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import components.HomePage;
import components.SearchResultsPage;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {

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
    public void googleForGoogle() {
        //Create the home page object
        HomePage home = new HomePage(driver);
        SearchResultsPage searchResults =  new SearchResultsPage(driver);

        home.performAGoogleSearch();
        searchResults.resultsAreReturned();
    }

    @After
    public void close(){
        driver.close();
    }
}


