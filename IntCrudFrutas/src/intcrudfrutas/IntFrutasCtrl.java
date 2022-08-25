/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intcrudfrutas;

/**
 *
 * @author SaulGomez
 */
public interface IntFrutasCtrl {

    public void guardar(Frutas fruta);

    public void editar(int indice, Frutas fruta);

    public void eliminar(int indice);

    public Frutas buscar(int indice);

    public void mostrar();

    public void eliminarTodo();
    
    public void buscarNombre(String nombre);
    
    public boolean vacio();

}
