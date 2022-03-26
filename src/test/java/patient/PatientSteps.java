package patient;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import patient.models.PatientScreenModel;

import java.util.GregorianCalendar;

public class PatientSteps {
    private PatientScreenModel patientScreenModel;

    public PatientSteps(PatientScreenModel psm) {
        this.patientScreenModel = psm;
    }

    @Given("^Patient opens the screen to book an appointment$")
    public void openPatientScreen() throws Throwable {
        // open screen
    }


    @When("^Enters first name: \"([^\"]*)\"$")
    public void entersFirstName(String firstName) throws Throwable {
        patientScreenModel.setFirstName(firstName);
    }


    @And("^Enters last name: \"([^\"]*)\"$")
    public void entersLastName(String lastName) throws Throwable {
        patientScreenModel.setLastName(lastName);
    }

    @And("^Enters email address: \"([^\"]*)\"$")
    public void entersEmailAddress(String emailAddress) throws Throwable {
        patientScreenModel.setEmailAddress(emailAddress);
    }

    @And("^Enters phone number: \"([^\"]*)\"$")
    public void entersPhoneNumber(String phoneNumber) throws Throwable {
        patientScreenModel.setPhone(phoneNumber);
    }

    @And("^Selects date and time of appointment: \"([^\"]*)\"$")
    public void selectsDateAndTimeOfAppointment(GregorianCalendar calendar) throws Throwable {
        patientScreenModel.setCalendar(calendar);
    }

    @And("^Clicks the button for booking an appointment$")
    public void clicksTheButtonForBookingAnAppointment() {
        patientScreenModel.clickBookAppointmentButton();
    }

    @Then("^Sees a response message: \"([^\"]*)\"$")
    public void seesAResponseMessage(String arg0) throws Throwable {
        // response
    }
}
