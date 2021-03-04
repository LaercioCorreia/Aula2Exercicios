/*
 Faça um algoritmo que leia um valor inteiro e retorne se este valor é PAR ou 
ÍMPAR.
 */
package Exercicio1;

import java.util.Scanner;


public class Exer3
    {
    
    int valor;
    static Scanner ler = new Scanner (System.in);
 
    public static void main(String[] args)
    
    {
        System.out.println ("Digite um número:");
        int valor = ler.nextInt();
        
        if(valor % 2 == 0)
        System.out.println("É par !");

        else{
             System.out.println("É impar!");
        }
       
    
    }
    
}
