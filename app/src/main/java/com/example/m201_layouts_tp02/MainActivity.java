package com.example.m201_layouts_tp02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculer = findViewById(R.id.calc);

        btnCalculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    EditText editGen = findViewById(R.id.generation);

                    CheckBox checkFid = findViewById(R.id.fidele);

                    TextView tvPrix = findViewById(R.id.prix);

                    int generation = Integer.parseInt(editGen.getText().toString());

                    Double prixTotal = 0.0;

                    if(generation < 6) {

                            prixTotal = 2600.0;
                    }

                    else {
                        prixTotal = 3200.0;

                    }

                    if(checkFid.isChecked()) {

                        prixTotal = prixTotal*0.95;
                    }

                    tvPrix.setText(prixTotal.toString());




            }
        });

    }
}