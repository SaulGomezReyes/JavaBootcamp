/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudpeliculas;

import java.util.Scanner;

/**
 *
 * @author SaulGomez
 */
public class CrudPeliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        double duracion;
        String director;
        int año;
        String genero;

        Pelicula peli = null;
        Scanner lectura = null;
        int menu;
        do {

            System.out.println("Menu de Peliculas");
            System.out.println("1 ---> Alta");
            System.out.println("2 ---> Editar");
            System.out.println("3 ---> Mostrar");
            System.out.println("4 ---> Salir");
            lectura = new Scanner(System.in);
            menu = lectura.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Opción Alta de peliculas");

                    System.out.println("Escribe el nombre de la pelicula");
                    lectura = new Scanner(System.in);
                    nombre = lectura.nextLine();

                    System.out.println("Escribe la duracion de la pelicula");
                    lectura = new Scanner(System.in);
                    duracion = lectura.nextDouble();

                    System.out.println("Escribe el director de la pelicula");
                    lectura = new Scanner(System.in);
                    director = lectura.nextLine();

                    System.out.println("Escribe el año de la pelicula");
                    lectura = new Scanner(System.in);
                    año = lectura.nextInt();

                    System.out.println("Escribe el genero de la pelicula");
                    lectura = new Scanner(System.in);
                    genero = lectura.nextLine();

                    peli = new Pelicula(nombre, duracion, director, año, genero);
                    System.out.println("Se dio de alta la siguiente pelicula  --> " + peli.getNombre());

                    break;

                case 2:

                    System.out.println("Actualizar el nombre de pelicula");
                    lectura = new Scanner(System.in);
                    nombre = lectura.nextLine();
                    peli.setNombre(nombre);

                    System.out.println("Actualizar el año de la pelicula");
                    lectura = new Scanner(System.in);
                    año = lectura.nextInt();
                    peli.setAño(año);

                    System.out.println("Se edito la siguiente pelicula " + peli.getNombre() + " correctamente.");
                    break;

                case 3:

                    System.out.println(peli);
                    break;

            }
        } while (menu < 4);
        System.out.println("Fin");
    }

}
