import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarRentalsPageTest extends BaseTest {


    @Test
    public void bookAVehicleTest() {
        ChromeDriver driver = openChromeDriver();
        HomePage homePage = new HomePage(driver);
        homePage.goToCarRentals();

        CarRentalsPage carRentalsPage = new CarRentalsPage(driver);
        carRentalsPage.enterPickupLocation("Belgrade");
        carRentalsPage.selectBelgradeAirport();
        carRentalsPage.submitSearch();

        FoundCarsPage foundCarsPage = new FoundCarsPage(driver);
        Assert.assertNotNull(foundCarsPage.filterContainerElement);

        driver.quit();
    }
}
