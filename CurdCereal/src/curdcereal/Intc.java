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
public interface Intc {
    public void guardar(Cereal cereal);
    public void editar(Cereal cereal, int indice);
    public void eliminar(int indice);
    public Cereal buscar(int cereal);
    public void mostrar();
    
    
    
}
