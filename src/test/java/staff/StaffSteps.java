package staff;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import staff.models.StaffScreenModel;

import java.util.GregorianCalendar;

public class StaffSteps {

    private StaffScreenModel staffScreenModel;

    public StaffSteps(StaffScreenModel staffScreenModel) {
        this.staffScreenModel = staffScreenModel;
    }

    @Given("^Member of the staff opens the screen to book an appointment$")
    public void openStaffScreen() {

    }

    @When("^Enters first name of patient : \"([^\"]*)\"$")
    public void entersFirstNameOfPatient(String first_name) throws Throwable {
        staffScreenModel.setFirstName(first_name);
    }

    @And("^Enters last name of patient : \"([^\"]*)\"$")
    public void entersLastNameOfPatient(String last_name) throws Throwable {
        staffScreenModel.setLastName(last_name);
    }

    @And("^Enters email address of patient : \"([^\"]*)\"$")
    public void entersEmailAddressOfPatient(String email_addr) throws Throwable {
        staffScreenModel.setEmailAddress(email_addr);
    }

    @And("^Enters phone number of patient : \"([^\"]*)\"$")
    public void entersPhoneNumberOfPatient(String phone) throws Throwable {
        staffScreenModel.setPhone(phone);
    }

    @And("^Selects date and time of appointment for patient: \"<Date and time>\"$")
    public void selectDateAndTimeForAppointment(GregorianCalendar calendar) {
        staffScreenModel.setCalendar(calendar);
    }

    @And("^Clicks the button for booking an appointment for patient$")
    public void clicksTheButtonForBookingAnAppointmentForPatient() {
        staffScreenModel.setMessage(staffScreenModel.clickBookAppointmentButton());
    }


    @Then("^Sees a response message regarding appointment: \"([^\"]*)\"$")
    public String seesAResponseMessageRegardingAppointment() throws Throwable {
        return staffScreenModel.getMessage();
    }
}
