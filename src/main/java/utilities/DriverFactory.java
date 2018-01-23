package utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.BasePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory extends BasePage {
    public static void startBrowser() {
        String path = System.getProperty("user.dir") + "src/main/resources";
        if (AutomationConstants.RemoteBrowser == true) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setBrowserName("chrome");
            caps.setPlatform(Platform.WIN10);
            caps.setVersion("");
            try {
                driver = new RemoteWebDriver(new URL(AutomationConstants.gridUrl), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else {
            if (AutomationConstants.browserType.equalsIgnoreCase("Chrome")) {
                System.setProperty("WebDriver.chrome.driver", path + "chromedriver.exe");
            }
           else if(AutomationConstants.browserType.equalsIgnoreCase("FireFox")){
                System.setProperty("WebDriver.gecko.driver",path+ "FirefoxDriver.exe");
            }
            else if (AutomationConstants.browserType.equalsIgnoreCase("IE")){
               System.setProperty("WebDriver.ie.driver",path+ "InternetExplorerDriver.exe");

            }

        }
        driver.get(AutomationConstants.baseUrl);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

    }
    public static void stopBrowser(){
        if(driver!=null){
            driver.close();
            driver.quit();
        }
    }
    public static void getBrowser(){
        if (driver==null){
            DriverFactory.startBrowser();
        }
    }
}



