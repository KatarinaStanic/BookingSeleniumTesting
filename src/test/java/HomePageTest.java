import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    ChromeDriver driver = openChromeDriver();
    HomePage homePage = new HomePage(driver);
    String CZK_ABBREVIATION = "CZK";

    @Test
    public void changeLanguageTest() {
        homePage.changeLaunguage();
        String textOnHomePage = homePage.flightsBtnText.getText();
        Assert.assertEquals("Letovi",textOnHomePage);
    }

    @Test
    public void changeCurrencyTest() {
        homePage.changeCurrency();
        String textOfCurrencyButton = homePage.currencyAbbreviation.getText();
        Assert.assertEquals(CZK_ABBREVIATION, textOfCurrencyButton);
    }

    @Test
    public void homePageTest() {
        assert isCurrentURLEqualTo(driver, "https://www.booking.com/");
    }

    }

