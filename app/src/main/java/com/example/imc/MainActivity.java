package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button inst_btn_calcular, inst_btn_limpar;
    EditText inst_edt_peso, inst_edt_altura;


    //É o public static void main (Classe Principal)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inst_btn_calcular = findViewById(R.id.btnCalcular);
        inst_btn_limpar = findViewById(R.id.btnLimpar);
        inst_edt_peso = findViewById(R.id.txt_peso);
        inst_edt_altura = findViewById(R.id.txt_altura);


        inst_btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float peso = Float.parseFloat(inst_edt_peso.getText().toString());
                float altura = Float.parseFloat(inst_edt_altura.getText().toString());

                float respIMC = peso / (altura * altura);

                Toast.makeText(getApplicationContext(), "Seu IMC é: " + respIMC,
                        Toast.LENGTH_LONG).show();
            }
        });

        inst_btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inst_edt_peso.setText("");
                inst_edt_altura.setText("");
            }
        });
        {

        }


    }
}