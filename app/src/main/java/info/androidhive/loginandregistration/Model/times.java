package info.androidhive.loginandregistration.Model;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by drodriguez on 9/4/2016.
 */
public class times {
    public static List<String> getAllTimes()
    {
        List<String>a =new ArrayList<String>();
        a.add("8:00 AM");
        a.add("8:30 AM");
        a.add("9:00 AM");
        a.add("9:30 AM");
        a.add("10:00 AM");
        a.add("10:30 AM");
        a.add("11:00 AM");
        a.add("11:30 AM");
        a.add("12:00 PM");
        a.add("12:30 PM");
        a.add("1:00 PM");
        a.add("1:30 PM");
        a.add("2:00 PM");
        a.add("2:30 PM");
        a.add("3:00 PM");
        a.add("3:30 PM");
        a.add("4:00 PM");
        a.add("4:30 PM");
        a.add("5:00 PM");
        a.add("5:30 PM");
        a.add("6:00 PM");
        a.add("6:30 PM");
        a.add("7:00 PM");
        a.add("7:30 PM");
        a.add("8:00 PM");
        a.add("8:30 PM");
        a.add("9:00 PM");
        a.add("9:30 PM");
        a.add("10:00 PM");
        a.add("10:30 PM");
        a.add("11:00 PM");
        a.add("11:30 PM");
        return a;
    }


    public static List<String> getAllBooked()
    {
        List<String>a =new ArrayList<String>();
        a.add("8:00 AM");
        a.add("8:30 AM");
        a.add("1:30 PM");
        a.add("2:00 PM");
        a.add("2:30 PM");
        a.add("3:00 PM");

        a.add("6:00 PM");
        a.add("6:30 PM");

        a.add("7:30 PM");
        a.add("8:00 PM");

        a.add("9:00 PM");
        a.add("9:30 PM");

        a.add("10:30 PM");
        a.add("11:00 PM");
        a.add("11:30 PM");
        return a;
    }

    public static List<String> getAllNotAvailable()
    {
        List<String>a =new ArrayList<String>();
        a.add("9:00 AM");
        a.add("9:30 AM");
        a.add("11:30 AM");

        a.add("3:30 PM");
        a.add("4:00 PM");
        a.add("4:30 PM");
        a.add("9:00 PM");
        a.add("9:30 PM");


        return a;
    }

    public static String getMonth(int month) {
        return new DateFormatSymbols().getMonths()[month-1];
    }
    public static String getDay(int day) {
        return new DateFormatSymbols().getShortWeekdays()[day];
    }


}
