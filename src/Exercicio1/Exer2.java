/*
 Criar um programa é solicitado ao usuário que digite o valor do raio de
uma circunferência. O programa retorna o valor do diâmetro e de
1 quadrante desta circunferência.
 */
package exercicio1;
import java.util.Scanner;


public class Exer2 {
    double raio;
    
    static Scanner leitura = new Scanner (System.in);
    
     public static void main(String[] args){
    
         System.out.println ("Digite o valor do raio");
         double raio = leitura.nextDouble();
         
         System.out.println ("O valor do diâmetro é:" + (raio * 2));
         System.out.println ("O valor do quadrante é:" + (raio /4));
    

     }
}
