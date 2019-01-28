### Selenium Factory Pattern w/@FindBy annotation ###

An example of page object factory patter with Selenium.

Elements are initialised in page clases and pages are created in test classes.

*Note:* Elements are initialised as @FindBy locators, as oppose to By objects.
- For more info on this, see here - https://github.com/SeleniumHQ/selenium/wiki/PageFactory 

### Driver Creation ###

This framework uses Selenium implementations of the drivers, defined in the DOM, it is currently not dynamic. 

### Tests ###

To run all tests in the terminal - mvn test

*Google Search* - This is a simple proof of concept test execution that performs a Google search...for google.

*Feeling Lucky* - This hits the feeling lucky button, chooses the first result and validates a page load