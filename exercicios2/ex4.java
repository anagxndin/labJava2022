package exercicios2;

import java.util.Scanner;
public class ex4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o valor de seu salário: ");
        double salario = entrada.nextDouble();
        System.out.println("Insira o valor de sua prestação: ");
        double prestacao = entrada.nextDouble();

        if(prestacao > ((20/100) * salario)){
          System.out.println("Empréstimo não concedido.");  ;
        } else {
            System.out.println("Empréstimo concedido");
        }

        entrada.close();
    }
    
}
