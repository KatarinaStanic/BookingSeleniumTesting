import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarRentalsPage extends BasePage {
    //web elementi
    @FindBy(css = "#ss_origin")
    WebElement pickupLocationInput;

    @FindBy(css = "#return-location-different")
    WebElement returnLocationCheckbox;

    @FindBy(css = "#ss")
    WebElement dropOffLocationInput;

    @FindBy(xpath = "//button[@data-sb-id='main']")
    WebElement searchButton;

    @FindBy(xpath = "//li[@data-value='Belgrade Airport, Central Serbia, Serbia']")
    WebElement dropdownOptionBelgrade;


    // constructor
    public CarRentalsPage(ChromeDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterPickupLocation(String pickupLocation) {
//        clickOnElement(pickupLocationInput);
        pickupLocationInput.click();
        pickupLocationInput.sendKeys(pickupLocation);
    }

    public void selectBelgradeAirport(){
//        clickOnElement(dropdownOptionBelgrade);
        waitForElement(dropdownOptionBelgrade, 5);
        dropdownOptionBelgrade.click();
    }

    public void submitSearch(){
//        clickOnElement(searchButton);
        waitForElement(searchButton, 5);
        searchButton.click();
    }

}
