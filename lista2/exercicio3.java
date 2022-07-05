/*Faça um programa que calcule o fatorial de um número informado via teclado.
 *O fatorial de um número n (n pertence ao conjunto dos números naturais) é sempre o produto de todos os seus antecessores, incluindo si próprio e excluindo o zero.
  exemplo: 6! = 6 . (6-1) . (6-2) . (6-3)!
6! = 6 . 5 . 4 . 3! 6! = 120 . 3!
6! = 120 . 3 . (3-1) . (3-2)!
6! = 120 . 3 . 2 . 1!
6! = 120 . 6 = 720

*/

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("<------ CÁLCULO DE FATORIAL ------>");
        System.out.println("Insira um número: ");
        double numero = entrada.nextDouble();
       
        double x = numero;

        if (numero < 0){
            System.out.println("Não há fatorial de números negativos");
        } else {

            while(numero > 1){
                x = x * (numero-1);
                numero--;
            }

            System.out.println("O fatorial é " + x + ".");
            
        }


    }
    
}
