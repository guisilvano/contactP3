package com.example.contactp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.contactp3.list.ContatoAdapter;
import com.example.contactp3.list.ContatoModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listaContatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaContatos = findViewById(R.id.listaContatos);

        ArrayList<ContatoModel> contatos = new ArrayList<ContatoModel>();
        contatos.add(new ContatoModel("1", "Clébinho", "84074070"));
        contatos.add(new ContatoModel("2", "Gladson", "08006444001"));

        ContatoAdapter adapter = new ContatoAdapter(this, contatos);
        listaContatos.setAdapter(adapter);
    }
}