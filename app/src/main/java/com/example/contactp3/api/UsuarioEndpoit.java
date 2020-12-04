package com.example.contactp3.api;



import com.example.contactp3.api.models.RespostaUnesc;
import com.example.contactp3.api.models.UsuarioModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UsuarioEndpoit {

    @GET("unesc/usuario/buscar")
    Call<RespostaUnesc> getUsuario (@Query("nome") final String nome, @Query("senha") final String senha);

    @GET("unesc/usuario/inserir")
    Call<UsuarioModel> postUsuario(@Body UsuarioModel usuario);
}
