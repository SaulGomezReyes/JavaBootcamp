/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intcrudfrutas;

import java.util.Scanner;

/**
 *
 * @author SaulGomez
 */
public class IntCrudFrutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre;
        String color;
        double precio;

        Frutas fruta = null;

        int menu, indice, menuEdit;
        Scanner lectura = null;

        ImpFruta imp = new ImpFruta();

        do {

            System.out.println("Bienvenido A la Fruteria \n Seleccione una opción:");
            System.out.println("1 ---> Alta");
            System.out.println("2 ---> Editar");
            System.out.println("3 ---> Eliminar");
            System.out.println("4 ---> Contar");
            System.out.println("5 ---> Mostrar Todo");
            System.out.println("6 ---> Eliminar Todo");
            System.out.println("7 ---> Buscar por nombre");
            System.out.println("8 ---> Hay frutas o no");

            System.out.println("9 ---> Salir");
            lectura = new Scanner(System.in);
            menu = lectura.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Registre nueva Fruta");

                    System.out.println("Ingrese el nombre de la fruta");
                    lectura = new Scanner(System.in);
                    nombre = lectura.nextLine();

                    System.out.println("Ingrese color de la fruta");
                    lectura = new Scanner(System.in);
                    color = lectura.nextLine();

                    System.out.println("Ingrese el precio de la fruta");
                    lectura = new Scanner(System.in);
                    precio = lectura.nextDouble();

                    fruta = new Frutas(nombre, color, precio);
                    imp.guardar(fruta);
                    System.out.println("Se registró la nueva fruta  --> " + fruta.getNombre());

                    break;

                case 2:

                    System.out.println("Escribe el indice del cereal para editar");
                    lectura = new Scanner(System.in);
                    indice = lectura.nextInt();

                    fruta = imp.buscar(indice);

                    do {
                        System.out.println("Opcion a Editar");
                        System.out.println("1 --> Color");
                        System.out.println("2 --> Precio");
                        System.out.println("2 --> Salir");

                        lectura = new Scanner(System.in);
                        menuEdit = lectura.nextInt();

                        switch (menuEdit) {
                            case 1:
                                System.out.println("Nuevo color de la fruta");
                                lectura = new Scanner(System.in);
                                color = lectura.nextLine();
                                fruta.setColor(color);
                                break;
                            case 2:
                                System.out.println("Nuevo precio de la fruta");
                                lectura = new Scanner(System.in);
                                precio = lectura.nextDouble();
                                fruta.setPrecio(precio);
                                break;
                        }

                    } while (menuEdit < 3);

                    imp.editar(indice, fruta);

                    System.out.println("Se edito correctamente el siguiente cereal" + fruta.getNombre());
                    break;

                case 3:
                    System.out.println("Opción de Eliminar");
                    System.out.println("Escribe el indice de la fruta a eliminar");
                    lectura = new Scanner(System.in);
                    indice = lectura.nextInt();

                    imp.eliminar(indice);

                    System.out.println("Fruta eliminada Correctamente!!");

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
                    if (imp.vacio() == true) {
                        System.out.println("Esta vacio");
                    } else {
                        System.out.println("No esta vacia");
                    }
                    break;

            }
        } while (menu < 9);
        System.out.println("Fin");
    }

}
