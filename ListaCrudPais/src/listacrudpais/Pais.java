/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacrudpais;

/**
 *
 * @author SaulGomez
 */
public class Pais {

    private String nombre;
    private String capital;
    private int habitantes;

    public Pais() {
    }

    public Pais(String nombre, String capital, int habitantes) {
        this.nombre = nombre;
        this.capital = capital;
        this.habitantes = habitantes;
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

    @Override
    public String toString() {
        return "Pais: " + "\n nombre= " + nombre + "\n capital= " + capital + "\n habitantes= " + habitantes;
    }

}
