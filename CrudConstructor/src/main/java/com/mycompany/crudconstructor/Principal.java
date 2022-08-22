/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crudconstructor;

import java.util.Scanner;

/**
 *
 * @author SaulGomez
 */
public class Principal {

    public static void main(String[] args) {
        String modelo;
        String marca;
        double precio;
        int puertas;

        Auto auto = null;
        Scanner lectura = null;
        int menu;
        do {
            
            System.out.println("Menu");
            System.out.println("1 ---> Alta");
            System.out.println("2 ---> Editar");
            System.out.println("3 ---> Mostrar");
            System.out.println("4 ---> Salir");
            lectura = new Scanner(System.in);
            menu = lectura.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Opción Alta");
                    
                    System.out.println("Escribe el modelo del auto");
                    lectura = new Scanner(System.in);
                    modelo = lectura.nextLine();
                    
                    System.out.println("Escribe la marca del auto");
                    lectura = new Scanner(System.in);
                    marca = lectura.nextLine();
                    
                    System.out.println("Escribe precio del auto");
                    lectura = new Scanner(System.in);
                    precio = lectura.nextDouble();
                    
                    System.out.println("Escribe el numero de puertas del auto");
                    lectura = new Scanner(System.in);
                    puertas = lectura.nextInt();
                    
                    auto = new Auto(modelo, marca, precio, puertas);
                    System.out.println("Se dio de alta el auto --> " + auto.getModelo());
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Escribe el precio del auto a editar");
                    lectura = new Scanner(System.in);
                    precio = lectura.nextDouble();
                    
                    auto.setPrecio(precio);
                    
                    System.out.println("Se edito el preio del auto "+ auto.getMarca()+ " correctamente.");
                    
                    break;
                    
                case 3:
                    
                    System.out.println(auto);
                    
                    break;
                    
                    default:
                        throw new AssertionError();

            }
        } while (menu<4);
    }

}
