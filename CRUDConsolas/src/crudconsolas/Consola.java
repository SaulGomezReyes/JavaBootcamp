/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudconsolas;

/**
 *
 * @author SaulGomez
 */
public class Consola {
    
    private String nombre;
    private String marcar;
    private double precio;

    public Consola() {
    }

    public Consola(String nombre, String marcar, double precio) {
        this.nombre = nombre;
        this.marcar = marcar;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarcar() {
        return marcar;
    }

    public void setMarcar(String marcar) {
        this.marcar = marcar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Consola{" + "nombre=" + nombre + ", marcar=" + marcar + ", precio=" + precio + '}';
    }

    
}
