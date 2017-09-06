/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author ledezmun
 */
public class JavaApplication3 {
    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
    int n = 0;
    int numeros = 0;
    int pares = 0; 
     
    System.out.println ("dame la buelta al ciclo for");
    n = entrada.nextInt();
    {
     for(int i = 1; i<=n;i++) {  
        
    System.out.println ("dame los numeros");
   numeros = entrada.nextInt();
   
    if (numeros % 2 == 0)
    {
      pares = pares +1;   
    }
    
    if (n >=20){
        }
   
     System.out.println("el total de los numeros pares es"+pares);
     {
         pares = pares + n;
     }
        }
       }         
    }
}

    
      
 
    

    
    

