/*
1. Criar um programa onde é solicitado a digitação do nome do aluno mais 3 notas.
O programa deverá retornar o nome e clacular a média aritmética deste aluno.
nota1 + nota2 + nota 3 / 3.
 */
package exercicio1;
import java.util.Scanner;


public class Exer1 {
    double nota1, nota2,nota3;
    String nome;
    
    static Scanner ler = new Scanner(System.in);
    
 public static void main(String[] args) {
     
     System.out.println ("*** SISTEMA DE NOTAS***");
     
     System.out.println ("Digite o seu nome:");
     String nome= ler.nextLine();
     
     System.out.println ("Digite primeira nota:");
     double nota1= ler.nextDouble();
     
     System.out.println ("Digite a segunda nota");
     double nota2= ler.nextDouble();
     
     System.out.println ("Digite a terceita nota");
     double nota3= ler.nextDouble();
     
     System.out.println ("A sua média é: " + (nota1+nota2+nota3)/3);
             
        
        
    }
    
}
