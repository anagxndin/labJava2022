import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args ) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Conversor de Dólares ($) para Reais (R$).");
        System.out.print("INSIRA UM VALOR: ");
        int valorDolar = entrada.nextInt();
        double cotDolar = 4.94;
        double valorReal = valorDolar * cotDolar;

        System.out.println("Para cotação do dólar igual a " + cotDolar + ", " + valorDolar + " dólares são equivalentes a " + valorReal + " reais.");

    }

}
