package com.aluracursos.screenmatch.modelos;


import com.aluracursos.screenmatch.calculos.Clasificacion;

//extend nos deja coipiar todos los atributos de la clase referenciada.
public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    public String getDirector() {
        return director;
    }

    public Pelicula(String nombre, int fechaDeLanzamiento){
        super(nombre, fechaDeLanzamiento);
    }


    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int)calculaMedia() / 2;
    }
    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + "(" + this.getFechaDeLanzamiento() +")";
    }
}