/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiendacomparar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
class GrabarProductos {

    public static void grabarLinea(Producto p) {
        String linea = p.getNombre() + ";" + p.getPrecio() + "\n";

        try {
            FileWriter fw = new FileWriter("C:\\TextosNetbeans\\Productos.csv", true);
            fw.write(linea);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(GrabarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList abrirAlEntrar(String ruta) {
        ArrayList<Producto> lista_productos = new ArrayList<>();
        try {

            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            while (linea != null) {
                String[] datos = linea.split(";");
                double precio = Double.parseDouble(datos[1]);
                Producto p = new Producto(datos[0], precio);
                lista_productos.add(p);
                linea = br.readLine();
            }
            Collections.sort(lista_productos);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GrabarProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GrabarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista_productos;
    }

    /*public static Producto devolverDatos()
    {
        Producto datos_cc=null;
        try {
            String ruta="C:\\TextosNetbeans\\Productos.csv";
            FileReader fr=new FileReader(ruta);
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            while(linea!=null)
            {
                String[] datos=linea.split(",");
                datos_cc=new Producto (linea, 0);
                linea=br.readLine();
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos_cc;
    } */
}
