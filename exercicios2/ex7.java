package exercicios2;

import java.util.Scanner;
public class ex7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = entrada.nextDouble();

        System.out.print("Digite as iniciais de seu estado: ");
        String estado = entrada.nextLine();

        switch (estado) {
            case "MG":
                double taxa = (7/100 * valor);
                double valorFinal = valor + taxa;
                System.out.println("O valor total de seu produto é " + valorFinal);
                break;
            case "SP":
                taxa = (12/100 * valor);
                valorFinal = valor + taxa;
                System.out.println("O valor total de seu produto é " + valorFinal);
                break;
            case "RJ":
                taxa = (15/100 * valor);
                valorFinal = valor + taxa;
                System.out.println("O valor total de seu produto é " + valorFinal);
                break;
            case "MS":
                taxa = (8/100 * valor);
                valorFinal = valor + taxa;
                System.out.println("O valor total de seu produto é " + valorFinal);
                break;
            default:
            System.out.println("Erro: não vendemos para este estado.");

        }

        entrada.close();
    }
    
}
