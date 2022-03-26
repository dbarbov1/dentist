import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty", "html:target/cucumber-patient"}, glue = {"patient"}, features = {"src/test/resources/patient"})
public class HomeScreenStarter {

}