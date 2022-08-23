/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listejemplo;

/**
 *
 * @author SaulGomez
 */
public class Pantalla {
    private String marca;
    private String tecnologia;
    private int tamaño;
    private int precio;

    public Pantalla(String marca, String tecnologia, int tamaño, int precio) {
        this.marca = marca;
        this.tecnologia = tecnologia;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public Pantalla() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pantalla: " + "\n marca=" + marca + "\n tecnologia=" + tecnologia + "\n tama\u00f1o=" + tamaño + "\n precio=" + precio + ' ';
    }
    
    
}
