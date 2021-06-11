package com.example.maestro_pokemon.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.maestro_pokemon.Entity.Pokemon;
import com.example.maestro_pokemon.R;

import java.util.List;

public class PokemonAdapter extends  RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>
{
    List<Pokemon>pokemons;

    public PokemonAdapter(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }


    @Override
    public PokemonViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
        .inflate(R.layout.item_listapokemon, parent, false);

        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder( PokemonAdapter.PokemonViewHolder holder, int position) {
        View view= holder.itemView;
        Pokemon pokemon= pokemons.get(position);

        TextView idNombre =view.findViewById(R.id.IdNombre);
        TextView idTipo = view.findViewById(R.id.IdTipo);
        Button btnVerDetalle = view.findViewById(R.id.BtnVerDetalle);

        idNombre.setText(pokemon.Nombre);
        idTipo.setText(pokemon.Tipo);


        btnVerDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }

    public class PokemonViewHolder extends RecyclerView.ViewHolder {

        public PokemonViewHolder(View itemView) {
            super(itemView);
        }
    }
}
