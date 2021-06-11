package com.example.maestro_pokemon.Entity;

public class Pokemon {
    public String Nombre;
    public String Tipo;
    public String Imagen;
    public String Latitude;
    public String Longitude;

    public Pokemon(String nombre, String tipo, String imagen, String latitude, String longitude) {
        this.Nombre = nombre;
        this.Tipo = tipo;
        this.Imagen = imagen;
        this.Latitude = latitude;
        this.Longitude = longitude;
    }
}
