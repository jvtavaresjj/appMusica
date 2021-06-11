package com.example.appdemsica.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.appdemsica.R;
import com.example.appdemsica.adapter.Adapter;
import com.example.appdemsica.model.Musicas;
import com.example.recyclerview.util.RecyclerItemClickListener;
//import com.example.appdemsica.util.*;

import java.util.ArrayList;
import java.util.List;

import static com.example.appdemsica.R.drawable.corteamericano;
import static com.example.appdemsica.R.drawable.rodeo;

public class  MainActivity extends AppCompatActivity {

    private RecyclerView rvRecyclerView;
    private List<Musicas> musicas = new ArrayList<>();






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main);

        rvRecyclerView = findViewById( R.id.rvRecycleView );








        //Listagem de Músicas
        this.criarMusicas();

        //Configurar o Adapter
        Adapter adapter = new Adapter(musicas);

        //Configurar o RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext() );
        rvRecyclerView.setLayoutManager( layoutManager );
        rvRecyclerView.setHasFixedSize( true );
        //inserindo uma linha entre cada item
        rvRecyclerView.addItemDecoration( new DividerItemDecoration( this, LinearLayout.VERTICAL ) );

        rvRecyclerView.setAdapter( adapter );

        //evento de clique
       rvRecyclerView.addOnItemTouchListener(
               new RecyclerItemClickListener(
                       getApplicationContext(),
                       rvRecyclerView,
                       new RecyclerItemClickListener.OnItemClickListener() {
                           @Override
                           public void onItemClick(View view, int position) {






                               Musicas m = musicas.get( position );


                               Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
                               intent.putExtra( "musica", m.getNomeMusica() );
                               intent.putExtra( "cantor", m.getCantor() );
                               intent.putExtra( "duracao", m.getDuracao() );
                               intent.putExtra( "genero", m.getGenero() );


                               startActivity( intent );



                           }

                           @Override
                           public void onLongItemClick(View view, int position) {

                           }

                           @Override
                           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                           }
                       }
               )
       );

       ;
    }

    public  void criarMusicas(){
        Musicas m = new Musicas("Rodeo", "Lil Nas X", "Rap", "02:53" );
        musicas.add( m );
        m = new Musicas("Ilusão", "MC Hariel", "Funk", "05:23");
        m = new Musicas("Versace", "Orochi", "Rap", "03:27");
       musicas.add( m );
        m = new Musicas("Corte Americano", "Felipe Ret", "Rap", "02:19");
        musicas.add( m );
        m = new Musicas("Volta Bebê, Volta Neném", "DJ Guuga", "Funk", "02:52" );
        musicas.add( m );
        m = new Musicas("Só Não Divulga", "Fernando & Sorocaba", "Sertanejo", "02:40");
        musicas.add( m );
        m = new Musicas("Deixa de Onda", "DENNIS", "Funk", "03:04");
        musicas.add( m );
        m = new Musicas("Cadê o Amor", "Zé Vaqueiro", "Sertanejo", "03:17");
        musicas.add( m );
        m = new Musicas("Assault (Angra)", "Borges", "Trap", "04:29");
        musicas.add( m );
        m = new Musicas("Butter", "BTS", "K-Pop", "02:44");
        musicas.add( m );
        m = new Musicas("Troca", "Jorge e Matheus", "Sertanejo", "02:27");
        musicas.add( m );
        m = new Musicas("Gorilla Roxo", "Matuê", "Trap", "02:45");
        musicas.add( m );
        m = new Musicas("RAPSTAR", "Polo G", "Rap", "02:46");
        musicas.add( m );
        m = new Musicas("Dynamite", "BTS", "K-pop", "03:19");
        musicas.add( m );
        m = new Musicas("Bipolar", "Mc Davi", "Funk", "04:36");
        musicas.add( m );
        m = new Musicas("Batom de Cereja", "Israel & Rodolffo", "Sertanejo", "2:20");
        musicas.add( m );
        m = new Musicas("Tipo Gin", "MC Kevin o Chris", "Funk", "2:39");
        musicas.add( m );
        m = new Musicas("Vida Louca", "MC Poze do Rodo", "Funk", "2:35");
        musicas.add( m );
        m = new Musicas("Lost Cause", "Billie Eilish", "Pop", "03:48");
        musicas.add( m );





    }






}