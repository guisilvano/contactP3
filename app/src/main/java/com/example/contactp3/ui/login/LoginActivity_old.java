package com.example.contactp3.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.contactp3.MainActivity;
import com.example.contactp3.R;
import com.example.contactp3.api.Api;
import com.example.contactp3.api.models.RespostaUnesc;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity_old extends AppCompatActivity {

    private LoginViewModel loginViewModel;

    private Button btnLogar;
    private EditText edtUsuario, edtSenha;

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_login);

        edtUsuario = findViewById(R.id.username);
        edtSenha = findViewById(R.id.password);

        btnLogar = findViewById(R.id.login);
        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = edtUsuario.getText().toString();
                String senha = edtSenha.getText().toString();

                if (usuario.trim().isEmpty() || senha.trim().isEmpty()) {
                    Log.d("mastersys", "usuario ou senha estão vazios!");
                    return;
                }

                Api.getUsuario(usuario, senha, new Callback<RespostaUnesc>() {
                    @Override
                    public void onResponse(Call<RespostaUnesc> call, Response<RespostaUnesc> response) {

                        if (response.body() == null) {
                            Log.d("mastersys", "dados inválidos");
                        } else if (response.body().getSucesso()) {
                            Log.d("mastersys", "falha na autenticação");
                        } else {
                            //proxima tela
                            Log.d ("mastersys", "login realizado");


                        }

                    }

                    @Override
                    public void onFailure(Call<RespostaUnesc> call, Throwable t) {

                    }
                });
            }
        });

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}