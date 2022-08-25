/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curdcereal;

/**
 *
 * @author SaulGomez
 */
public class Cereal {

    private String nombre;
    private String marca;
    private double precio;
    private int contenido;
    private String sabor;

    public Cereal() {
    }

    public Cereal(String nombre, String marca, double precio, int contenido, String sabor) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.contenido = contenido;
        this.sabor = sabor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Cereal -->" + "nombre: " + nombre + ", marca: " + marca + ", precio: " + precio + ", contenido: " + contenido + ", sabor: " + sabor + '.';
    }

}
