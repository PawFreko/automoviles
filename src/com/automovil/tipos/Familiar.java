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
public class Familiar extends Automovil{
    
    private int puertas;
    private int noPasajeros;
    private boolean asistenciaRemota;
    
    public Familiar(){}
    public Familiar(String marca,int velocidad, int puertas, int noPasajeros, boolean asistenciaRemota){
    super(marca,velocidad);
    this.puertas = puertas;
    this.noPasajeros = noPasajeros;
    this.asistenciaRemota = asistenciaRemota;
    
}

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getNoPasajeros() {
        return noPasajeros;
    }

    public void setNoPasajeros(int noPasajeros) {
        this.noPasajeros = noPasajeros;
    }

    public boolean isAsistenciaRemota() {
        return asistenciaRemota;
    }

    public void setAsistenciaRemota(boolean asistenciaRemota) {
        this.asistenciaRemota = asistenciaRemota;
    }
  
    
}
