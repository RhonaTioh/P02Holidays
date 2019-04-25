package sg.edu.rp.c346.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView lvEvents;
    TextView textViewSecular;
    ArrayAdapter aa;
    ArrayList<Holidays> holidays;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewSecular = (TextView) findViewById(R.id.textViewSecular);
        lvEvents = (ListView) this.findViewById(R.id.listViewEvents);

        Intent i = getIntent();
        int selected = i.getIntExtra("selected",0);
        holidays = new ArrayList<Holidays>();

        if(selected == 1) {
            holidays = new ArrayList<Holidays>();
            holidays.add(new Holidays("New Year's Day", "1 Jan 2017"));
            holidays.add(new Holidays("Labour Day", "1 May 2017"));
            aa = new HolidayAdapter(this, R.layout.row, holidays);
            lvEvents.setAdapter(aa);
        }

        lvEvents.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holidays selectedevents = holidays.get(position);

                Toast.makeText(Main2Activity.this, selectedevents.getEvent() + selectedevents.getDate() , Toast.LENGTH_LONG).show();
            }
        });


    }
}
