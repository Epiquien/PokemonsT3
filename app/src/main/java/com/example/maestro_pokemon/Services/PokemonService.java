package com.example.maestro_pokemon.Services;

import com.example.maestro_pokemon.Entity.Pokemon;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PokemonService {

        @POST("pokemons/22599")
    Call<Void> CreatePokemon(@Body Pokemon pokemon);


}
