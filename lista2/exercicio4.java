/*Faça um programa que calcule os 20 primeiros múltiplos de um valor informado via  teclado.*/

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("<-- CÁLCULO DOS 20 PRIMEIROS MÚLTIPLOS -->");
        System.out.println("Insira um número: ");
        double numero = entrada.nextDouble();
        int i = 0;

        while (i < 20){
            double multiplo = numero * i;
            i++;

            System.out.println("\n" + i + "° " + "múltiplo = " + multiplo);
        }
    }
    
}
