
import java.util.Scanner;
public class EstruturaDeRepetição {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int valor = 0;
        int soma = 0;

        //while é usado quando não se sabe a quantidade de repetições necessárias
        //for é usado quando se sabe a quantidade de repetições necessárias 
        //usa se o "do while" para que uma condição feita dentro do "do" entre em repetição - executar um bloco de código


        do {
            System.out.println("Digite 0 para sair ou qualquer número para somar: ");
            valor = entrada.nextInt();
            soma += valor;
            System.out.println("Soma: " + soma);
        } while (valor != 0);

        System.out.println("Digite o último número: ");
        int numeroFinal = entrada.nextInt();

            //iniciação //condição      //incremento
        for (int i = 1; i <= numeroFinal; i++){

            System.out.println(i); //i = 2
            
        }





        entrada.close();
    }
    
}
