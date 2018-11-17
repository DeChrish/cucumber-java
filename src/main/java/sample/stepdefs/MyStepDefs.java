package sample.stepdefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepDefs {

    WebDriver driver;

    @Given("verify page {}")
    public void verifyPage(String url) {
        driver = new ChromeDriver();
        driver.get(url);
        driver.quit();

    }

}
