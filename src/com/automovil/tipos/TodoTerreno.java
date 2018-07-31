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
public class TodoTerreno extends Automovil{
    private String traccion;
    private boolean todoterreno;
    
    public TodoTerreno(){}
    public TodoTerreno(String marca, int velocidad, String traccion, boolean todoterreno){
        super(marca,velocidad);
                this.traccion = traccion;
                this.todoterreno = todoterreno;
                
    }
   
    
    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public boolean isTodoterreno() {
        return todoterreno;
    }

    public void setTodoterreno(boolean todoterreno) {
        this.todoterreno = todoterreno;
    }
    
     
}
