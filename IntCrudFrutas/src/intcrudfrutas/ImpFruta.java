/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intcrudfrutas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SaulGomez
 */
public class ImpFruta implements IntFrutasCtrl {

    List<Frutas> lista = new ArrayList<Frutas>();

    @Override
    public void guardar(Frutas fruta) {
        lista.add(fruta);
    }

    @Override
    public void editar(int indice, Frutas fruta) {
        lista.set(indice, fruta);
    }

    @Override
    public void eliminar(int indice) {
        lista.remove(indice);
    }

    @Override
    public Frutas buscar(int indice) {
        Frutas fruta = lista.get(indice);
        return fruta;
    }

    @Override
    public void mostrar() {
        for (Frutas frut : lista) {
            System.out.println(lista.indexOf(frut) + " " + frut);

        }
    }

    public void contar() {
        System.out.println("La lista tiene " + lista.size());
    }

    @Override
    public void eliminarTodo() {
        lista.clear();
    }

    @Override
    public void buscarNombre(String nombre) {

        for (Frutas frutas : lista) {

            if (frutas.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("La fruta es " + frutas);
                break;
            } 

        }

    }

    @Override
    public boolean vacio() {
        if (lista.isEmpty() == true) {
            return true;
        } else {
            return false;
        }
    }

}
