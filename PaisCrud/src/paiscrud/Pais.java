/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paiscrud;

/**
 *
 * @author SaulGomez
 */
public class Pais {

    private String nombre;
    private String capital;
    private int habitantes;
    private double extencion;

    public Pais() {
    }

    public Pais(String nombre, String capital, int habitantes, double extencion) {
        this.nombre = nombre;
        this.capital = capital;
        this.habitantes = habitantes;
        this.extencion = extencion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public double getExtencion() {
        return extencion;
    }

    public void setExtencion(double extencion) {
        this.extencion = extencion;
    }

    @Override
    public String toString() {
        return "Pais: " + "nombre= " + nombre + ", capital= " + capital + ", habitantes= " + habitantes + ", extencion= " + extencion + '.';
    }

}
