/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

/**
 *
 * @author aparcerozas
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche coche1 = new Coche();
        System.out.println("velocidade = " + coche1.getVelocidade());
        coche1.acelerar(80);
        System.out.println("velocidade = " + coche1.getVelocidade());
        coche1.frenar(20);
        System.out.println("velocidade = " + coche1.getVelocidade());
    }
    
}
