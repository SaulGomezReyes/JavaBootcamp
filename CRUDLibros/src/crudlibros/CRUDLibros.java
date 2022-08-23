/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudlibros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SaulGomez
 */
public class CRUDLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String autor;
        String editorial;
        int precio;
        String publicacion;

        Libro libro = null;
        Scanner lectura = null;
        int menu;
        int index;

        List<Libro> lista = new ArrayList<Libro>();

        do {

            System.out.println("Bienvenido al registro de Libros \n Seleccione una opción:");
            System.out.println("1 ---> Alta");
            System.out.println("2 ---> Editar");
            System.out.println("3 ---> Eliminar");
            System.out.println("4 ---> Buscar");
            System.out.println("5 ---> Mostrar Todo");
            System.out.println("6 ---> Salir");
            lectura = new Scanner(System.in);
            menu = lectura.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Nuevo Libro");

                    System.out.println("Escribe el nombre del libro a registrar");
                    lectura = new Scanner(System.in);
                    nombre = lectura.nextLine();

                    System.out.println("Escribe el autor del libro");
                    lectura = new Scanner(System.in);
                    autor = lectura.nextLine();

                    System.out.println("Escribe la editorial del libro");
                    lectura = new Scanner(System.in);
                    editorial = lectura.nextLine();
                    
                    System.out.println("Escribe el costo del libro");
                    lectura = new Scanner(System.in);
                    precio = lectura.nextInt();
                    
                    System.out.println("Escribe el año de publicacion");
                    lectura = new Scanner(System.in);
                    publicacion = lectura.nextLine();

                    libro = new Libro(nombre, autor, editorial, precio, publicacion);
                    lista.add(libro);
                    System.out.println("Se dio de alta el siguiente libro  --> " + libro.getNombre());

                    break;

                case 2:

                    System.out.println("Escribe el indice del libro, para editar año de publicacion");
                    lectura = new Scanner(System.in);
                    index = lectura.nextInt();

                    libro = lista.get(index);

                    System.out.println("Escribe el nuevo año de publicacion");
                    lectura = new Scanner(System.in);
                    publicacion = lectura.nextLine();
                    libro.setPublicacion(publicacion);

                   
                    System.out.println("Se edito correctamente el siguiente libro " + libro.getNombre());
                    break;

                case 3:
                    System.out.println("Opción de Eliminar");
                    System.out.println("Escribe el indice del liobro a eliminar");
                    lectura = new Scanner(System.in);
                    index = lectura.nextInt();

                    lista.remove(index);

                    System.out.println("Pais eliminado Correctamente!!");

                    break;

                case 4:
                    System.out.println("Opción de Busqueda");
                    System.out.println("Escribe el indice del libro a buscar");
                    lectura = new Scanner(System.in);
                    index = lectura.nextInt();

                    libro = lista.get(index);

                    System.out.println("El libro encontrado es " + libro);
                    break;

                case 5:
                    for (Libro libro2 : lista) {
                        System.out.println(lista.indexOf(libro2) + " " + libro2);
                        
                    }
                    break;

            }
        } while (menu < 6);
        System.out.println("Fin");
    }

}
