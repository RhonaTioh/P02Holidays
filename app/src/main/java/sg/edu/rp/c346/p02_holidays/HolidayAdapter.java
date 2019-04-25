package sg.edu.rp.c346.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holidays> {

    private ArrayList<Holidays> holidays;
    private Context context;
    private TextView tvEventName;
    private TextView tvDate;
    private ImageView ivIcon;

    public HolidayAdapter(Context context, int resource, ArrayList<Holidays> objects) {
        super(context, resource, objects);
        holidays = objects;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);


        tvEventName = rowView.findViewById(R.id.tvEventName);
        tvDate = rowView.findViewById(R.id.tvDate);
        ivIcon = rowView.findViewById(R.id.ivIcon);


        Holidays currentModule = holidays.get(position);

        tvEventName.setText(currentModule.getEvent());
        tvDate.setText(currentModule.getDate());

        if(currentModule.getEvent() == "New Year's Day!") {
            ivIcon.setImageResource(R.drawable.newyear);
        }
        else if (currentModule.getEvent() == "Labour Day") {
            ivIcon.setImageResource(R.drawable.labourday);
        }
        return rowView;


    }
}