import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AttractionsPage extends BasePage {

    @FindBy(css = "[type='search']")
    WebElement destinationInputEl;

    @FindBy(xpath = "//div[@class='db29ecfbe2' and contains(text(), 'Paris, Ile de France')]")
    WebElement destination;

    @FindBy(css = ".css-17mdy6j")
    WebElement selectDate;

    @FindBy(css = "[type='submit']")
    WebElement searchButton;

    ChromeDriver driver = null;

    //constructor
    public AttractionsPage(ChromeDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void enterDestinationInput(String destinationInput) {
        destinationInputEl.click();
        destinationInputEl.sendKeys(destinationInput);
        waitForElement(destination, 3);
        destination.click();
    }


    public void enterDate(String startDate, String endDate){
        selectDate.click();
        String startDateSelector = "[data-date='" + startDate + "']";
        WebElement startDateEl = this.driver.findElementByCssSelector(startDateSelector);
        waitForElement(startDateEl, 2);
        startDateEl.click();

        WebElement endDateEl = this.driver.findElementByCssSelector("[data-date='" + endDate + "']");
        waitForElement(endDateEl, 2);
        endDateEl.click();
    }

    public void submitSearch(){
        waitForElement(searchButton,5);
        searchButton.click();
    }

}
