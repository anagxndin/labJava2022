package exercicios2;

import java.util.Scanner;
public class ex8 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade = entrada.nextInt();

        String categoria = "X";

        if (5 >= idade || idade <= 7) {
             categoria = "Infantil A";
        } else if (8 >= idade || idade <= 10) {
             categoria = "Infantil B";
        } else if (11 >= idade || idade <= 13) {
             categoria = "Juvenil A";
        } else if (14 >= idade || idade <= 17) {
             categoria = "Juvenil B";
        } else if (14 >= idade || idade <= 17) {
             categoria = "Sênior";
        }

        System.out.println("Você é um nadador da categoria " + categoria);

        entrada.close();
    }
    
}
