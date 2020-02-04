package com.fengjustin.quiz;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    EditText responseText;
    EditText response2Text;
    TextView displayText;
    int x=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=findViewById(R.id.clickButton);
        responseText=findViewById(R.id.responseEditText);
        response2Text=findViewById(R.id.response2EditText);
        displayText=findViewById(R.id.textBox);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x+=1;
                System.out.println("Hello mom");
                Log.i("testButton","Hi dad! "+responseText.getText());
                displayText.setTextColor(Color.parseColor(""+response2Text.getText()));
                displayText.setText("Hello "+responseText.getText()+"\nTotal Clicks:"+ x+"");
            }
        });
    }
}