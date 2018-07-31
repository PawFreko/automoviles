/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automovil.partes;

/**
 *
 * @author Lilith
 */
public class Motor{

    private int consumo;
    private int noPistones;
    private int cilindros;
    
 public Motor() {}
 
 public Motor(int consumo, int noPistones, int cilindros){
     this.consumo = consumo;
     this.noPistones = noPistones;
     this.cilindros = cilindros;
 }
    
    public String arrancar(){
        return null;
    }
    public String mover(){
        return null;
    }
    public String pararMotor(){
        return null;
    }
 
    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getNoPistones() {
        return noPistones;
    }

    public void setNoPistones(int noPistones) {
        this.noPistones = noPistones;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

 
 
    
}
