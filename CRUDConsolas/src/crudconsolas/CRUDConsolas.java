/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudconsolas;

import java.util.Scanner;

/**
 *
 * @author SaulGomez
 */
public class CRUDConsolas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String marca;
        double precio;

        Consola consola = null;

        int menu, indice, menuEdit;
        Scanner lectura = null;

        Implementacion imp = new Implementacion();

        do {

            System.out.println("Bienvenido!! \n Seleccione una opción:");
            System.out.println("1 ---> Alta");
            System.out.println("2 ---> Editar");
            System.out.println("3 ---> Eliminar");
            System.out.println("4 ---> Contar");
            System.out.println("5 ---> Mostrar Todo");
            System.out.println("6 ---> Eliminar Todo");
            System.out.println("7 ---> Buscar por nombre");
            System.out.println("8 ---> Hay consolas o no?");

            System.out.println("9 ---> Salir");
            lectura = new Scanner(System.in);
            menu = lectura.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Registre nueva Consola");

                    System.out.println("Ingrese el nombre de la consola");
                    lectura = new Scanner(System.in);
                    nombre = lectura.nextLine();

                    System.out.println("Ingrese la marca de la Consola");
                    lectura = new Scanner(System.in);
                    marca = lectura.nextLine();

                    System.out.println("Ingrese el precio de la Consola");
                    lectura = new Scanner(System.in);
                    precio = lectura.nextDouble();

                    consola = new Consola(nombre, marca, precio);
                    imp.guardar(consola);
                    System.out.println("Se registró la nueva consola  --> " + consola.getNombre());

                    break;

                case 2:

                    System.out.println("Escribe el indice de la consola para editar");
                    lectura = new Scanner(System.in);
                    indice = lectura.nextInt();

                    consola = imp.buscar(indice);

                    do {
                        System.out.println("Opcion a Editar");
                        System.out.println("1 --> Marca");
                        System.out.println("2 --> Precio");
                        System.out.println("2 --> Salir");

                        lectura = new Scanner(System.in);
                        menuEdit = lectura.nextInt();

                        switch (menuEdit) {
                            case 1:
                                System.out.println("Nueva marca de la Consola");
                                lectura = new Scanner(System.in);
                                marca = lectura.nextLine();
                                consola.setMarcar(marca);
                                break;
                            case 2:
                                System.out.println("Nuevo precio de la consola");
                                lectura = new Scanner(System.in);
                                precio = lectura.nextDouble();
                                consola.setPrecio(precio);
                                break;
                        }

                    } while (menuEdit < 3);

                    imp.editar(indice, consola);

                    System.out.println("Se edito correctamente la siguiente consola" + consola.getNombre());
                    break;

                case 3:
                    System.out.println("Opción de Eliminar");
                    System.out.println("Escribe el indice de la consola a eliminar");
                    lectura = new Scanner(System.in);
                    indice = lectura.nextInt();

                    imp.eliminar(indice);

                    System.out.println("Consola eliminada Correctamente!!");

                    break;

                case 4:

                    imp.contar();
                    break;

                case 5:
                    /*for (Cereal ceri : lista) {
                        System.out.println(lista.indexOf(ceri) + " " + ceri);

                    }*/
                    imp.mostrar();
                    break;

                case 6:
                    /*for (Cereal ceri : lista) {
                        System.out.println(lista.indexOf(ceri) + " " + ceri);

                    }*/
                    imp.eliminarTodo();
                    System.out.println("Se ha eliminado todo!!");
                    break;
                case 7:

                    System.out.println("Escribe el nombre que desas buscar");
                    lectura = new Scanner(System.in);
                    nombre = lectura.nextLine();
                    imp.buscarNombre(nombre);
                    
                    break;
                case 8:
                    /*for (Cereal ceri : lista) {
                        System.out.println(lista.indexOf(ceri) + " " + ceri);

                    }*/
                    imp.vacio();
                    break;

            }
        } while (menu < 9);
        System.out.println("Fin");
    }

    }
    

