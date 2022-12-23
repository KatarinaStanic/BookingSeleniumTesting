import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoundCarsPage extends BasePage {

    @FindBy(css = "#searchAgainTop")
    WebElement filterContainerElement;

    //constructor
    public FoundCarsPage(ChromeDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


}
