package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivitySenha extends AppCompatActivity {

    Button inst_btn_logar;
    Button inst_btn_cancelar;
    EditText inst_usuario;
    EditText inst_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_senha);

        inst_btn_logar = findViewById(R.id.btnlogar);
        inst_btn_cancelar = findViewById(R.id.btncancelar);
        inst_usuario = findViewById(R.id.acessoUser);
        inst_senha = findViewById(R.id.acessoSenha);

        inst_btn_logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(getApplicationContext(), MainActivity.class);

                //User & Senha do APP
                String login = inst_usuario.getText().toString();
                String senha = inst_senha.getText().toString();

                //Trocar de Tela
                if(login.equals("Rafael") & senha.equals("1234")) {
                    startActivity(intent);
                }else{
                    alert("Usuário ou Senha inválido.");
                }
            }
        });

        inst_btn_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });



    }

    private void alert(String s){
        Toast.makeText(this, s,
                Toast.LENGTH_LONG).show();
    }
}