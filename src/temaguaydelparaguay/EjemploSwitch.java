/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temaguaydelparaguay;

import java.util.Scanner;

/**
 * D) Realiza un programa que lea un n�mero por teclado y muestre a qu� d�a de
 * la semana corresponde. Si el n�mero le�do es 1 visualizar� Lunes, si es 2
 * visualizar� Martes, si es 3 visualizar� Mi�rcoles, y as� sucesivamente ? Para
 * cualquier otro valor visualizar� "No v�lido".
 *
 * @author Paco
 */
public class EjemploSwitch {

    public static void main(String[] args) {
        //declaraci�n de variables
        byte numeroDia = 0;
        Scanner reader = new Scanner(System.in);
        
        //l�gica principal
        System.out.println("Dime un n�mero de d�a y lo traduzco a letra");
        numeroDia = reader.nextByte();
        
        switch (numeroDia){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es mi�rcoles");
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
                System.out.println("No entiendo el d�a");
                break;
        }
    }

}
