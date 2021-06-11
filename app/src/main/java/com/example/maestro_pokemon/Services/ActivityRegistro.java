package com.example.maestro_pokemon.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.maestro_pokemon.Entity.Pokemon;
import com.example.maestro_pokemon.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ActivityRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button btnSubmit = findViewById(R.id.btnRegistrarPokemon);
        EditText edtNombre = findViewById(R.id.nombreID);
        EditText edtTipo = findViewById(R.id.tipoID);
        EditText edtUrl = findViewById(R.id.urlID);
        EditText edtLatitud = findViewById(R.id.latitudID);
        EditText edtLongitud = findViewById(R.id.longitudID);



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://upn.lumenes.tk/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PokemonService service = retrofit.create(PokemonService.class);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = edtNombre.getText().toString();
                String tipo = edtTipo.getText().toString();
                String url = edtUrl.getText().toString();
                String latitud = edtLatitud.getText().toString();
                String longitud = edtLongitud.getText().toString();
                Pokemon pokemon = new Pokemon(nombre,tipo,url,latitud,longitud);
                Call<Void> pokemonsCall = service.CreatePokemon(pokemon);

                pokemonsCall.enqueue(new Callback<Void>() {

                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {

                    }
                });
            }
        });
    }
}