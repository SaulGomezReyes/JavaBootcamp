/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudlibros;

/**
 *
 * @author SaulGomez
 */
public class Libro {

    private String nombre;
    private String autor;
    private String editorial;
    private int precio;
    private String publicacion;

    public Libro() {
    }

    public Libro(String nombre, String autor, String editorial, int precio, String publicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
        this.publicacion = publicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial + ", precio=" + precio + ", publicacion=" + publicacion + '}';
    }

}
