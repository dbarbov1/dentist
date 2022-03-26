package services;

import interfaces.User;
import models.Function;
import models.Patient;
import models.Staff;

import java.util.*;

/**
 *
 */
public class CalendarService {

    private static HashMap<GregorianCalendar, Boolean> calendarBooleanHashMap = new HashMap<GregorianCalendar, Boolean>();

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
    public static String createAvailablePeriod(User user, int year, int month, int day, int hour, int minute) {
        if (user instanceof Staff && ((Staff) user).function_id == Function.DENTIST) {
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.set(year, month, day, hour, minute);
            if (calendarBooleanHashMap.put(calendar, false)) {
                return "Available period is added successfully";
            }
            return "Failed to add available period";
        }

        return "Insufficient permissions";

    }

    public static String bookAppointment(User user, GregorianCalendar calendar) {
        if (user instanceof Staff) {
            calendarBooleanHashMap.put(calendar, true);
            return "Successfully booked appointment by staff (No confirmation required)";
        } else if (user instanceof Patient) {
            calendarBooleanHashMap.put(calendar, true);
            boolean sent = sendConfirmationEmail();
            return "You have successfully booked an appointment (Please confirm it in the email that we have sent you)";
        }
        return "Failed to book an appointment (selected period is not available)";
    }

    private static boolean sendConfirmationEmail() {
        return true;
    }

}