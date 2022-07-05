/*Faça um programa que verifique os números de 0 a 500, e verifique se ele está entre o intervalo de 100 e 200. 
Se estiver dentro desta faixa, imprimir “Você digitou um número entre 100 e 200”, senão  imprima “Você digitou um número fora da faixa”.*/

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero de 0 a 500: ");
        int numero = entrada.nextInt();

        if(numero > 100 && numero < 200){
            System.out.println("Você digitou um número entre 100 e 200.");
        } else {
            System.out.println("Você digitou um número fora da faixa.");
        }
    }
    
}
