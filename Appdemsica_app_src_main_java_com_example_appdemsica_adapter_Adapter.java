package com.example.appdemsica.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdemsica.R;
import com.example.appdemsica.model.Musicas;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Musicas> listaMusicas;

    public Adapter(List<Musicas> lista){
        this.listaMusicas = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Método para criar a visualização dos itens da lista
        View itemLista = LayoutInflater.from( parent.getContext()).inflate( R.layout.adapter_lista, parent,false);

        return new MyViewHolder( itemLista );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Método para exibir os itens da lista
        Musicas m = listaMusicas.get( position );
        holder.tvnomeMusica.setText( m.getNomeMusica());
        holder.tvcantor.setText( m.getCantor());


    }

    @Override
    public int getItemCount() {
        //Quantidade de itens que será exibida

        return listaMusicas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvnomeMusica;
        TextView tvcantor;

        public MyViewHolder(@NonNull View itemView) {
            super( itemView );

            tvnomeMusica = itemView.findViewById( R.id.tvMusica);
            tvcantor = itemView.findViewById( R.id.tvCantor );



        }
    }

}
