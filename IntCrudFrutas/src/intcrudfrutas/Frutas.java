/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intcrudfrutas;

/**
 *
 * @author SaulGomez
 */
public class Frutas {

    private String nombre;
    private String color;
    private double precio;

    public Frutas() {
    }

    public Frutas(String nombre, String color, double precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Frutas{" + "nombre=" + nombre + ", color=" + color + ", precio=" + precio + '}';
    }

}
