/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composicion;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;








/**
 *
 * @author Fatima
 */
public class Composicion {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora c1 = new Computadora("HP","Pavilion" , new Monitor("Asus", "VS208N", 2), 
                new Mouse("Logitche", "G2023", "Alambrico"), new Teclado("Logitech", "G2013", 105, 10), new CPU("Asus", "VS208N", (float) 3.6));
        System.out.println(c1);
       
    }

    
}
