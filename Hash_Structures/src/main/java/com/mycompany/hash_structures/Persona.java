/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hash_structures;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author USUARIO
 */
public class Persona {
    public String cui;
    public String vacuna;
    public String fecha;

    public Persona(String cui, String vacuna, String fecha) {
        this.cui = cui;
        this.vacuna = vacuna;
        this.fecha = fecha;
    }

    public static String mandarTxt(String temp) {
        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("C:\\Users\\USUARIO\\Desktop\\Test.txt");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir = new FileWriter(archivo, true);

            //Escribimos en el archivo con el metodo write
            escribir.write(temp);
            escribir.write("\n");
            //Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }

        return null;

    }
}





/*
    @Override
    public int hashCode() {
        return cui * this.name.length();
    }

    @Override
    public boolean equals(Object obj) {
       // La igualdad se comprobará por el cui
       if (obj instanceof Persona) {
           Persona p = (Persona)obj;
          return this.cui.equals(p.cui);   
       } else {
           return false;
       }
   }  
    */

