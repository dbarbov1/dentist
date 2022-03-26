package dentist;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dentist.models.DentistScreenModel;

public class DentistSteps {

    private DentistScreenModel dentistScreenModel;

    public DentistSteps(DentistScreenModel dsm) {
        this.dentistScreenModel = dsm;
    }

    @Given("^Dentist opens the screen to add available period$")
    public void openDentistScreen() {
        // open dentist screen
    }

    @When("^Enters year: \"([^\"]*)\"$")
    public void entersYear(int year) throws Throwable {
        dentistScreenModel.setYear(year);
    }

    @And("^Enters month: \"([^\"]*)\"$")
    public void entersMonth(int month) throws Throwable {
        dentistScreenModel.setMonth(month);
    }

    @And("^Enters day: \"([^\"]*)\"$")
    public void entersDay(int day) throws Throwable {
        dentistScreenModel.setDay(day);
    }

    @And("^Enters hour: \"([^\"]*)\"$")
    public void entersHour(int hour) throws Throwable {
        dentistScreenModel.setHour(hour);
    }

    @And("^Enters minutes: \"([^\"]*)\"$")
    public void entersMinutes(int minutes) throws Throwable {
        dentistScreenModel.setMinutes(minutes);
    }

    @And("^Click the button for adding available period$")
    public String clickTheButtonForAddingAvailablePeriod() {
        return dentistScreenModel.addAvailablePeriod();
    }
}
