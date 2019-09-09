package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class buttonMain2Activity extends AppCompatActivity {

    private Button buttonHelloEN,buttonHelloCN;
    private TextView textViewHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_main2);

        buttonHelloCN=this.findViewById(R.id.buttonCN);
        buttonHelloEN=this.findViewById(R.id.buttonEN);

        textViewHelloWorld=this.findViewById(R.id.textviewHelloWord);
        buttonHelloCN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewHelloWorld.setText(buttonHelloCN.getText());
            }
        });

        buttonHelloEN.setOnClickListener(new ButtonENClick());
    }

    private class ButtonENClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            textViewHelloWorld.setText(((Button)view).getText());
        }
    }
}
