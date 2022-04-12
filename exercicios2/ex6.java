package exercicios2;

import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a sua altura (em metros): ");
        double altura = entrada.nextDouble();
        System.out.println("Insira o seu gênero ('F' para feminino e 'M' para masculino): ");
        char genero = entrada.next().charAt(0);
        double pesoIdeal = 'x';

        if (genero == 'M') {
             pesoIdeal = (72.2 * altura) - 58;
        } else if (genero == 'F') {
             pesoIdeal = (62.1 * altura) - 44.7;
        } 

        System.out.println("Seu peso ideal é " + pesoIdeal + "kg.");
        entrada.close();
    }

}