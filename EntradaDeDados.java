import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args ) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Peso: ");
        int peso = entrada.nextInt();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura*altura);

        System.out.println("IMC de " + nome + ": " + imc);

        if( imc < 18.5) {
            System.out.println("ta muito magrinho jao :(");

        } else if( 24.9 > imc) {
            System.out.println("ce tá bão");

        } else if(imc > 25) {
            System.out.println("VAMO FAZER CARDIO COM O PATRICK!!!");

        }






    }
}