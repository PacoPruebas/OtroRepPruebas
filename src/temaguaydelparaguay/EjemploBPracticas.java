/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temaguaydelparaguay;

import java.util.Scanner;

/**
 * 3)	Crea un programa que lea un n�mero entero introducido y lo muestre como un
 * byte, double y booleano.
 *
 * @author Paco
 */
public class EjemploBPracticas {

    public static void main(String[] args) {
        //declaraci�n de variables
        int numIn = 0;
        byte numByte = 0;
        boolean valorBool = false;
        double valorDouble = 0;
        Scanner reader = new Scanner(System.in);

        //lectura de n�mero y conversiones
        System.out.println("Escribe un n�mero entero:");
        numIn = reader.nextInt();
        /**
         * aqu� hago todo lo relativo a cambios de tipo
         */
        System.out.printf("%.2f\n", (double) numIn); //este es el paso a double
        valorDouble = numIn;
        System.out.println(valorDouble);

        numByte = (byte) numIn;
        System.out.println(numByte);

        if (numIn >= 0) {
            valorBool = true;
        } else {
            valorBool = false;
        }

        //resultado final
        System.out.println("En booleano, el n�mero " + numIn + " ser�a " + valorBool);

    }

}
