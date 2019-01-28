package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

    WebDriver driver;

    //Locators
    @FindBy(id = "resultStats")
    private WebElement topNavBarResults;

    @FindBy(css = "#highlight > ul:nth-child(1) > li:nth-child(1) > div:nth-child(1)")
    private WebElement luckyResult;


    //Page Constructor
    public SearchResultsPage(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void resultsAreReturned() {
        topNavBarResults.isDisplayed();
    }

    public void luckyResultsAreReturned(){
        luckyResult.click();
        //TODO - add some validation for actually visiting a search result

    }
}
