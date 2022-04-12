/*3. Faça um programa que leia dois números e mostre o maior deles. Se, por acaso, os dois  números forem iguais, imprima a mensagem “Números iguais”. 
 */



package exercicios2;

import java.util.Scanner;
public class ex3 {

    public static void main(String[] args ) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        double numero = entrada.nextDouble();
        System.out.println("Insira outro número: ");
        double numero2 = entrada.nextDouble();

        if(numero > numero2){
            System.out.println(numero + " é o maior número.");
        } else if (numero2 > numero){
            System.out.println(numero2 + " é o maior número");
        } else {
            System.out.println("Os números são iguais.");
        }

        entrada.close();
    }
    
}
