/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIO2703;
import java.util.Scanner;
/**
 *<> []
 * @author LABO B
 */
public class EJERCICIO5 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println(" ingresar primer numero");
        String n1=leer.nextLine();
        System.out.println(" ingresar segundo numero");
         String n2=leer.nextLine();
         int numero=Integer.parseInt(n1);
          int numero2=Integer.parseInt(n2);
          if(numero==numero2){
              System.out.println(" los numeros son iguales");
           
          }else{
              System.out.println("los numeros no son iguales");
          }
    }
}
