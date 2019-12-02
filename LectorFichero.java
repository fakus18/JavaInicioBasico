/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hashmapsplit;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
public class LectorFichero {
   public static String[] leerSepararPalabras()
   {
       String aux="";
       String[] datos=null;
       //Array<String> lista_palabras=new [];
       try {
           //FileReader fr = new FileReader("C:\\TextosNetbeans\\palabras.csv");
           
           
           InputStreamReader i=new InputStreamReader(new FileInputStream("C:\\TextosNetbeans\\palabras.csv"), "UTF-8");
           BufferedReader br=new BufferedReader(i);
           String linea=br.readLine();
           while(linea!=null)
           {
               aux+=linea;
               linea=br.readLine();
           }
           aux=aux.replace(".", "");
           aux=aux.replace(",", "");
           aux=aux.replace(";", "");
           aux=aux.replace(":", "");
           
           datos=aux.split(" ");
           
       } catch (FileNotFoundException ex) {
           Logger.getLogger(LectorFichero.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(LectorFichero.class.getName()).log(Level.SEVERE, null, ex);
       }
       return datos;
       
       
   }    
}
