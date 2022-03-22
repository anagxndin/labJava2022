import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args ) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = entrada.nextInt();
        System.out.print("Insira o ano atual: ");
        int ano = entrada.nextInt();
        int anoNascimento = ano - idade;

        System.out.println("Você nasceu em " + anoNascimento + ".");

}

}
