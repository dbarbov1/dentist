package staff.models;

import models.Patient;
import models.Staff;

import java.util.GregorianCalendar;

public class StaffScreenModel {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phone;
    private String message;
    private GregorianCalendar calendar;

    public String clickBookAppointmentButton() {
        Staff staff = new Staff();
        return staff.createAppointment(calendar);
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }
}
