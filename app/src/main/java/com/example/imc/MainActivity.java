package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.ContextMenu;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button inst_btn_calcular, inst_btn_limpar;
    EditText inst_edt_peso, inst_edt_altura, inst_edt_total_imc, inst_edt_descricao;
    EditText inst_edt_nome;
    Vibrator vibrator;


    //É o public static void main (Classe Principal)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inst_btn_calcular = findViewById(R.id.btnCalcular);
        inst_btn_limpar = findViewById(R.id.btnLimpar);
        inst_edt_peso = findViewById(R.id.txt_peso);
        inst_edt_altura = findViewById(R.id.txt_altura);
        inst_edt_total_imc = findViewById(R.id.totalimc);
        inst_edt_descricao = findViewById(R.id.txtdescricao);
        inst_edt_nome = findViewById(R.id.txt_nome);
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        inst_btn_calcular.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String nome = inst_edt_nome.getText().toString();
                float peso = Float.parseFloat(inst_edt_peso.getText().toString());
                float altura = Float.parseFloat(inst_edt_altura.getText().toString());

                float respIMC = peso / (altura * altura);

                if(respIMC > 18.4){
                    inst_edt_total_imc.setText(nome +" seu imc é: " + respIMC);
                    if(respIMC < 18.5){
                        inst_edt_descricao.setText("Baixo peso");
                    }else if(respIMC < 25){
                        inst_edt_descricao.setText("Peso adequado.");
                    }else if(respIMC < 30){
                        inst_edt_descricao.setText("Sobrepeso");
                    }else if(respIMC < 35){
                        inst_edt_descricao.setText("Obesidade Grau I.");
                        vibrator.vibrate(1000);
                    }else if(respIMC < 40){
                        inst_edt_descricao.setText("Obesidade Grau II.");
                        vibrator.vibrate(2000);
                    }else{
                        inst_edt_descricao.setText("Obesidade Grau III ou Mórbida.");
                        vibrator.vibrate(5000);
                    }

                }
            }
        });

        inst_btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inst_edt_nome.setText("");
                inst_edt_peso.setText("");
                inst_edt_altura.setText("");
                inst_edt_total_imc.setText("");
                inst_edt_descricao.setText("");
            }
        });

    }

    private void alert(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

}