package models;

import java.util.*;

/**
 *
 */
public class Calendar {

    /**
     * Default constructor
     */
    private Calendar() {

    }

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
    public static Calendar createAvailablePeriod(int start_time, int end_time) {
        Calendar calendar = new Calendar();

        calendar.start_time = start_time;
        calendar.end_time = end_time;
        return calendar;

    }

}