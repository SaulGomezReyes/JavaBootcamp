/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudconsolas;

/**
 *
 * @author SaulGomez
 */
public interface InterConsola {
    
    public void guardar(Consola consola);

    public void editar(int indice, Consola consola);

    public void eliminar(int indice);

    public Consola buscar(int indice);

    public void mostrar();

    public void eliminarTodo();
    
    public void buscarNombre(String nombre);
    
    public void vacio();
    
    public void contar();

}
