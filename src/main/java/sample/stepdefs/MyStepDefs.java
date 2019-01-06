package sample.stepdefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class MyStepDefs {

    WebDriver driver;

    @Given("verify page {}")
    public void verifyPage(String url) throws MalformedURLException {
        //driver = new ChromeDriver();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        capabilities.setCapability(CapabilityType.VERSION, "70.0");
        capabilities.setCapability(CapabilityType.PLATFORM, "macOS 10.13");
        capabilities.setCapability("seleniumVersion", "3.14.0");
        capabilities.setCapability("build", "testBuild3");
        capabilities.setCapability("name", "queue-test");

        WebDriver driver = new RemoteWebDriver(new URL("http://test:test-password@localhost:4444/wd/hub"), capabilities);

        driver.get(url);
        driver.quit();

    }

}
