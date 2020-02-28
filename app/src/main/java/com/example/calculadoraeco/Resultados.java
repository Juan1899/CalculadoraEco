package com.example.calculadoraeco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    private TextView nombreNota;
    private TextView notaTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        nombreNota = findViewById(R.id.nombreNota);
        notaTotal = findViewById(R.id.notaTotal);


        String nombre = getIntent().getExtras().getString("n");
        String notaFinal = getIntent().getExtras().getString("note");

        nombreNota.setText("Resultados para " + nombre);
        notaTotal.setText("Total: " + notaFinal);
        
    }
}
