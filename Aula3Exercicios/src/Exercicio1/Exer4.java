/*
 Faça um algoritmo que leia dois valores reais e exiba ao final qual dos dois é 
o maior.
 */
package Exercicio1;

import java.util.Scanner;

public class Exer4 {

    int valor1,valor2;
    static Scanner ler = new Scanner (System.in);
   
    public static void main(String[] args) {
        
        System.out.println ("Digite o primeiro número:");
        int valor1 = ler.nextInt();
        
        System.out.println ("Digite o segundo número:");
        int valor2 = ler.nextInt();
        
        if (valor1 > valor2)
            {
                 System.out.println ("Valor 1 é maior");

            }
        else
            {
                System.out.println ("Valor 2 é maior");
            }
    }
    
}
