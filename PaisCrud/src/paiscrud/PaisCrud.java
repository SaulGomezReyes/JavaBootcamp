/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paiscrud;

import java.util.Scanner;

/**
 *
 * @author SaulGomez
 */
public class PaisCrud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre;
        String capital;
        int habitantes;
        double extencion;

        Pais pais = null;
        Scanner lectura = null;
        int menu;
        do {

            System.out.println("Menu de Paises");
            System.out.println("1 ---> Alta");
            System.out.println("2 ---> Editar");
            System.out.println("3 ---> Mostrar");
            System.out.println("4 ---> Salir");
            lectura = new Scanner(System.in);
            menu = lectura.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Opción Alta");

                    System.out.println("Escribe el nombre del pais");
                    lectura = new Scanner(System.in);
                    nombre = lectura.nextLine();

                    System.out.println("Escribe la capital del pais");
                    lectura = new Scanner(System.in);
                    capital = lectura.nextLine();

                    System.out.println("Escribe la extencion terriotorial del pais");
                    lectura = new Scanner(System.in);
                    extencion = lectura.nextDouble();

                    System.out.println("Escribe el numero de habitantes del pais");
                    lectura = new Scanner(System.in);
                    habitantes = lectura.nextInt();

                    pais = new Pais(nombre, capital, habitantes, extencion);
                    System.out.println("Se dio de alta el pais  --> " + pais.getNombre());

                    break;

                case 2:
                    int menu2;
                    do {
                        System.out.println("Selecciona el campo que deseas editar");
                        System.out.println("1 ---> Nombre");
                        System.out.println("2 ---> Capital");
                        System.out.println("3 ---> Extension");
                        System.out.println("4 ---> Habitantes");
                        System.out.println("5 ---> Salir");
                        lectura = new Scanner(System.in);
                        menu2 = lectura.nextInt();
                        switch (menu2) {
                            case 1:
                                System.out.println("Escribe el nuevo nombre del pais");
                                lectura = new Scanner(System.in);
                                nombre = lectura.nextLine();

                                pais.setNombre(nombre);

                                System.out.println("Se edito el nombre del pais " + pais.getNombre() + " correctamente.");
                                break;
                                case 2:
                                System.out.println("Escribe el nuevo capital del pais");
                                lectura = new Scanner(System.in);
                                capital = lectura.nextLine();

                                pais.setCapital(capital);

                                System.out.println("Se edito la capital del pais " + pais.getNombre() + " correctamente.");
                                break;
                                case 3:
                                System.out.println("Escribe el nuevo nombre del pais");
                                lectura = new Scanner(System.in);
                                extencion = lectura.nextDouble();

                                pais.setExtencion(extencion);

                                System.out.println("Se edito la extencion del pais " + pais.getNombre() + " correctamente.");
                                break;
                                case 4:
                                System.out.println("Escribe el nuevo nombre del pais");
                                lectura = new Scanner(System.in);
                                habitantes = lectura.nextInt();

                                pais.setHabitantes(habitantes);

                                System.out.println("Se edito los habitantes del pais " + pais.getNombre() + " correctamente.");
                                break;
                        }
                    } while (menu2 < 5);
                    break;

                case 3:

                    System.out.println(pais);

                    break;

            }
        } while (menu < 4);
        System.out.println("Fin");
    }

}
