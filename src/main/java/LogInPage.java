import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage{

    @FindBy(css = "#username")
    WebElement emailAddressInputElement;

    @FindBy(css = "#password")
    WebElement passwordInputElement;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//h3[contains(.,'Are you a robot?')]")
    WebElement areYouARobotText;

    //constructor
    public LogInPage(ChromeDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email){
        waitForElement(emailAddressInputElement, 5);
        emailAddressInputElement.click();
        emailAddressInputElement.sendKeys(email);
    }

    public void enterPassword(String password){
        waitForElement(passwordInputElement, 5);
        passwordInputElement.click();
        passwordInputElement.sendKeys(password);
    }

    public void submit() {
        waitForElement(submitButton, 5);
        submitButton.click();
    }
}
