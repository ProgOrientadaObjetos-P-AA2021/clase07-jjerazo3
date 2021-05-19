/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author USUARIO 2020
 */
public class Hospital {
    String nombre;
    int numeroCamas;
    double presupuesto;
    
    /* 
    Agregar valor de objetos de tipo Hospital a un archivo
    Y leer el archivo
    */
    
    public Hospital(String n, int c, double p){
        this.nombre = n;
        this.numeroCamas = c;
        this.presupuesto = p;
    }
    
    public void estabelcerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumeroCamas(int c){
        numeroCamas = c;
    }
    
    public void establecerPresupuesto(double p){
        presupuesto = p;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
