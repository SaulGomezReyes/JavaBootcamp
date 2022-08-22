/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonball;

/**
 *
 * @author SaulGomez
 */
public class Personaje {
    private String nombre;
    private String raza;
    private int ki;
    private String universo;
    
    public Personaje(){
    }

    public Personaje(String nombre, String raza, int ki, String universo) {
        this.nombre = nombre;
        this.raza = raza;
        this.ki = ki;
        this.universo = universo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", raza=" + raza + ", ki=" + ki + ", universo=" + universo + '}';
    }
    
    
}
