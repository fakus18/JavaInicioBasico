/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegocolon;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static String preguntarNombre()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre=sc.nextLine();
        return nombre;
        
    }
    public static int pregunta1(){
      Scanner sc=new Scanner(System.in);
        System.out.println("En que año nacio Colón?");
        int pregunta1=sc.nextInt();
        return pregunta1;
    }
     public static int pregunta2(){
      Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuantos barcos contaba la expedicion de Colon?");
        int pregunta2=sc.nextInt();
        return pregunta2;
    }
      public static int pregunta3(){
      Scanner sc=new Scanner(System.in);
        System.out.println("¿En que año llego Colon a America?");
        int pregunta3=sc.nextInt();
        return pregunta3;
    }
       public static String pregunta4(){
      Scanner sc=new Scanner(System.in);
        System.out.println("¿Como se llamaba Colón realmente?");
        String pregunta4=sc.nextLine();
        return pregunta4;
    }
      public static int mostrarMenu(){
          Scanner sc=new Scanner(System.in);
          System.out.println("1. Concursar");
          System.out.println("2. Ranking de Ganadores");
          System.out.println("3. Salir");
          return (new Scanner(System.in)).nextInt();
      }
}
