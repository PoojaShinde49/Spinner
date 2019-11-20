package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText e1=(EditText)findViewById(R.id.edittext);
        final Spinner s1=(Spinner)findViewById(R.id.spinner1);
        final Spinner s2=(Spinner)findViewById(R.id.spinner2);
        final Spinner s3=(Spinner)findViewById(R.id.spinner3);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view,int position, long id) {
                e1.setTextColor(Color.parseColor(s1.getSelectedItem().toString()));
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
                // TODO Auto-generated method stub

            }

        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view,int position, long id) {

                e1.setTextSize( Integer.parseInt(s2.getSelectedItem().toString()));
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
                // TODO Auto-generated method stub

            }

        });

        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view,int position, long id) {
                if(s3.getSelectedItem().toString().equals("bold"))
                    e1.setTypeface(Typeface.DEFAULT_BOLD);

                else if(s3.getSelectedItem().toString().equals("normal"))
                    e1.setTypeface(Typeface.DEFAULT);

                else if(s3.getSelectedItem().toString().equals("italic"))
                    e1.setTypeface(Typeface.create(Typeface.SANS_SERIF,Typeface.ITALIC));

            }
            public void onNothingSelected(AdapterView<?> adapterView) {
                // TODO Auto-generated method stub

            }

        });




    }
}
