import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty", "html:target/cucumber-login"}, glue = {"patient", "dentist"}, features = {"src/test/resources/patient", "src/test/resources/patient"})
public class HomeScreenStarter {

}