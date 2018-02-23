package com.example.anuas.smokingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nicResult;
    EditText yearsResult;
    EditText costResult;

    TextView nicotine;
    TextView lifespan;
    TextView money;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });





    }


    public void summary(View view)
    {



        float nic=12;
        nicResult= (EditText) findViewById(R.id.cigarettes);
        float nicR=Float.parseFloat(nicResult.getText().toString());

        yearsResult= (EditText) findViewById(R.id.yearSmoked);
        float timeR=Float.parseFloat(yearsResult.getText().toString());

        float totalContent=nicR*nic*timeR;
        //nicotine.setText(Float.toString(totalContent));


        costResult= (EditText) findViewById(R.id.cost);
        float costR=Float.parseFloat(costResult.getText().toString());

        float totalCost=costR*nicR;
        //money.setText(Float.toString(totalCost));

        double tim1=0.007;


        double totalTime=tim1*timeR*365*nicR;
        //lifespan.setText(Double.toString(totalTime));

        Intent i= new Intent(this,SummaryActivity.class);
        i.putExtra("nicFinal",totalContent);
        i.putExtra("costFinal",totalCost);
        i.putExtra("timeFinal",totalTime);
        startActivity(i);


        // ResultBox= (TextView) findViewById(R.id.Result);
        //percentTxt=(EditText) findViewById(R.id.percentagetxt);
        //num1=(EditText) findViewById(R.id.num);
        // float cigPerDay=Float.parseFloat(R.id.cigarettes.getText().toString);
        //float percentage= Float.parseFloat(percentTxt.getText().toString());
        // float Num2=Float.parseFloat(num1.getText().toString());
        //float total= percentage+Num2;
        //ResultBox.setText(Float.toString(total));

    }
}
