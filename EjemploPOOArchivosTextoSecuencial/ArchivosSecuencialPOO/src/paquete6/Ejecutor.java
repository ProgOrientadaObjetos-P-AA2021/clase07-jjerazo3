/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;
import java.util.ArrayList;
/**
 *
 * @author USUARIO 2020
 */
public class Ejecutor {
   public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "hospital.txt";
        
        Hospital h1 = new Hospital("Isidro Ayora", 70, 5000);
        Hospital h2 = new Hospital("San Agustin", 30, 3500);
        Hospital h3 = new Hospital("UTPL", 20, 2000);

        EscrituraHospital escritura = new EscrituraHospital(nombreArchivo);
        // establecer el valor del atributo registro
        escritura.establecerRegistro(h1);
        escritura.establecerSalida(); 
        
        escritura.establecerRegistro(h2);
        escritura.establecerSalida();
        
        escritura.establecerRegistro(h3);
        escritura.establecerSalida();
        
        escritura.cerrarArchivo();
        
        // proceso para lectura del archivo
        LecturaHospital lectura = new LecturaHospital(nombreArchivo);
        lectura.establecerLista();
        // System.out.println(lectura.toString());
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}

