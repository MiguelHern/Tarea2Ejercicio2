/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2ejercicio2;
import java.util.Scanner;
/**
 *
 * @author ROCIO
 */
public class Tarea2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija un número del 1 al 5");
        int opciones = entrada.nextInt();
        if(opciones >= 1 && opciones <= 5){
            if(opciones == 1){System.out.println("Correr");}
            else if(opciones ==2){System.out.println("Saltar");}
            else if(opciones==3){System.out.println("Dormir");}
            else if(opciones==4){System.out.println("Comer");}
            else if(opciones==5){System.out.println("Estudiar");}
        }else {System.out.println("Elija un número valido");}
        
    }
    
}
