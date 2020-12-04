package com.example.contactp3.list;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.contactp3.R;

import java.util.List;


public class ContatoAdapter extends BaseAdapter{

    private List<ContatoModel> listaContato;
    private Activity activity;

    public ContatoAdapter (final Activity activity, final List<ContatoModel> listaContato){
        this.activity = activity;
        this.listaContato = listaContato;
    }

    @Override
    public int getCount() {
        return listaContato.size();
    }

    @Override
    public Object getItem(int position) {
        return listaContato.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = activity.getLayoutInflater().inflate(R.layout.item_lista_contato, parent, false);
        }

        TextView idContato = convertView.findViewById(R.id.idContato);
        idContato.setText(listaContato.get(position).getIdContato());

        TextView nomeContato = convertView.findViewById(R.id.nomeContato);
        nomeContato.setText("Nome: "+listaContato.get(position).getNomeContato());

        TextView telefoneContato = convertView.findViewById(R.id.telefoneContato);
        telefoneContato.setText("Telefone: "+listaContato.get(position).getTelefoneContato());

        return convertView;
    }
}

