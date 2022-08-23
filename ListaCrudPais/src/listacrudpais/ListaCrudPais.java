/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacrudpais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SaulGomez
 */
public class ListaCrudPais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre;
        String capital;
        int habitantes;

        Pais pais = null;
        Scanner lectura = null;
        int menu;
        int index;

        List<Pais> lista = new ArrayList<Pais>();

        do {

            System.out.println("Bienvenido al registro de Paises \n Seleccione una opción:");
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
                    System.out.println("Nuevo País");

                    System.out.println("Escribe el nombre del pais");
                    lectura = new Scanner(System.in);
                    nombre = lectura.nextLine();

                    System.out.println("Escribe la capital del pais");
                    lectura = new Scanner(System.in);
                    capital = lectura.nextLine();

                    System.out.println("Escribe el numero de habitantes del pais");
                    lectura = new Scanner(System.in);
                    habitantes = lectura.nextInt();

                    pais = new Pais(nombre, capital, habitantes);
                    lista.add(pais);
                    System.out.println("Se dio de alta el pais  --> " + pais.getNombre());

                    break;

                case 2:

                    System.out.println("Escribe el indice del pais a editar");
                    lectura = new Scanner(System.in);
                    index = lectura.nextInt();

                    pais = lista.get(index);

                    System.out.println("Escribe la nueva capital");
                    lectura = new Scanner(System.in);
                    capital = lectura.nextLine();
                    pais.setCapital(capital);

                    System.out.println("Escribe el nuevo numero de habitantes");
                    lectura = new Scanner(System.in);
                    habitantes = lectura.nextInt();
                    pais.setHabitantes(habitantes);

                    System.out.println("Se edito correctamente el pais " + pais.getNombre());
                    break;

                case 3:
                    System.out.println("Opción de Eliminar");
                    System.out.println("Escribe el indice del pais a eliminar");
                    lectura = new Scanner(System.in);
                    index = lectura.nextInt();

                    lista.remove(index);

                    System.out.println("Pais eliminado Correctamente!!");

                    break;

                case 4:
                    System.out.println("Opción de Busqueda");
                    System.out.println("Escribe el indice del pais a buscar");
                    lectura = new Scanner(System.in);
                    index = lectura.nextInt();

                    pais = lista.get(index);

                    System.out.println("El pais encontrado es " + pais);
                    break;

                case 5:
                    for (Pais pais2 : lista) {
                        System.out.println(lista.indexOf(pais2) + 1);
                        System.out.println(pais2);
                    }
                    break;

            }
        } while (menu < 6);
        System.out.println("Fin");
    }

}
