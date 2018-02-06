/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author Emmanuel
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        moldeDeCarro carrito1 = new moldeDeCarro();
        //carrito1.color= "aqua blue ";
        carrito1.setColor("narcotic blue ");
        carrito1.setMarca(" :ford" );
        carrito1.setPuertas(4);
        carrito1.setModelo("2018" );
        carrito1.setTransmicion("Standar ");
        System.out.println("El color es ; " + carrito1.color);
        System.out.println("El modelo del carro es" + carrito1.modelo ); 
        System.out.println(" la cantidad de puertas es "+ carrito1.puertas);
        System.out.println("La marca del carro es " + carrito1.marca);
        System.out.println(" la transmicion es "+ carrito1.transmicion);
        
        
        
    }
    
}
