/*. Faça um programa calculadora com as seguintes operações: 
∙ Soma 
∙ Subtrair 
∙ Multiplicar 
∙ Dividir 
 */


package exercicios2;

import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = entrada.nextDouble();
        System.out.print("Insira outro número: ");
        double numero2 = entrada.nextDouble();
        System.out.print("Escolha a operação (+, -, / ou *): ");
        char operacao = entrada.next().charAt(0);
        double resultado = 'x';

        switch (operacao) {
            case '*':
                resultado = numero * numero2;
                System.out.println(numero + " * " + numero2 + " = " + resultado);
                break;

            case '/':
                resultado = numero / numero2;
                System.out.println(numero + " / " + numero2 + " = " + resultado);
                break;
            
            case '-':
                resultado = numero - numero2;
                System.out.println(numero + " - " + numero2 + " = " + resultado);
                break;

            case '+': 
                resultado = numero + numero2;
                System.out.println(numero + " + " + numero2 + " = " + resultado);
                break;
            default:
                System.out.println("Operação não encontrada.");

        }


        entrada.close();

    }
}
