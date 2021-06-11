package com.example.appdemsica.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appdemsica.R;
import com.example.appdemsica.model.Musicas;


public class SegundaActivity extends AppCompatActivity {

    private ImageView imgMusica;
    private TextView tvMusica2;
    private TextView tvGenero2;
    private TextView tvcantor2;
    private TextView tvDuracao2;
    private ImageView btAvancar;
    private ImageView btRetroceder;
    private ImageView btPlay;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_segunda );
        tvGenero2 = findViewById( R.id.tvGenero2 );
        tvMusica2 = findViewById( R.id.tvMusica2 );
        tvcantor2 = findViewById( R.id.tvCantor2 );
        tvDuracao2 = findViewById( R.id.tvDuracao2 );
        imgMusica = findViewById( R.id.imgMusica );
        btAvancar = findViewById( R.id.btAvancar );
        btPlay = findViewById( R.id.btPlay );
        btRetroceder = findViewById( R.id.btRetroceder );


        Bundle dados = getIntent().getExtras();
        String musica = dados.getString("musica");
        String duracao = dados.getString("duracao");
        String cantor = dados.getString("cantor");
        String genero = dados.getString( "genero" );




        tvMusica2.setText( musica );
        tvDuracao2.setText( duracao );
        tvcantor2.setText( cantor );
        tvGenero2.setText( genero );

        switch (musica){
            case "Rodeo":
                imgMusica.setImageResource( R.drawable.rodeo );
                break;
            case "Ilusão":
                imgMusica.setImageResource( R.drawable.ilusao);
                break;
            case "Versace":
                imgMusica.setImageResource( R.drawable.versace);
                break;
            case "Corte Americano":
                imgMusica.setImageResource( R.drawable.corteamericano);
                break;
            case "Volta Bebê, Volta Neném":
                imgMusica.setImageResource( R.drawable.volta_bebe);
                break;
            case "Só Não Divulga":
                imgMusica.setImageResource( R.drawable.sonaodivulga);
                break;
            case "Deixa de Onda":
                imgMusica.setImageResource( R.drawable.deixadeonda);
                break;
            case "Cadê o Amor":
                imgMusica.setImageResource( R.drawable.cadeoamor);
                break;
            case "Assault (Angra)":
                imgMusica.setImageResource( R.drawable.assault);
                break;
            case "Butter":
                imgMusica.setImageResource( R.drawable.butter);
                break;
            case "Troca":
                imgMusica.setImageResource( R.drawable.troca);
                break;
            case "Gorilla Roxo":
                imgMusica.setImageResource( R.drawable.gorilaroxo);
                break;
            case "RAPSTAR":
                imgMusica.setImageResource( R.drawable.rapstar);
                break;
            case "Dynamite":
                imgMusica.setImageResource( R.drawable.dynamite);
                break;
            case "Bipolar":
                imgMusica.setImageResource( R.drawable.bipolar);
                break;
            case "Batom de Cereja":
                imgMusica.setImageResource( R.drawable.batomdecereja);
                break;
            case "Tipo Gin":
                imgMusica.setImageResource( R.drawable.tipogin);
                break;
            case "Vida Louca":
                imgMusica.setImageResource( R.drawable.vidalouca);
                break;
            case "Lost Cause":
                imgMusica.setImageResource( R.drawable.lostcause);
                break;
            default:
                imgMusica.setImageResource( R.drawable.nota );


        }

        btAvancar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText( SegundaActivity.this, "Próxima Música", Toast.LENGTH_LONG ).show();
            }
        } );

        btPlay.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText( SegundaActivity.this, "Play/Pause", Toast.LENGTH_LONG ).show();
            }
        } );

        btRetroceder.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText( SegundaActivity.this, "Retroceder Música", Toast.LENGTH_LONG ).show();
            }
        } );




        }




    }
