/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temaguaydelparaguay;

import java.util.Scanner;

/**
 * D) Realiza un programa que lea un número por teclado y muestre a qué día de
 * la semana corresponde. Si el número leído es 1 visualizará Lunes, si es 2
 * visualizará Martes, si es 3 visualizará Miércoles, y así sucesivamente ? Para
 * cualquier otro valor visualizará "No válido".
 *
 * @author Paco
 */
public class EjemploSwitch {

    public static void main(String[] args) {
        //declaración de variables
        byte numeroDia = 0;
        Scanner reader = new Scanner(System.in);
        
        //lógica principal
        System.out.println("Dime un número de día y lo traduzco a letra");
        numeroDia = reader.nextByte();
        
        switch (numeroDia){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miércoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                //no hago nada
                
            case 7:
                System.out.println("Es finde");
                break;
            
            default:
                System.out.println("No entiendo el día");
                break;
        }
    }

}
