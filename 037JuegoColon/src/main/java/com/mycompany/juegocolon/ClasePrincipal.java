/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegocolon;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        int opcion_menu=EntradaSalida.mostrarMenu();
        ArrayList<Participantes> total=new ArrayList();
        
        while (opcion_menu!=3)
        {
           switch(opcion_menu){
               case 1:
                        String nombre=EntradaSalida.preguntarNombre();
                        
                        int pregunta1=EntradaSalida.pregunta1();
                        int pregunta2=EntradaSalida.pregunta2();
                        int pregunta3=EntradaSalida.pregunta3();
                        String pregunta4=EntradaSalida.pregunta4();
                        int puntos=0;
                        if (pregunta1==1451)
                        {
                            puntos=puntos+1;
                        }
                        if (pregunta2==3)
                        {
                            puntos=puntos+1;
                        }
                        if (pregunta3==1492)
                        {
                            puntos=puntos+1;
                        }
                        if (pregunta4.equalsIgnoreCase("Cristobal"))
                        {
                            puntos=puntos+1;
                        }
                        System.out.println("Has acertado "+puntos+" preguntas.");
                        Participantes p=new Participantes(nombre, puntos);
                        total.add(p);
                    
                        break;

            case 2: 
                   int n=1;
                for (Participantes t: total)
                {
                    int puntuacion=t.getPuntos();
                    System.out.println("participante "+n+": "+t);
                    n=n+1;
                    
                }
             /*   for (int i=0; i<total.size(); i++)
                {
                    Participantes part=total.get(i);
                    System.out.println("Participante "+(i+1)+": "+part);
                }*/
                    break;
           }
           opcion_menu=EntradaSalida.mostrarMenu();
               
        }        
        }
        
    
}
