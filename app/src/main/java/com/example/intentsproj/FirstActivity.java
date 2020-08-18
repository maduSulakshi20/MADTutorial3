package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button btnOK;
    Toast toast1;
    EditText inputNumber1;
    EditText inputNumber2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        inputNumber1= findViewById(R.id.inputNumber1);
        inputNumber2= findViewById(R.id.inputNumber2);
        btnOK = (Button) findViewById(R.id.btnOK);

        btnOK.setOnClickListener(new View.OnClickListener() {



                @Override
                public void onClick(View v) {
                    /*Context context = getApplicationContext();
                    CharSequence text = "Sending message";
                    int duration = Toast.LENGTH_SHORT;
                    toast1 = Toast.makeText(context,text,duration);
                    toast1.setGravity(Gravity.BOTTOM,0,0);
                    toast1.show();*/

                    Intent intent1 = new Intent(FirstActivity.this, SecondActivity.class);

                    intent1.putExtra("N1",inputNumber1.getText().toString());
                    intent1.putExtra("N2",inputNumber2.getText().toString());
                    //Creating the LayoutInflater instance
                    LayoutInflater li = getLayoutInflater();
                    //Getting the View object as defined in the customtoast.xml file
                    @SuppressLint("WrongViewCast")
                    View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                            findViewById(R.id.custom_toast_image));

                    //Creating the Toast object
                    Toast toast = new Toast(getApplicationContext());
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.setView(layout);
                    //setting the view of custom toast layout
                    toast.show();
                    startActivity(intent1);
                }
            });

        }

    }