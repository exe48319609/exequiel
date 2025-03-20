/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exe;
import java.util.Scanner;
/**
 *<> []
 * @author LABO B
 */
public class CondicionalMultiNivel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ingresar el signo");
        String signo=entrada.nextLine();
        int num1=12;
        int num2=20;
                
  

        // Evaluamos la opción con switch
        switch (signo) {
            case ("+"):
                int suma=num1+num2;
                System.out.println("la suma es igual"+suma);
                break;
            case ("-"):int resta=num1-num2;
                System.out.println("la resta es igual"+resta);
                break;
            case ("/"): int division=num1/num2;
                System.out.println("la division es igual"+division);
                break;
            default: int multi=num1*num2;
                System.out.println("la multi es igual"+multi);
        }

        System.out.println("Fin del programa.");
    }
    
}
