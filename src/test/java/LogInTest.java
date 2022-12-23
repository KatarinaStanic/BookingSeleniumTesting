import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void logInTest() {
        ChromeDriver driver = openChromeDriver();
        HomePage homePage = new HomePage(driver);
        homePage.goToSignIn();

        LogInPage logInPage = new LogInPage(driver);
        logInPage.enterEmail("kastanic94@gmail.com");
        logInPage.submit();
        logInPage.enterPassword("Katarina123");
        logInPage.submit();

        Assert.assertNotNull(logInPage.areYouARobotText);
//        driver.quit();
    }
}
