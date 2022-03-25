package models;

import java.util.*;

/**
 * 
 */
public class Appointment {

    /**
     * Default constructor
     */
    public Appointment() {
    }

    /**
     * 
     */
    public int user_id;

    /**
     * 
     */
    public int patient_id;

    /**
     * 
     */
    public int description;

    /**
     * 
     */
    public int created_at;

    /**
     * 
     */
    public int start_time;

    /**
     * 
     */
    public int end_time;

    /**
     * @param start_time
     * @param end_time
     */
    public void checkAvailableTimeRange(int start_time, int end_time) {
        // TODO implement here
    }

}