/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

public class Ejecutor {

    public static void main(String[] args) {

       String fileName = "hospital.txt";
        
        Hospital h1 = new Hospital("Isidro Ayora", 70, 5000);
        Hospital h2 = new Hospital("San Agustin", 30, 3500);
        Hospital h3 = new Hospital("UTPL", 20, 2000);

        Hospital[] listaHospitales = {h1, h2, h3};

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(fileName);

        for (int i = 0; i < listaHospitales.length; i++) {      
            archivo.establecerRegistro(listaHospitales[i]);       
            archivo.establecerSalida();
        }
        archivo.cerrarArchivo();
        
    

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(fileName);
        lectura.establecerListaHospitales();
        System.out.println(lectura);
    }
}