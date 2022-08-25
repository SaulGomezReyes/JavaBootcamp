/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curdcereal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SaulGomez
 */
public class NewClass implements Intc{

    List<Cereal> lista= new ArrayList<Cereal>();
    
    @Override
    public void guardar(Cereal cereal) {
        lista.add(cereal);
    }

    @Override
    public void editar(Cereal cereal, int indice) {
     lista.set(indice, cereal);
    }

    @Override
    public void eliminar(int indice) {
        lista.remove(indice);
    }

    @Override
    public Cereal buscar(int ind) {
        Cereal cereal = lista.get(ind);
        return cereal;
    }

    @Override
    public void mostrar() {
        System.out.println(lista);
    }
    
    
}
