/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author axgomezm
 */
public class Familia {
    private Padre p1;
    private Madre m1;
    private Hijo h1;
    private Hijo h2;

    public Familia(Padre p1, Madre m1, Hijo h1, Hijo h2) {
        this.p1 = p1;
        this.m1 = m1;
        this.h1 = h1;
        this.h2 = h2;
    }

    public Padre getP1() {
        return p1;
    }

    public void setP1(Padre p1) {
        this.p1 = p1;
    }

    public Madre getM1() {
        return m1;
    }

    public void setM1(Madre m1) {
        this.m1 = m1;
    }

    public Hijo getH1() {
        return h1;
    }

    public void setH1(Hijo h1) {
        this.h1 = h1;
    }

    public Hijo getH2() {
        return h2;
    }

    public void setH2(Hijo h2) {
        this.h2 = h2;
    }
    public static void IngresarNuevaFamilia(){
         
     }
    public static void ConsultarFamilia(){
      
      }
    public static void ConsultarMiembro(){
      
      } 
     public static void main(String[] args) {
         System.out.println("****REGISTRO FAMILIAR****");
         int opcion;
         System.out.println("a.Ingresar una nueva familia. "); 
         System.out.println("b.Consultar familia. ");
         System.out.println("c.Ingresar una nueva familia. ");
         Scanner leer1= new Scanner (System.in);
         opcion=leer1.nextInt();
         switch(opcion)
         {
             case 1:
                 IngresarNuevaFamilia();
                 break;
             case 2:
                 ConsultarFamilia();
                 break;
             case 3:
                 ConsultarMiembro();
                 break;
             default:System.out.println("La opcion ingresada no es valida");
         }

     }
    
    
    
}
