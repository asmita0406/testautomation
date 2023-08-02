package cucumber.options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature", glue = "Stepdefinition",tags="@Reg", plugin= "html:target/test/cucumber.html")
public class Runner {

}
