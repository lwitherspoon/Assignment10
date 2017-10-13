import org.junit.Test;

import static org.junit.Assert.*;

public class MyDateTest {
    MyDate currentDate = new MyDate(2017, 10,20);

    @Test
    public void getYear() throws Exception {
        assertEquals("Incorrect year", 2017, currentDate.getYear());
    }

    @Test
    public void getMonth() throws Exception {
        assertEquals("Incorrect month", 10, currentDate.getMonth());
    }

    @Test
    public void getDay() throws Exception {
        assertEquals("Incorrect Day", 20, currentDate.getDay());
    }

    @Test
    public void setDate() throws Exception {
        currentDate.setDate(561555550000L);
        assertEquals("Date not set correctly", "MyDate: 10/18/1987" , currentDate.toString());
    }

}