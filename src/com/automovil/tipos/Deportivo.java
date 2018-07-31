/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automovil.tipos;

import com.automovil.automovil.Automovil;

/**
 *
 * @author Lilith
 */
public class Deportivo extends Automovil {
    private int aceleracion;
    private int caballosFuerza;
  
 
    public Deportivo(){}
    public Deportivo(String marca,int velocidad, int aceleracion, int caballosFuerza){
        super(marca, velocidad);
        this.aceleracion = aceleracion;
        this.caballosFuerza = caballosFuerza;
        
    }
    
    
    
    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(String aceleracion) {
       
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
  
    
 
}
