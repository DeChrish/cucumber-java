package hook;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = {"src/main/features/datareader/datareader.feature","src/main/features/member-function/login/login.feature"},
        features = {"src/test/features"},
        tags={"@smoke"},
        plugin = {"pretty", "html:target/cucumber-report", "json:target/cucumber-report/header-links.json"},
        glue = "sample.stepdefs")
public class TestRunner {
    // empty
}
