package com.example.anuas.smokingapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.anuas.smokingapplication.R.id.money;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        float nicFinal2=getIntent().getFloatExtra("nicFinal",10);
        float costFinal2=getIntent().getFloatExtra("costFinal",120);
        double timeFinal2=getIntent().getDoubleExtra("timeFinal",10);

        TextView textNic=(TextView)findViewById(R.id.nicotine);
        textNic.setText(Float.toString(nicFinal2)+"mg");

        TextView textCost=(TextView)findViewById(R.id.money);
        textCost.setText("$"+Float.toString(costFinal2));

        TextView textTime=(TextView)findViewById(R.id.lifespan);
        textTime.setText(Double.toString(timeFinal2)+"days");





    }
}
