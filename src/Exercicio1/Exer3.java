/*
 3. Faça um programa que leia uma variável real "A" digitada pelo usuário
e apresente o resultado dos seguintes cálculos:
- o dobro de "A"
- o triplo do dobro de "A"
- a metade do triplo do dobro de "A"
- o quadrado da variável "A"
- a quinta parte do dobro de "A"

 */
package exercicio1;
import java.util.Scanner;


public class Exer3 {
    
    double a;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args){
        
        System.out.println ("Digite o valor a");
        int a = ler.nextInt();
        
        System.out.println ("O dobro de a é " + (a*2));
        System.out.println ("O triplo do dobro de A é " + (a*2*3));
        System.out.println ("A metade do triplo do dobro de a é " +  (a*2*3)/2);
        System.out.println ("O quadrado da variável de A é " + (a*a));
        System.out.println ("A quinta parte do dobro de A é " + (a*2)/5);
    }
}

        
        
