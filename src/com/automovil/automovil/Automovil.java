/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automovil.automovil;

import com.automovil.partes.Motor;
import com.automovil.tipos.Deportivo;

/**Diapo 96 presentacion
 *
 * @author Paw
 */
public class Automovil {
    private String marca;
    private int velocidad;
    
    public Automovil(){}
    
    public Automovil(String marca, int velocidad){
        this.marca = marca;
        this.velocidad = velocidad;
    }
    
    

     public void avanzar(int n_kilometros) {
        System.out.println("El "+ this.marca+ " avanzo "+this.velocidad);
        
    }
       public void parar(){
           System.out.println("El "+ this.marca+ " se paro.");
       }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

 
    
}
