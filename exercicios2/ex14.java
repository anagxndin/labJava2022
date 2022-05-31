package exercicios2;

import java.util.Scanner;
public class ex14 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o coeficiente 'a':" );
        double a = entrada.nextDouble();
        
        System.out.println("Insira o coeficiente 'b':" );
        double b = entrada.nextDouble();
        
        System.out.println("Insira o coeficiente 'c':" );
        double c = entrada.nextDouble();

        double delta = (b * b) - 4 * (a * c);

        if (delta < 0){
            System.out.println("Não existe raiz. ");
        } else if (delta == 0){
            System.out.println("Raiz única. ");
        } else if (delta > 0){
            double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
            double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("As raízes reais são" + raiz1 + " e " + raiz2);
        }



        entrada.close();
    }
    
}
