/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptop;

/**
 *
 * @author SaulGomez
 */
public class Laptop {

    private String modelo;
    private String marca;
    private double precio;
    private int memoriaRam;
    private String grafica;

    public Laptop(String modelo, String marca, double precio, int memoriaRam, String grafica) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.memoriaRam = memoriaRam;
        this.grafica = grafica;
    }

    public Laptop() {
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

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    @Override
    public String toString() {
        return "Laptop{" + "modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", memoriaRam=" + memoriaRam + ", grafica=" + grafica + '}';
    }

}
