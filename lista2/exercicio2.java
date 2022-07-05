import java.util.Scanner;

/* Faça um programa que de 0 a 100 verifique se o número é par ou impar. 
Caso esse valor seja par, deverá imprimir  “Número par” caso contrário, “Número ímpar”. */

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número de 0 a 100: ");
        int numero = entrada.nextInt();

        if (numero%2 == 0){
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }
    }
    
}
