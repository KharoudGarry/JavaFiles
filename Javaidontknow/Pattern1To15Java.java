/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author hp
 */
public class Pattern1To15Java {
    public static void main(String[] args) {
       int i,j;
       int k=1;
       for(i=1;i<=5;i++)
       {
           for (j=1;j<=i; j++) 
           {
               
               System.out.print(k);
               k++;
           }
           
           System.out.println();
       }
    }
}