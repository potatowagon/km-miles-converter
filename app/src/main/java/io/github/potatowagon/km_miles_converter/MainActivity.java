package io.github.potatowagon.km_miles_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText milesInput;
    private EditText kmInput;
    private Button convKmToMiles;
    private Button convMilesToKm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // registering selectors
        this.milesInput = findViewById(R.id.milesInput);
        this.kmInput = findViewById(R.id.kmInput);
        this.convKmToMiles = findViewById(R.id.convKmToMiles);
        this.convMilesToKm = findViewById(R.id.convMilesToKm);

        this.convKmToMiles.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                try {
                    double km = Double.valueOf(kmInput.getText().toString());
                    double milesAns = ConversionService.kmToMiles(km);
                    milesInput.setText(new DecimalFormat("##.##").format(milesAns));
                } catch (java.lang.NumberFormatException e) {
                    CharSequence msg = "Please enter a valid KM value";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                }
            }
        });

        this.convMilesToKm.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                try {
                    double miles = Double.valueOf(milesInput.getText().toString());
                    double kmAns = ConversionService.milesToKm(miles);
                    kmInput.setText(new DecimalFormat("##.##").format(kmAns));
                } catch (java.lang.NumberFormatException e) {
                    CharSequence msg = "Please enter a valid miles value";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
