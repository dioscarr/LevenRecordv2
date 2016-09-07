package info.androidhive.loginandregistration.Model;

/**
 * Created by drodriguez on 9/1/2016.
 */

import java.io.Serializable;

@SuppressWarnings("serial") //With this annotation we are going to hide compiler warnings
public class ScheduleModel implements Serializable {
    private double id;
    private  int year;
    private  int month;
    private  int day;
    private  int hour;
    private  int minutes;
    private  String email;
    private  String title;
    private  String description;
    private  String time_zone;
    private String timeSlot;
    private String dayOfTheWeek;
    private String strMonth;

    public ScheduleModel(double id, int year, int month, int day, int hour, int minutes, String email, String title, String description, String time_zone, String timeSlot, String dayOfTheWeek, String strMonth ) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minutes = minutes;
        this.email = email;
        this.title = title;
        this.description = description;
        this.time_zone = time_zone;
        this.timeSlot = timeSlot;
        this.dayOfTheWeek = dayOfTheWeek;
        this.strMonth = strMonth;
    }
    public ScheduleModel()
    {

    }
    public double getId() {
        return id;
    }
    public void setId(double id) {
        this.id = id;
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
    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day)
    {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour)
    {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes)
    {
        this.minutes = minutes;
    }

    public String getEmail() {
        return email;
    }
    public void seEmail(String email)
    {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescrption() {
        return description;
    }
    public void  setDescription(String description)
    {
        this.description = description;
    }

    public String getTime_zone() {
        return time_zone;
    }
    public void setTime_zone(String time_zone)
    {
        this.time_zone = time_zone;
    }

    public String getSelectedDate() {
        return this.month+"/"+ this.day +"/"+this.year;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getStrMonth() {
        return strMonth;
    }

    public void setStrMonth(String strMonth) {
        this.strMonth = strMonth;
    }
}