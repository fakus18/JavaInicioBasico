/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiendacomaparar;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        String ruta = "C:\\LUIS\\PROGRAMACION\\Productos.csv";
        //GrabarProductos.abrirAlEntrar(ruta);
        int menu = EntradaSalida.mostrarMenu();
        Producto p=null;
       
        while (menu != 3) {
            switch (menu) {
                case 1:
                    p=EntradaSalida.pedirProducto();
                    GrabarProductos.grabarLinea(p, ruta);
                    break;

                case 2:
                    ArrayList lista_final=GrabarProductos.abrirAlEntrar(ruta);
                    EntradaSalida.mostrarProductos(lista_final);
                    break;
            }

            menu = EntradaSalida.mostrarMenu();

        }

    }
}

