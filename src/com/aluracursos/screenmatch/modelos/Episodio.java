package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalVizualizaciones;

    public int getTotalVizualizaciones() {
        return totalVizualizaciones;
    }

    public void setTotalVizualizaciones(int totalVizualizaciones) {
        this.totalVizualizaciones = totalVizualizaciones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if (totalVizualizaciones>100) {
            return 4;
        }else{
                return 2;
            }
    }
}
