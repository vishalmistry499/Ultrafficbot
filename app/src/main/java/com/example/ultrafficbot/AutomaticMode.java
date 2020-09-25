package com.example.ultrafficbot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AutomaticMode extends AppCompatActivity {

    private EditText Lighttext,Mediumtext,HeavyText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automatic_mode);

        Lighttext=findViewById(R.id.Light);
        Mediumtext=findViewById(R.id.Medium);
        HeavyText=findViewById(R.id.Heavy);
    }


    public void Validate(View v)
    {
        int light=0,medium=0,heavy=0,lflag=1,mflag=1,hflag=1;

        String tosend=new String();

        if(TextUtils.isEmpty(Lighttext.getText().toString().trim()))
        {
            lflag=0;
            Lighttext.setError("Enter value");
        }

        if(TextUtils.isEmpty(Mediumtext.getText().toString().trim()))
        {
            mflag=0;
            Mediumtext.setError("Enter value");
        }

        if(TextUtils.isEmpty(HeavyText.getText().toString().trim()))
        {
            hflag=0;
            HeavyText.setError("Enter value");
        }


        if(lflag==1) {

            light = Integer.parseInt(Lighttext.getText().toString());
            if (light < 0 || light > 60) {
                lflag = 0;
                Lighttext.setError("The seconds should be between 0 and 60");
            }
        }

        if(mflag==1) {
            medium = Integer.parseInt(Mediumtext.getText().toString());
            if (medium < 0 || medium > 60) {
                mflag = 0;
                Mediumtext.setError("The seconds should be between 0 and 60");
            }
        }

        if(hflag==1) {

            heavy = Integer.parseInt(HeavyText.getText().toString());
            if (heavy < 0 || heavy > 60) {
                hflag = 0;
                HeavyText.setError("The seconds should be between 0 and 60");
            }
        }


            if (hflag == 1 && mflag==1 && lflag==1) {
                tosend = "light=" + light + "medium=" + medium + "heavy" + heavy+"\n";
                Toast toast = Toast.makeText(getApplicationContext(), tosend, Toast.LENGTH_SHORT);
                toast.show();

            }
        }


    }
