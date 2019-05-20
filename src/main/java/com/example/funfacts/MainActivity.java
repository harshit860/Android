package com.example.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView facttextview;
    private Button showfactbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facttextview = (TextView)findViewById(R.id.facttextview);
        showfactbutton=(Button)findViewById(R.id.showfactbutton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] facts = {
                        "I am an android developer ",
                        "I am currently working in jadeglobal",
                        "Skils:-Java,android,xml,ruby,html,kotlin",
                        "I have worked on various android feautures like recyclerview,json parsing,videoplayers etc",
                        "I am a Btech graduate from Chitkara university rajpura punjab",
                        "My email id is:harshitga@gmail.com",
                        "I love working out "};
                Random randomgenerator = new Random();
                int randomnumber=randomgenerator.nextInt(facts.length);
                String fact = facts[randomnumber];
                facttextview.setText(fact);
            }
        };
        showfactbutton.setOnClickListener(listener);
    }
}


