/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temaguaydelparaguay;

/**
 *
 * @author Paco
 */
public class numeroPosNegCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;

        if (numero >= 0) {
            System.out.println("Es positivo o cero");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }

        System.out.println("FIn del programa ---------------------");

        numero = 0;
        String resultado = "";

        if (numero == 0) {
            System.out.println("Es cero");
        } else if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        resultado = (numero == 0) ? "Es cero"
                : ((numero % 2 == 0) ? "Es par" : "Es impar");
        System.out.println(resultado);
    }

}
