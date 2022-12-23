import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage extends CommonMethods{

    //web elementi
    @FindBy(css = ".bui-header__logo")
    WebElement mainLogo;

    @FindBy(css = ".bui-avatar")
    WebElement languageButton;

    ChromeDriver driver = null;

    // constructor
    public BasePage(ChromeDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


}
