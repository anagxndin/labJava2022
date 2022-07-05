
/*Criar um programa que receba vários números inteiros e positivos e imprima a média dos números múltiplos de 3.*/
import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        /*pode se usar while, do while ou for (estruturas de repetição)*/

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva a quantidade de números a ser digitada: ");
        int tamanho = entrada.nextInt();
        /* criando um vetor: tipo[] nomedovetor = new tipo[tamanhodovetor]; */
        int[] vetor = new int[tamanho];
        /*vetores podem ter qualquer tamanho (estrutura que recebe várias informações de um mesmo tipo*/

        float media = 0;
        int contadorMedia = 0;
        int soma = 0;
        

        for (int i = 0; i < tamanho; i++) {
            int numero = -1; 
            while (numero < 0){
                System.out.println("Digite um número inteiro e positivo: ");
                numero = entrada.nextInt();
                if (numero < 0){
                    System.out.println("O número digitado é negativo. Por favor, Digite um número Positivo");
                } 
            }

            if (numero >= 0){
                vetor[i] = numero; /*a posição 0 do vetor será o número, caso ele seja positivo (entre no if)*/
                if(vetor[i] % 3 == 0){/*se o resto da divisão por três for 0, é um múltiplo de três e será adicionado na média */
                    soma = soma + vetor[i];

                    contadorMedia = contadorMedia + 1;
                }
            }

        }

        media = ((float) soma)/contadorMedia; /*convertendo */
        System.out.println("O valor da média é: " + media );



       


    }
    
}
