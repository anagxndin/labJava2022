package exercicios2;

import java.util.Scanner;
public class ex9 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Insira o seu peso: ");
        double peso = entrada.nextDouble();

        if (altura < 1.20){

        } else if (peso < 60) {
            System.out.println("Categoria A.");
        } else if (peso > 60 && peso <= 90) {
            System.out.println("Categoria D.");
        } else if (peso > 90) {
            System.out.println("Categoria G.");
        }


        if (altura > 1.20 || altura < 1.70){

        } else if (peso < 60) {
            System.out.println("Categoria B.");
        } else if (peso > 60 || peso <= 90) {
            System.out.println("Categoria E.");
        } else if (peso > 90) {
            System.out.println("Categoria H.");
        }


        if (altura > 1.70) {
        } else if (peso < 60) {
            System.out.println("Categoria C.");
        } else if (peso > 60 || peso <= 90) {
            System.out.println("Categoria F.");
        } else if (peso > 90) {
            System.out.println("Categoria I.");
        }

        entrada.close();
    }
    
}
