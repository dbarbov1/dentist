package services;

import interfaces.User;
import models.Calendar;
import models.Function;
import models.Staff;

import java.util.ArrayList;

/**
 *
 */
public class CalendarService {

    private static ArrayList<Calendar> calendarArrayList = new ArrayList<Calendar>();

    /**
     * Default constructor
     */
    public CalendarService() {
    }

    /**
     * @param user
     */
    public void createAppointment(User user) {
        // TODO implement here
        if (user instanceof Staff) {

        }
    }

    /**
     * @param user
     */
    public void deleteAppointment(User user) {
        // TODO implement here
    }

    /**
     * @param user
     */
    public void updateAppointment(User user) {
        // TODO implement here
    }

    /**
     * @param user
     */
    public String createAvailablePeriod(User user, int start_time, int end_time) {
        if (user instanceof Staff && ((Staff) user).function_id == Function.DENTIST) {
            if (start_time < end_time) {
                calendarArrayList.add(Calendar.createAvailablePeriod(start_time, end_time));
                return "Available period is added successfully";
            }

            return "End time cannot be sooner than start time";
        }

        return "Insufficient permissions";

    }

}