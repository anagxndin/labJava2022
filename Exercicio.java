/*descobrir se um ano é bissexto ou não*/
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Descubra se um ano é bissexto:");
        System.out.print("Insira um ano: ");
        int ano = entrada.nextInt();

        if ((ano % 400 ) == 0){
            System.out.print(ano + " é um ano bissexto.");
        } else if (ano%4 == 0){

            if(ano%100 != 0){
                System.out.print(ano + " é um ano bissexto.");
            }

        }else{
            System.out.print(ano + " NÃO é um ano bissexto");
        }
}    
}
