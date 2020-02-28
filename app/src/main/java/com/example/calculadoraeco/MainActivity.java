package com.example.calculadoraeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button registerButton;
    private EditText nameText;

   // private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerButton = findViewById(R.id.registerButton);
        nameText = findViewById(R.id.nameText);
        //checkBox = findViewById(R.id.checkBox);

        registerButton.setOnClickListener(
                (v) -> {

                    String name = nameText.getText().toString();
                    Intent c = new Intent(MainActivity.this, Calificaciones.class);
                    c.putExtra("n", name );
                    startActivity(c);


                }



        );

    }
}
