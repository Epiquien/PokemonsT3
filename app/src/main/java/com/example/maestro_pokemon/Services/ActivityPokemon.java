package com.example.maestro_pokemon.Services;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.maestro_pokemon.ActivityLista;
import com.example.maestro_pokemon.Adapters.PokemonAdapter;
import com.example.maestro_pokemon.Entity.Pokemon;
import com.example.maestro_pokemon.MainActivity;
import com.example.maestro_pokemon.R;

import java.util.ArrayList;
import java.util.List;

public class ActivityPokemon extends AppCompatActivity {

    Button siguiente;
    Button siguienteRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_pokemon);




        siguiente = (Button)findViewById(R.id.btnMisPokemons);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(ActivityPokemon.this, ActivityLista.class);
                startActivity(siguiente);
            }
        });

        siguienteRegistro = (Button)findViewById(R.id.btnRegistrar);
        siguienteRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguienteregistro = new Intent(ActivityPokemon.this, ActivityRegistro.class);
                startActivity(siguienteregistro);
            }
        });

    }


}