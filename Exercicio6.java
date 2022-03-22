import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args ) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Conversor de graus Celsius para Fahrenheit.");
        System.out.print("Insira uma temperatura em graus Celsius: ");
        double grausCelsius = entrada.nextInt();
        double Fahrenheit = (grausCelsius * 1.8) + 32;

        System.out.println(grausCelsius + "°C são equivalentes a " + Fahrenheit + "F");

    }

}
