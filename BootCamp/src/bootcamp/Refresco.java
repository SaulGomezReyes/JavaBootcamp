/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp;

/**
 *
 * @author SaulGomez
 */
public class Refresco {

    String nombre;
    double precio;
    String marca;
    int contenido;

    public Refresco(String nombre, double precio, String marca, int contenido) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.contenido = contenido;
    }

    public Refresco() {
    }

    public Refresco(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Refresco: \n" + "nombre=" + nombre + ",\n precio=" + precio + ",\n marca=" + marca + ",\n contenido=" + contenido + '.';
    }

}
