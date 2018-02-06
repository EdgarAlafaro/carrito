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
public class moldeDeCarro {
    public  String color, modelo, transmicion, marca   ;
    public int puertas ;
    

    
// constructor 
    public moldeDeCarro(){
    color = "not available";
    modelo ="not available";
    transmicion ="not available";
    puertas = 0;
    marca = "ford";
    
    }
    
  public void setColor (String valor ){// parametros caloresargumentos : (String valor )[
        color= valor;
        
    }
public void setMarca  (String valor ){
    marca = valor ;
}    
public void setPuertas (int valor ){
    puertas = valor ;
    
}
public void setModelo (String valor ){
    modelo = valor ;
    
}
public void setTransmicion (String valor ){
    transmicion =valor ;
    
}

}

