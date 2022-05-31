package exercicios2;

import java.util.Scanner; 
public class ex13 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = entrada.nextInt();

        if (numero%3 == 0 || numero%5 == 0){
            System.out.println("Este número é divisível por 3 ou 5 não-simultaneamente.");
        }

        entrada.close();
    }
    
}
