package info.androidhive.loginandregistration.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by drodriguez on 9/4/2016.
 */
public class timeslotModel {
    private String timeslot;
    private boolean booked;
    private String whobookedit;
    private List<timeslotModel> ListtimeslotModel;


    public timeslotModel(String timeslot, boolean booked, String whobookedit){
        this.timeslot = timeslot;
        this.booked = booked;
        this.whobookedit = whobookedit;

    }
    public timeslotModel(){

    }

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getWhobookedit() {
        return whobookedit;
    }

    public void setWhobookedit(String whobookedit) {
        this.whobookedit = whobookedit;
    }
    public List<timeslotModel> getAllTimeSlots(){
        // specify an adapter (see also next example)
        ListtimeslotModel = new ArrayList<timeslotModel>();


        for(int i=0; i<times.getAllTimes().size(); i++)
        {
            timeslotModel b = new timeslotModel();
            b.setTimeslot(times.getAllTimes().get(i));
            ListtimeslotModel.add(b);
        }
        return ListtimeslotModel;
    }

    public List<timeslotModel> getAllbookedSlots(){
        // specify an adapter (see also next example)
        ListtimeslotModel = new ArrayList<timeslotModel>();


        for(int i=0; i<times.getAllBooked().size(); i++)
        {
            timeslotModel b = new timeslotModel();
            b.setTimeslot(times.getAllBooked().get(i));
            ListtimeslotModel.add(b);
        }
        return ListtimeslotModel;
    }
    public List<timeslotModel> getNotAvailable(){
        // specify an adapter (see also next example)
        ListtimeslotModel = new ArrayList<timeslotModel>();


        for(int i=0; i<times.getAllNotAvailable().size(); i++)
        {
            timeslotModel b = new timeslotModel();
            b.setTimeslot(times.getAllNotAvailable().get(i));
            ListtimeslotModel.add(b);
        }
        return ListtimeslotModel;
    }
}
