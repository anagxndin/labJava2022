/*1. Faça um programa que receba via teclado os dados de um produto. Os dados que  representam o produto estão listados abaixo: 
∙ Nome (String); 
∙ Modelo (String); 
∙ Tamanho (sendo float); 
∙ Preço (sendo double); 
∙ Quantidade (int). 
*/

package exercicios2;

import java.util.Scanner;
public class ex1 {
    public static void main(String[] args ) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Modelo: ");
        String modelo = entrada.nextLine();

        System.out.print("Tamanho: ");
        float tamanho = entrada.nextFloat();

        System.out.print("Preço: ");
        double valor = entrada.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = entrada.nextInt();

        System.out.println("Dados do Produto: \n \n Nome: " + nome+ "\n Modelo: " + modelo + "\n Tamanho: " + tamanho + "\n Preço: " + valor + "\n Quantidade: " + quantidade);


        entrada.close();
    }
    
}
