package sample.stepdefs;

import sample.enums.COLOR;
import sample.enums.SHAPE;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepDefs {


    @Given("^verify color (.*)$")
    public void verifyColor(COLOR color) {
        //Assert.assertEquals(color.toString(),"RED","Test Case passed");
    }


    @Given("^verify shape (.*)")
    public void verifyShape(SHAPE shape) {

        //Assert.assertEquals(shape.toString(),"TRIANGLE","Test Case passed");
    }

    @Given("verify page {}")
    public void verifyPage(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.quit();

    }

}
