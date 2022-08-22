/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudpeliculas;

/**
 *
 * @author SaulGomez
 */
public class Pelicula {
    private String nombre;
    private double duración; 
    private String director;
    private int año;
    private String genero;

    public Pelicula(String nombre, double duración, String director, int año, String genero) {
        this.nombre = nombre;
        this.duración = duración;
        this.director = director;
        this.año = año;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuración() {
        return duración;
    }

    public void setDuración(double duración) {
        this.duración = duración;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", duraci\u00f3n=" + duración + ", director=" + director + ", a\u00f1o=" + año + ", genero=" + genero + '}';
    }

    
}
