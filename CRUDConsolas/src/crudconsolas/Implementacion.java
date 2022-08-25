/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudconsolas;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author SaulGomez
 */
public class Implementacion implements InterConsola{
     List<Consola> lista = new ArrayList<Consola>();
     
    @Override
    public void guardar(Consola consola) {
        lista.add(consola);
    }

    @Override
    public void editar(int indice, Consola consola) {
        lista.set(indice, consola);
    }

    @Override
    public void eliminar(int indice) {
        lista.remove(indice);
        System.err.println("Consola eliminada");
    }

    @Override
    public Consola buscar(int indice) {
        Consola consola = lista.get(indice);
        return consola;
    }

    @Override
    public void mostrar() {
        for (Consola consol  : lista) {
            System.out.println(lista.indexOf(consol) + " " + consol);

        }
    }

    @Override
    public void eliminarTodo() {
        lista.clear();
    }

    @Override
    public void buscarNombre(String nombre) {
        for (Consola consl : lista) {

            if (consl.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("La consola es " + consl);
                break;
            } 

        }
    }

    @Override
    public void vacio() {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia");
            
        }else{
            System.out.println("La lista tiene datos");
        }
        
    }

    @Override
    public void contar() {
        System.out.println("El numero de elementos son: " + lista.size());
    }
    
}
