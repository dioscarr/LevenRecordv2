package info.androidhive.loginandregistration.activity;

        import java.util.ArrayList;
        import java.util.List;

        import android.content.Intent;
        import android.content.res.AssetManager;
        import android.content.res.Resources;
        import android.graphics.Color;
        import android.graphics.Typeface;
        import android.support.design.widget.FloatingActionButton;
        import android.support.v4.content.ContextCompat;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.view.ViewGroup;
        import android.widget.CheckBox;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import info.androidhive.loginandregistration.Model.times;
        import info.androidhive.loginandregistration.Model.timeslotModel;
        import info.androidhive.loginandregistration.R;

public class scheduleAdapter extends RecyclerView.Adapter<scheduleAdapter.ViewHolder> {
    private List<timeslotModel> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtTime;
        public TextView txtDescription;
        ImageView user1;
        ImageView user2;
        CheckBox isBooked;

        public ViewHolder(View v) {
            super(v);
           // txtHeader = (TextView) v.findViewById(R.id.firstLine);
            user1 = (ImageView) v.findViewById(R.id.user1);
            user2 = (ImageView) v.findViewById(R.id.user2);
            txtTime = (TextView) v.findViewById(R.id.ScheduleRowTimeID);
            txtDescription = (TextView) v.findViewById((R.id.ScheduleRowDescriptionID));
            isBooked = (CheckBox) v.findViewById(R.id.isBooked);



        }
    }

    public void add(int position, String item) {
        // mDataset.add(position, item);
        //notifyItemInserted(position);position
    }

//    public void remove(String item) {
//        int position = mDataset.indexOf(item);
//        mDataset.remove(position);
//        notifyItemRemoved(position);
//    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public scheduleAdapter(List<timeslotModel> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public scheduleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_row, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //holder.txtHeader.setText(mDataset.get(position));
//        holder.txtHeader.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                remove(name);
//            }
//        });

        holder.txtTime.setText(mDataset.get(position).getTimeslot());

        final int index = position;
        final ViewHolder h = holder;
        h.txtDescription.setTextColor(Color.DKGRAY);
        h.txtDescription.setBackgroundColor(Color.rgb(250,250,250));
        h.txtDescription.setText("Available");
        h.user1.bringToFront();
        h.user1.setImageResource(R.drawable.ic_android_black_24dp);
        h.user2.bringToFront();
        h.user2.setImageResource(R.drawable.ic_android_black_24dp);
        h.isBooked.bringToFront();
        h.isBooked.setChecked(false);
        //checks if item was previously checked
        if(mDataset.get(index).isBooked())
        {
            h.isBooked.setChecked(true);
            h.txtDescription.setBackgroundColor(Color.rgb(76,175,80));
            h.txtDescription.setText("Booking in proccess");
            h.user1.setImageResource(R.drawable.kalid);
            h.user2.bringToFront();
        }



        timeslotModel tsm = new timeslotModel();

        for(int i=0;i<tsm.getNotAvailable().size();i++)
        {
            if(tsm.getNotAvailable().get(i).getTimeslot() == mDataset.get(position).getTimeslot())
            {
                h.txtDescription.setTextColor(Color.rgb(250,250,250));
                h.txtDescription.setBackgroundColor(Color.rgb(255,152,0));
                h.txtDescription.setText("Not Available");
                h.txtDescription.bringToFront();
            }
        }
        for(int i=0;i<tsm.getAllbookedSlots().size();i++)
        {
            if(tsm.getAllbookedSlots().get(i).getTimeslot() == mDataset.get(position).getTimeslot())
            {

                h.txtDescription.bringToFront();
                h.user1.bringToFront();
                h.user1.setImageResource(R.drawable.kalid);
                h.user2.bringToFront();
                h.user2.setImageResource(R.drawable.bufalo);
                h.txtDescription.setTextColor(Color.rgb(250,250,250));
                h.txtDescription.setBackgroundColor(Color.rgb(77,182,172));
                h.txtDescription.setText("Booked");
            }
        }

        holder.isBooked.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                CheckBox cb= (CheckBox) v;
                if(cb.isChecked())
                {
                    mDataset.get(index).setBooked(true);
                    h.txtDescription.setBackgroundColor(Color.rgb(76,175,80));
                    h.txtDescription.setText("Booking in proccess");
                    h.user1.setImageResource(R.drawable.kalid);
                    h.user2.bringToFront();
                    Toast.makeText(v.getContext(),"hey "+ mDataset.get(index).getTimeslot()
                            +" about to be booked"+ cb.isChecked(),Toast.LENGTH_LONG).show();
                }
                else
                {
                    mDataset.get(index).setBooked(false);
                    h.txtDescription.setBackgroundColor(Color.rgb(250,250,250));
                    h.txtDescription.setText("Available");
                    h.user1.setImageResource(R.drawable.ic_android_black_24dp);
                    h.user2.bringToFront();
                    Toast.makeText(v.getContext(),"Come Mierda!. Make up your mind you punk!",Toast.LENGTH_LONG).show();
                }


            }

        });









    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}