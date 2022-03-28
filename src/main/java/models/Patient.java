package models;

import interfaces.User;
import services.CalendarService;

import java.util.*;

/**
 *
 */
public class Patient implements User {

    /**
     * Default constructor
     */
    public Patient(String first_name, String last_name, String email_address, String phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
        this.phone_number = phone_number;
    }

    /**
     *
     */
    public int id;

    /**
     *
     */
    public String first_name;

    /**
     *
     */
    public String last_name;

    /**
     *
     */
    public String email_address;

    /**
     *
     */
    public String phone_number;


    /**
     *
     */
    public String createAppointment(GregorianCalendar gregorianCalendar) {
        return CalendarService.bookAppointment(this, gregorianCalendar);
    }

    /**
     *
     */
    public void confirmAppointment() {
        // TODO implement here
    }

}