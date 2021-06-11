package com.example.maestro_pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.maestro_pokemon.Adapters.PokemonAdapter;
import com.example.maestro_pokemon.Entity.Pokemon;
import com.example.maestro_pokemon.Services.ActivityPokemon;
import com.example.maestro_pokemon.Services.PokemonService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        List<Pokemon> pokemons = GetPokemons();

       // Call<List<Pokemon>> contactsAll =service.CreatePokemon(pokemons);



        RecyclerView rv =findViewById(R.id.rvPalabrasPokemon);
        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        PokemonAdapter adapter =new PokemonAdapter(pokemons);
        rv.setAdapter(adapter);



    }

    private List<Pokemon> GetPokemons()
    {
        List<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new Pokemon("Pikachu","Electrico",null,null,null));

        return  pokemons;
    }

}