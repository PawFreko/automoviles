/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automovil.principal;

import com.automovil.tipos.Deportivo;
import com.automovil.partes.Motor;
import com.automovil.automovil.Automovil;

/**
 *
 * @author Lilith
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil();
        
        Motor motor1 = new Motor(12,34,45);
        
        Deportivo Lambo1 = new Deportivo("Lamborghini", 700,3, 1000);
        Deportivo Bugatti = new Deportivo("Bugatti", 1200, 3, 900);
       
        
        //chekar la abstraccion, esta redundante porQue dep esta heredando todo lo de automovil
        // es tonto, buscar otra linea logica.
        auto1.setDeportivo(Lambo1);
        auto1.setMotor(motor1);
        
       
      
    
        final int DISTANCIA = 100;
        
        double tiempo1 = calcularTiempo(DISTANCIA,auto1.getVelocidad());
        double tiempo2 = calcularTiempo(DISTANCIA,auto2.getVelocidad());
        
        
        compararTiempo(tiempo1,tiempo2);

        Automovil autoGanador = compararTiempo(auto1,auto2,DISTANCIA);
        
        System.out.println("El automovil mas rapido es " + autoGanador.getMarca());
        
    }
    
    public static double calcularTiempo(int DISTANCIA, int velocidad) {
        double tiempo = (double) DISTANCIA / (double) velocidad;
        
        return tiempo;
        }
        
        public static void compararTiempo(double tiempo1,double tiempo2){
        if(tiempo1<tiempo2)
            System.out.println("El auto más rapido es el primer coche");
        else
            System.out.println("El auto más rapido es el segundo");
        }
        
       private static Automovil compararTiempo(Automovil auto1, Automovil auto2, int DISTANCIA) {
       
        double tiempo1 = calcularTiempo(DISTANCIA,auto1.getVelocidad());
        double tiempo2 = calcularTiempo(DISTANCIA,auto2.getVelocidad());
        
        if(tiempo1<tiempo2)
            return auto1;
        else
            return auto2;
    }
       
}
    

