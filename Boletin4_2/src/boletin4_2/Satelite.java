/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_2;

/**
 *
 * @author aparcerozas
 */
public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTierra;
    
    public Satelite(){
        meridiano = paralelo = distanciaTierra = 0;
    }
    public Satelite(double m, double p, double d){
        meridiano = m ;
        paralelo = p;
        distanciaTierra = d ;
    }
    public void verPosicion(){
        System.out.println("paralelo = " + paralelo + "\nmeridiano = " + meridiano + "\ndistancia a la tierra = " + distanciaTierra); 
    }
}
