import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    //web elementi
    @FindBy(css = "[data-testid='herobanner-title1']")
    WebElement title;

    @FindBy(xpath = "//a[@data-decider-header='bookinggo']")
    WebElement carRentalsBtn;

    @FindBy(xpath = "//div[@class='bui-group__item']//span[text()[contains(.,'Sign in')]]")
    WebElement signInButton;

    @FindBy(css = "[data-modal-aria-label='Select your currency']")
    WebElement currencyBtn;

    @FindBy (css = "[data-modal-id='language-selection']")
    WebElement languageBtn;

    @FindBy (css = "[lang='sr'] ")
    WebElement srbLangBtn;

    @FindBy(xpath = "//div[contains(text(),'Czech Koruna')]")
    WebElement czechKorunaButton;

    @FindBy(xpath = "//button[@data-modal-aria-label='Select your currency']//span[@aria-hidden='true']")
    WebElement currencyAbbreviation;

    @FindBy (xpath = "//a[@data-decider-header='flights']//span[2]")
    WebElement flightsBtnText;

    @FindBy (css = "[data-decider-header='attractions']")
    WebElement attractionsBtn;

    public HomePage(ChromeDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToCarRentals(){
        carRentalsBtn.click();
    }

    public void goToSignIn() {
        clickOnElement(signInButton);
    }

    public void changeCurrency(){
        currencyBtn.click();
        waitForElement(czechKorunaButton, 5);
        czechKorunaButton.click();
    }

    public void changeLaunguage() {
        languageBtn.click();
        waitForElement(srbLangBtn,5);
        srbLangBtn.click();

    }

    public void goToAttractions (){
        waitForElement(attractionsBtn,5);
        attractionsBtn.click();

    }
}