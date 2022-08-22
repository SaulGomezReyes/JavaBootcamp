/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crudconstructor;

/**
 *
 * @author SaulGomez
 */
public class Auto {

    private String modelo;
    private String marca;
    private double precio;
    private int puertas;

    public Auto(String modelo, String marca, double precio, int puertas) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.puertas = puertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Auto{" + "modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", puertas=" + puertas + '}';
    }
    
    

}
