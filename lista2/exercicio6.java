/*Criar um programa que leia 10 números positivos e imprima a raiz quadrada de cada número.*/

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        int tamanho = 10;
        int[] listaNumeros = new int[tamanho];

        while (i < tamanho){
            System.out.println("- Insira um número: ");
            int numero = entrada.nextInt();
            
            if (numero > 0){
                listaNumeros[i] = numero;
                System.out.println(Math.sqrt(listaNumeros[i]));
                
            }else{
                System.out.println("Insira um número positivo.");
            }
    
        i++;

        }

    }
    
}
