/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Automovil extends Vehiculo {
    
    private int numeroPuertas;

    public Automovil( String marca, String modelo, String placa,int numeroPuertas, int horaEntrada, int horaSalida) {
        super(marca, modelo, placa, horaEntrada, horaSalida);
        this.numeroPuertas = numeroPuertas;
    }
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    
    
    public void guardarAuto (Automovil auto) throws IOException{
        try {
            FileOutputStream fichero;
            fichero = new FileOutputStream("auto.txt");
            ObjectOutputStream crear = new ObjectOutputStream(fichero);
            crear.writeObject(auto);
        } catch (FileNotFoundException ex) {
            System.out.println("\n033[32mA ocurrido un problema con el fichero");;
        }
    }
}