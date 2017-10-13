import java.util.Calendar;
import java.util.Date;

/**
 * Definition of MyDate class
 * CSC201 Assignment 10.14
 * 10/8/2017
 * @author Laura Witherspoon
 */

public class MyDate {
    private int year, month, day;

    /**
     * Default constructor to create new MyDate object with current time
     */
    MyDate() {
        this(new Date().getTime());
    }

    /**
     * Constructor to create new MyDate object with specific year, month and day
     * Month is not zero-based, so January is 1 ... December is 12
     */
    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Constructor to create new MyDate instance with given elapsed time
     * @param elapsedTime number of milliseconds elapsed
     */
    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    @Override
    public String toString() {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }

    /**
     * @return year of MyDate object
     */
    public int getYear() {
        return year;
    }

    /**
     * @return month of MyDate object
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return day of MyDate object
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the MyDate year, month, and day given a specified time elapsed
     * @param elapsedTime number of milliseconds elapsed since Jan 1, 1970
     */
    public void setDate(long elapsedTime) {
        Calendar calendar = convertElapsedTimeToCalendar(elapsedTime);

        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH) + 1; // MONTH is zero-based so need to add one
        this.day = calendar.get(Calendar.DAY_OF_MONTH);

    }

    /**
     * Creates a Calendar object based on a specified time elapsed
     * @param time elapsed time in milliseconds
     * @return Calendar object whose date is set to elapsed time
     */
    private Calendar convertElapsedTimeToCalendar(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);

        return calendar;
    }
}
