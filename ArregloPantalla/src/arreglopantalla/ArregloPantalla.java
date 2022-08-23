/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglopantalla;

/**
 *
 * @author SaulGomez
 */
public class ArregloPantalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pantalla[] pantallas = new Pantalla[5];
        
        pantallas[0] = new Pantalla("Samsung", "Led", 45, 12321);
        pantallas[1] = new Pantalla("Hisense", "OLED", 90, 122323);
        pantallas[2] = new Pantalla("Sony", "LCd", 30, 2822);
        pantallas[3] = new Pantalla("Panasonic", "Plasma", 15, 93734);
        pantallas[4] = new Pantalla("Rca", "Led", 12, 27127);
        
        for (Pantalla pantalla : pantallas) {
            System.out.println(pantalla);
        }
    }
    
}
