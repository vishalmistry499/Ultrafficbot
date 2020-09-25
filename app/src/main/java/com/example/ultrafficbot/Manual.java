package com.example.ultrafficbot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

public class Manual extends AppCompatActivity {

    private EditText Redtext,Yellowtext,Greentext,Durationtext;
    private Button send;
    private PopupWindow popUp;
    boolean click = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);


        Redtext=findViewById(R.id.Redvalue);
        Yellowtext=findViewById(R.id.yellowvalue);
        Greentext=findViewById(R.id.greenvalue);
        Durationtext=findViewById(R.id.durationvalue);
        send=findViewById(R.id.button);




    }

    public void Validate(View v)
    {
       int red=0,yellow=0,green=0,rflag=1,yflag=1,gflag=1,dflag=1;
       Double duration=0.0;
       String tosend=new String();

        if(TextUtils.isEmpty(Redtext.getText().toString().trim()))
        {
            rflag=0;
            Redtext.setError("Enter value");
        }

        if(TextUtils.isEmpty(Yellowtext.getText().toString().trim()))
        {
            yflag=0;
            Yellowtext.setError("Enter value");
        }

        if(TextUtils.isEmpty(Greentext.getText().toString().trim()))
        {
            gflag=0;
            Greentext.setError("Enter value");
        }

        if(TextUtils.isEmpty(Durationtext.getText().toString().trim()))
        {
            dflag=0;
            Durationtext.setError("Enter value");
        }

        if(rflag==1) {

            red = Integer.parseInt(Redtext.getText().toString());
            if (red < 0 || red > 60) {
                rflag = 0;
                Redtext.setError("The seconds should be between 0 and 60");
            }
        }

        if(yflag==1) {
            yellow = Integer.parseInt(Yellowtext.getText().toString());
            if (yellow < 0 || yellow > 60) {
                yflag = 0;
                Yellowtext.setError("The seconds should be between 0 and 60");
            }
        }

        if(gflag==1) {
            green = Integer.parseInt(Greentext.getText().toString());
            if (green < 0 || green > 60) {
                gflag = 0;
                Greentext.setError("The seconds should be between 0 and 60");
            }
        }

        if(dflag==1) {

            duration = Double.parseDouble(Durationtext.getText().toString());
            if (duration < 0 || duration > 24) {
                dflag = 0;
                Durationtext.setError("The hours should be between 0 and 24");
            }
        }

            if (dflag == 1 && gflag==1 && rflag==1 && yflag==1) {
                tosend = "red=" + red + "yellow=" + yellow + "green" + green + "duration" + duration + "\n";
                Toast toast = Toast.makeText(getApplicationContext(), tosend, Toast.LENGTH_SHORT);
                toast.show();

            }
        }


    }
