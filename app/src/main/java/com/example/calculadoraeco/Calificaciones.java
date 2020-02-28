package com.example.calculadoraeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Calificaciones extends AppCompatActivity {

    private Button buttonCalcu;
    private EditText textT1;
    private EditText textT2;
    private EditText textQT;
    private EditText textQP;
    private EditText textP1;
    private EditText textP2;
    private EditText textE;
    private EditText textPF;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificaciones);

        buttonCalcu = findViewById(R.id.buttonCalcu);
        textT1 = findViewById(R.id.textT1);
        textT2 = findViewById(R.id.textT2);
        textQT = findViewById(R.id.textQT);
        textQP = findViewById(R.id.textQP);
        textE = findViewById(R.id.textE);
        textPF = findViewById(R.id.textPF);
        textP1 = findViewById(R.id.textP1);
        textP2 = findViewById(R.id.textP2);



        String nombre = getIntent().getExtras().getString("n");

        buttonCalcu.setOnClickListener(


                (v) -> {

                    if (textT1.getText().toString().equals("") || textT2.getText().toString().equals("") ||
                            textQT.getText().toString().equals("") || textQP.getText().toString().equals("") ||
                            textE.getText().toString().equals("") || textP1.getText().toString().equals("") ||
                            textP2.getText().toString().equals("") || textPF.getText().toString().equals("")) {


                    } else {


                        double notaT1 = Double.parseDouble(textT1.getText().toString()) * 0.15;
                        double notaT2 = Double.parseDouble(textT2.getText().toString()) * 0.15;
                        double notaQT = Double.parseDouble(textQT.getText().toString()) * 0.15;
                        double notaQP = Double.parseDouble(textQP.getText().toString()) * 0.15;
                        double notaE = Double.parseDouble(textE.getText().toString()) * 0.10;
                        double notaP1 = Double.parseDouble(textP1.getText().toString()) * 0.05;
                        double notaP2 = Double.parseDouble(textP2.getText().toString()) * 0.05;
                        double notaPF = Double.parseDouble(textPF.getText().toString()) * 0.20;

                        double promedio = notaT1 + notaT2 + notaQT + notaQP + notaE + notaP1 + notaP2 + notaPF;

                        String notaF = String.valueOf(promedio);


                        Intent result = new Intent(Calificaciones.this, Resultados.class);
                        result.putExtra("n", nombre);
                        result.putExtra("note", notaF);
                        startActivity(result);


                    }
                }

        );


    }
}
