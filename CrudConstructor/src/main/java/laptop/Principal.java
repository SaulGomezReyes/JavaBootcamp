/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptop;

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
        int memoriaRam;
        String grafica;

        Laptop lap = null;
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
                    
                    System.out.println("Escribe el modelo de la laptop");
                    lectura = new Scanner(System.in);
                    modelo = lectura.nextLine();
                    
                    System.out.println("Escribe la marca de la laptop");
                    lectura = new Scanner(System.in);
                    marca = lectura.nextLine();
                    
                    System.out.println("Escribe precio de la laptop");
                    lectura = new Scanner(System.in);
                    precio = lectura.nextDouble();
                    
                    System.out.println("Escribe el numero los gigas de RAM de la laptop");
                    lectura = new Scanner(System.in);
                    memoriaRam = lectura.nextInt();
                    
                    System.out.println("Escribe la tarjeta grafica de la laptop");
                    lectura = new Scanner(System.in);
                    grafica = lectura.nextLine();
                    
                    lap = new Laptop(modelo, marca, precio, memoriaRam, grafica);
                    System.out.println("Se dio de alta la laptop --> " + lap.getModelo());
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Escribe el precio de la laptop a editar");
                    lectura = new Scanner(System.in);
                    precio = lectura.nextDouble();
                    
                    lap.setPrecio(precio);
                    
                    System.out.println("Se edito el precio de la laptop "+ lap.getMarca()+ " correctamente.");
                    
                    break;
                    
                case 3:
                    
                    System.out.println(lap);
                    
                    break;
                    
                    

            }
        } while (menu<4);
        System.out.println("Fin");
    }
}
