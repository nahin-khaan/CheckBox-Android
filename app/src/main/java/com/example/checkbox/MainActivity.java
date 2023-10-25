package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox mango, pineapple, jackfruits, banana;
    Button buyButton;
    TextView resultview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //checkbox find from xml through id
        mango = findViewById(R.id.mangoCheckbox);
        pineapple = findViewById(R.id.pineappleCheckbox);
        jackfruits = findViewById(R.id.jackfruitCheckbox);
        banana = findViewById(R.id.bananaCheckbox);
        buyButton = findViewById(R.id.buyButton);
        resultview = findViewById(R.id.result);

        //use onClick method in buy button
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //create StringBuilder class object
                StringBuilder build = new StringBuilder();


                //if else check list condition statement through isChecked()  method
                if (mango.isChecked()) {
                    String value = mango.getText().toString();
                    build.append(value + " is ordered\n");
                }
                if (pineapple.isChecked()) {
                    String value = pineapple.getText().toString();
                    build.append(value + " is ordered\n");
                }
                if (jackfruits.isChecked()) {
                    String value = jackfruits.getText().toString();
                    build.append(value + " is ordered\n");
                }
                if (banana.isChecked()) {
                    String value = banana.getText().toString();
                    build.append(value + " is ordered\n");
                }
                resultview.setText(build);

            }
        });


    }
}