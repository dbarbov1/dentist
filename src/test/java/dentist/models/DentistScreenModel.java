package dentist.models;

import models.Staff;
import services.CalendarService;

import java.util.GregorianCalendar;

public class DentistScreenModel {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minutes;

    public String addAvailablePeriod() {
        if (this.year == 0 || this.year < 0) {
            return "Invalid value for year";
        }

        if (this.month < 1 || this.month > 12) {
            return "Invalid value for month";
        }
        if (this.day < 1 || this.day > 30) {
            return "Invalid value for day";
        }
        if (this.hour < 0 || this.hour > 24) {
            return "Invalid value for hour";
        }
        if (this.minutes < 0 || this.minutes > 60) {
            return "Invalid value for minutes";
        }
        return CalendarService.createAvailablePeriod(this.year, this.month, this.day, this.hour, this.minutes);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
