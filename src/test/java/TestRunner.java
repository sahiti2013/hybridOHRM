import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/java/features/",
            tags = "@ADDEMP_001",
            format = {"json:target/cucumber.json","html:target/CucumberHTMLReports"})
    public class TestRunner {
}
