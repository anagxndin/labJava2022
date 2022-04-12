package exercicios2;

import java.util.Scanner;
public class ex10 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = entrada.nextInt();

        System.out.println("Insira um número: ");
        int numero2 = entrada.nextInt();

        System.out.println("Insira um número: ");
        int numero3 = entrada.nextInt();

        System.out.println("Insira um número (1,2,3): ");
        int numeroOP = entrada.nextInt();

        switch (numeroOP){
            case 1:
            double operacao = numero * numero2 * numero3;
            System.out.println(operacao);
            break;
            case 2:
            operacao = (numero + 2) * (numero2 + 3) * (numero3 * 6);
            System.out.println(operacao);
            break;
            case 3:
            operacao = numero + numero2 * (numero3 * 3);
            System.out.println(operacao);
            break;
            default:
            System.out.println("Operação não encontrada.");
        }

        entrada.close();
    }
    
}
