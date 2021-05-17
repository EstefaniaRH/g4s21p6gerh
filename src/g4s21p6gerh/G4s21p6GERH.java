/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21p6gerh;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author estef
 */
public class G4s21p6GERH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("A","B","C","D"));
        System.out.println("desplegando contenido por medio de foreach...\n");
        lista.forEach(contenido ->{
            System.out.println("El contenido del arreglo " + contenido);
        });
        lista.add("F");
        lista.add("Umaru");
        lista.add("Esta es una linea de texto");
        System.out.println("\n desplegando contenido con for \n");
        for(String contenido1 : lista){
            System.out.println("El contenido del arreglo " + contenido1);
        }
        lista.add("G");
        lista.add("H");
        lista.add("I");
        System.out.println(" \n desplegando contenido con stream\n");
        lista.stream().forEach(contenido2 -> {
            System.out.println("El contenido del arreglo " + contenido2); 
        });
        
        String cadena1 = "Variable1";
        String cadena2 = "Variable2";
        String cadena3 = "Variable3";
        
        lista.add(cadena1);
        lista.add(cadena2);
        lista.add(cadena3);
        // lista.add(4); tipo de dato no valido
        lista.add(String.valueOf(512));
        System.out.println("\n Desplegando contenido que se agrego con variables \n");
        for (String contenido3 : lista){
            System.out.println("El contenido del arreglo es " + contenido3 );
        
        }
        System.out.println("\nBuscando un valor \n");
        lista.forEach(contenido4 ->{
            if(contenido4.equals("H"))
                System.out.println("El valor fue encontrado");
                
        });
        
    }
    
    
}
