package exercicios2;

import java.util.Scanner;
public class ex5 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        double numero = entrada.nextDouble();

            if (numero > 0){
            System.out.println("\n" + numero + "² = " + numero * numero);
            System.out.println("A raiz quadrada de " + numero + " é " + Math.sqrt(numero));}

            entrada.close();
    }
    
}
