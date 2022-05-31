import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args ) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Conversor de Km/h para m/s.");
        System.out.print("Insira uma distância em Km/h: ");
        int velocidadekm = entrada.nextInt();

        int velocidadems = velocidadekm / 36;

        System.out.println(velocidadekm + "Km/h são equivalentes a " + velocidadems + "m/s");

    }

}
