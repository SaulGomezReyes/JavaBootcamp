/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curdcereal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SaulGomez
 */
public class CurdCereal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String alpha = "";
        int cont=1;
        System.out.println("Objeto numero 1: una cadena vacia.");
        for(char current='a'; current <='z'; current++) {
                cont++;
                alpha += current;
                System.out.println("Objeto numero "+cont+" :"+alpha);
        }
        System.out.println("\nUn total de "+cont+" objetos creados!");

    NewClass imp = new NewClass();

        
        
        
        String nombre;
        String marca;
        double precio;
        int contenido;
        String sabor;

        Cereal cereal = null;
        Scanner lectura = null;
        int menu;
        int index;

        //buscar
        cereal = imp.buscar(1);
        
        //Editar 
        cereal = imp.buscar(1);
        cereal.setMarca("dsd");
        imp.editar(cereal, 1);
        
        //eliminar
        imp.eliminar(2);
        imp.mostrar();
        
        
        List<Cereal> lista = new ArrayList<Cereal>();

        do {

            System.out.println("Bienvenido al registro de Cereales \n Seleccione una opción:");
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
                    System.out.println("Registre nuevo cereal");

                    System.out.println("Ingrese el nombre del cereal");
                    lectura = new Scanner(System.in);
                    nombre = lectura.nextLine();

                    System.out.println("Ingrese la marca del cereal");
                    lectura = new Scanner(System.in);
                    marca = lectura.nextLine();

                    System.out.println("Ingrese el precio del cereal");
                    lectura = new Scanner(System.in);
                    precio = lectura.nextDouble();

                    System.out.println("Ingrese el contenido del cereal");
                    lectura = new Scanner(System.in);
                    contenido = lectura.nextInt();

                    System.out.println("Ingrese el sabor del cereal");
                    lectura = new Scanner(System.in);
                    sabor = lectura.nextLine();

                    cereal = new Cereal(nombre, marca, precio, contenido, sabor);
                    imp.guardar(cereal);
                    System.out.println("Se registró el nuevo cereal  --> " + cereal.getNombre());

                    break;

                case 2:

                    System.out.println("Escribe el indice del cereal para editar");
                    lectura = new Scanner(System.in);
                    index = lectura.nextInt();

                    cereal = lista.get(index);

                    System.out.println("Nuevo precio del cereal");
                    lectura = new Scanner(System.in);
                    precio = lectura.nextDouble();
                    cereal.setPrecio(precio);

                    System.out.println("Escriba el nuevo sabor del cereal");
                    lectura = new Scanner(System.in);
                    sabor = lectura.nextLine();
                    cereal.setSabor(sabor);

                    System.out.println("Se edito correctamente el siguiente cereal" + cereal.getNombre());
                    break;

                case 3:
                    System.out.println("Opción de Eliminar");
                    System.out.println("Escribe el indice del cereal a eliminar");
                    lectura = new Scanner(System.in);
                    index = lectura.nextInt();

                    lista.remove(index);

                    System.out.println("Cereal eliminado Correctamente!!");

                    break;

                case 4:
                    System.out.println("Opción de Busqueda");
                    System.out.println("Escribe el indice del cereal a buscar");
                    lectura = new Scanner(System.in);
                    index = lectura.nextInt();

                    cereal = lista.get(index);

                    System.out.println("El cereal encontrado es " + cereal);
                    break;

                case 5:
                    /*for (Cereal ceri : lista) {
                        System.out.println(lista.indexOf(ceri) + " " + ceri);

                    }*/
                    imp.mostrar();
                    break;

            }
        } while (menu
                < 6);
        System.out.println(
                "Fin");
    }

}
