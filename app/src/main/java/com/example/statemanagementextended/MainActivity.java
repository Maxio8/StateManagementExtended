package com.example.statemanagementextended;

import android.graphics.Color; 
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView counterText;
    private Switch tryb;
    private TextView textInput;
    private EditText text;
    private CheckBox checkBox;
    private int Count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        counterText = findViewById(R.id.counterText);
        text= findViewById(R.id.editTextName);
        checkBox = findViewById(R.id.checkBox);
        textInput = findViewById(R.id.textInput);
        tryb = findViewById(R.id.switch1);

        counterText.setText("Licznik: " + Count);

        // switch
        tryb.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {

                findViewById(android.R.id.content).setBackgroundColor(Color.BLACK);
            } else {

                findViewById(android.R.id.content).setBackgroundColor(Color.WHITE);
            }
        });

        // checkbox
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                textInput.setVisibility(View.VISIBLE);
            } else {
                textInput.setVisibility(View.GONE);
            }
        });

        // Licznik / Button
        button.setOnClickListener(v -> {
            String textInput2 = text.getText().toString().trim();
            textInput.setText(textInput2);
            Count++;
            counterText.setText("Licznik: " + Count);
        });
    }
}


