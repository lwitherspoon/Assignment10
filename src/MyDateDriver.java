/**
 * Program to test drive the MyDate class
 * CSC201 Assignment 10.14
 * 10/8/2017
 * @author Laura Witherspoon
 */

public class MyDateDriver {

    public static void main(String[] args) {
        MyDate currentDate = new MyDate();
        System.out.println("Current Date: " + currentDate.toString());

        MyDate specificDate = new MyDate(34355555133101L);
        System.out.println("Specific Date: " + specificDate.toString());
    }
}
