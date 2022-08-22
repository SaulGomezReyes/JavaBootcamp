/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp;

/**
 *
 * @author SaulGomez
 */
public class BootCamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Refresco coca = new Refresco();
        coca.setNombre("CocaCola");
        coca.setMarca("CocaCompany");
        coca.setPrecio(12.90);
        coca.setContenido(600);
        System.out.println(coca);
        
        Refresco pepsi = new Refresco("PepsiCola", 19.99, "Pepsi Company", 900);
        System.out.println(pepsi);
    }
    
}
