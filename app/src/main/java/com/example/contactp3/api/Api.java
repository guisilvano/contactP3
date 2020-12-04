package com.example.contactp3.api;

import com.example.contactp3.api.models.RespostaUnesc;
import com.example.contactp3.api.models.UsuarioModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

        public static final String BASE_URL = "http://api.bateuweb.com.br";

        private static Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        public static void getUsuario (final String nome, final String senha, Callback<RespostaUnesc> callback) {

                UsuarioEndpoit endpoit = retrofit.create(UsuarioEndpoit.class);
                Call<RespostaUnesc> call = endpoit.getUsuario(nome, senha);
                call.enqueue(callback);
        }

        public static void postUsuario (final UsuarioModel usuario, Callback<UsuarioModel> callback) {

                UsuarioEndpoit endpoit = retrofit.create(UsuarioEndpoit.class);
                Call<UsuarioModel> call = endpoit.postUsuario(usuario);
                call.enqueue(callback);
        }
}
