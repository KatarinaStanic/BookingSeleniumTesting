import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;

public class BaseTest {

    public ChromeDriver openChromeDriver() {
        print("Opening Chrome driver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String []{"--start-maximized"});
        options.addArguments(new String []{"--ignore-certificate-errors"});
        options.addArguments(new String []{"--disable-popup-blocking"});
        options.addArguments(new String []{"--incognito"});
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.booking.com/");
        return driver;
    }


    public boolean isCurrentURLEqualTo(ChromeDriver driver, String expectedUrl) {
        print("isCurrentURLEqualTo ( " + expectedUrl + " )");
        String currentUrl = driver.getCurrentUrl();
        print("User is on " + currentUrl);
        return currentUrl.contains(expectedUrl);
    }


    public void print (String s) {System.out.println(s);}
}
