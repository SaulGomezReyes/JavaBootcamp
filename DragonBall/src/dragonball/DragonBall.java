/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonball;

import java.util.Scanner;

/**
 *
 * @author SaulGomez
 */
public class DragonBall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String raza;
        int ki;
        String universo;

        Personaje persona = null;
        Scanner lectura = null;
        int menu;
        do {

            System.out.println("Menu de Personajes de Goku");
            System.out.println("1 ---> Alta");
            System.out.println("2 ---> Editar");
            System.out.println("3 ---> Mostrar");
            System.out.println("4 ---> Salir");
            lectura = new Scanner(System.in);
            menu = lectura.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Opción Alta de personaje");

                    System.out.println("Escribe el nombre del personaje");
                    lectura = new Scanner(System.in);
                    nombre = lectura.nextLine();

                    System.out.println("Escribe la raza del personaje");
                    lectura = new Scanner(System.in);
                    raza = lectura.nextLine();

                    System.out.println("Escribe la cantidad de Ki del personaje");
                    lectura = new Scanner(System.in);
                    ki = lectura.nextInt();

                    System.out.println("Escribe el universo del personaje");
                    lectura = new Scanner(System.in);
                    universo = lectura.nextLine();

                    persona = new Personaje(nombre, raza, ki, universo);
                    System.out.println("Se dio de alta el siguiente personaje  --> " + persona.getNombre());

                    break;

                case 2:

                    System.out.println("Actualizar valor de Ki");
                    lectura = new Scanner(System.in);
                    ki = lectura.nextInt();
                    persona.setKi(ki);

                    System.out.println("Actualizar el universo");
                    lectura = new Scanner(System.in);
                    universo = lectura.nextLine();
                    persona.setUniverso(universo);

                    System.out.println("Se edito el personaje " + persona.getNombre() + " correctamente.");
                    break;

                case 3:

                    System.out.println(persona);
                    break;

            }
        } while (menu < 4);
        System.out.println("Fin");
    }

}
