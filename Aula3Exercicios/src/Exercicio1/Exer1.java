/*
Crie um programa que leia um número inteiro e retorne se o mesmo é positivo ou 
negativo
 */
package Exercicio1;

import java.util.Scanner;
public class Exer1 {
    
    int numero;
    static Scanner ler = new Scanner (System.in);
    
 
    public static void main(String[] args) {
       
        System.out.println ("Digite um número:");
        int numero = ler.nextInt();
        
        if (numero >= 0)
        {
            System.out.println ("Esse número é positivo");
        }
        else
        {
            System.out.println ("Esse número é negativo");
        }
    }
    
}
