/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galletas;

/**
 *
 * @author SaulGomez
 */
public class main {
     public static void main(String[] args) {
        // TODO code application logic here
        
        Galleta emperador = new Galleta();
        emperador.setMarca("Emeperador");
        emperador.setSabor("Nuez");
        emperador.setPrecio(10.50);
        emperador.setPeso(350);
        System.out.println(emperador);
        
        Galleta oreo = new Galleta("Oreo", 12.50, "Chocolate",  550);
        System.out.println(oreo);
        
    }
    
}
        
    

