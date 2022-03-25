package models;

import interfaces.User;
import services.CalendarService;

import java.util.*;

/**
 * 
 */
public class Staff implements User {

    CalendarService calendarService;
    /**
     * Default constructor
     */
    public Staff() {
    }

    /**
     * 
     */
    public int id;

    /**
     * 
     */
    public String username;

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
    public int function_id;

    /**
     * 
     */
    public String password;

    /**
     * 
     */
    public int created_at;

    /**
     * 
     */
    public void createAppointment() {
        // TODO implement here
        if(this.function_id == Function.DENTIST || this.function_id == Function.ASSISTANT){
            this.calendarService.createAppointment(this);
        }
    }

    /**
     * 
     */
    public void deleteAppointment() {
        // TODO implement here
    }

    /**
     * 
     */
    public void updateAppointment() {
        // TODO implement here
    }

}