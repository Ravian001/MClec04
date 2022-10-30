package com.example.lec4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*public class MainActivity extends AppCompatActivity {
TextView textView;
Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);*/

/*        textView= findViewById(R.id.hassantext);
        button = findViewById(R.id.hassanbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Text is changed by setOnClickListener");
            }

        });*/



/*
    }


}*/












    public class MainActivity extends AppCompatActivity implements View.OnClickListener
    {

        TextView textView;
        Button button;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        textView= findViewById(R.id.hassantext);
        button = findViewById(R.id.hassanbutton);
            button.setOnClickListener(this);
            textView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view)
        {
            switch (view.getId())
            {
                //handle multiple view click events
                case R.id.hassantext:
                    textView.setText("changed by my listener");
                    break;
                case R.id.hassanbutton:
                    textView.setText("Button");
                    break;
                default:
                    textView.setText("Nothing");
                    break;
            }




        }




    }





/*

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{


            TextView textView;
        Button button;

    @Override
    public void onClick(View view) {

    }

    private class ClickListener implements View.OnClickListener
    {




        @Override
        public void onClick(View view)
        {
            switch (view.getId())
            {
                //handle multiple view click events

                                case R.id.hassantext:
                                textView.setText("TextView");
                                break;
                case R.id.hassanbutton:
                    textView.setText("Button");
                    break;
                default:
                    textView.setText("Nothing");
                    break;
            }

            textView =findViewById(R.id.hassantext);
            button = findViewById(R.id.hassanbutton);
            button.setOnClickListener(this);
            textView.setOnClickListener(this);
        }
    }
}

*/
