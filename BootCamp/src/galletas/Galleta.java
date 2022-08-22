/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galletas;

/**
 *
 * @author SaulGomez
 */
public class Galleta {

    String marca;
    double precio;
    String sabor;
    int peso;

    public Galleta() {
    }

    public Galleta(String marca, double precio, String sabor, int peso) {
        this.marca = marca;
        this.precio = precio;
        this.sabor = sabor;
        this.peso = peso;
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

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Galleta: " + "\n marca= " + marca + ",\n precio= " + precio + ",\n sabor= " + sabor + ",\n peso= " + peso + '.';
    }

}
