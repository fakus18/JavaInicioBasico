/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiendacomaparar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {

    public static int mostrarMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Nuevo producto");
        System.out.println("2. Ver productos");
        System.out.println("3. Salir");
        int opcion = sc.nextInt();
        return opcion;
    }

    public static Producto pedirProducto() {
        Producto p=null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del producto");
        String nombre=sc.nextLine();
        System.out.println("Precio del producto");
        double precio=sc.nextDouble();
        p=new Producto(nombre, precio);
        return p;
    }

    public static void mostrarProductos(ArrayList<Producto> lista_final) {
        
                    
        for (Producto pro : lista_final) {
        System.out.println(pro);
        }
    }
    
    
    
}
