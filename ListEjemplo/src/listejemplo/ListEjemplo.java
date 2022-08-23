/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listejemplo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SaulGomez
 */
public class ListEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Pantalla> listaPantalla = new ArrayList<Pantalla>();
       
        
        Pantalla sam = new Pantalla("Samsung", "Led", 45, 12321);
        Pantalla his = new Pantalla("Hisense", "OLED", 90, 122323);
        Pantalla son = new Pantalla("Sony", "LCd", 30, 2822);
        Pantalla span = new Pantalla("Panasonic", "Plasma", 15, 93734);
        Pantalla rca= new Pantalla("Rca", "Led", 12, 27127);
        
        Pantalla pantallaC = null;
        
        listaPantalla.add(sam);
        listaPantalla.add(his);
        listaPantalla.add(son);
        listaPantalla.add(span);
        listaPantalla.add(rca);
        
        
        for (Pantalla pantalla : listaPantalla) {
            System.out.println( listaPantalla.indexOf(pantalla)+ 1);
            System.out.println( pantalla);
        }
        
        //buscar
        pantallaC = listaPantalla.get(2);
        
        System.out.println("Busqueda: \n"+pantallaC);
        
        //editar
        pantallaC = listaPantalla.get(2);
        pantallaC.setPrecio(9999);
        System.out.println("Busqueda: \n"+pantallaC);
        
        listaPantalla.remove(2);
        for (Pantalla pantalla : listaPantalla) {
            System.out.println( listaPantalla.indexOf(pantalla)+ 1);
            System.out.println( pantalla);
        }
    }
    
}
