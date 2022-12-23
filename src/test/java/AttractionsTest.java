import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AttractionsTest extends BaseTest{


    @Test
    public void choseAttractionsTest(){
        ChromeDriver driver = openChromeDriver();
        HomePage homePage = new HomePage(driver);
        homePage.goToAttractions();

        AttractionsPage attractionsPage = new AttractionsPage(driver);
        attractionsPage.enterDestinationInput("Paris");
        attractionsPage.enterDate("2022-12-30", "2022-12-31");
        attractionsPage.submitSearch();
    }


}
