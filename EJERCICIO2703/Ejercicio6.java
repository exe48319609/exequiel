/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIO2703;
import java.util.Scanner;
import java.util.Random;
/**
 *<> []
 * @author LABO B
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random=new Random();
        int numero2;
        int numero= random.nextInt(6)+1;
        System.out.println(numero);
       do{
           System.out.println(" ingresar el num 1.para lanzar el dado");
           System.out.println(" ingresar num 2 . para salir");
         numero=leer.nextInt();
          if(numero==0){
              System.out.println(" el numero de el dado es:"+numero);
          }else{
              
              
          }
       }
       }
}

       
          
       
        
    
        
        
        
        
    

