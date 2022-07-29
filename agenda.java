import java.util.Scanner;

/**
 * agenda
 */
public class agenda {

    public static void main(String[] args) {
        int opcao = 0;
        //system.in aguarda usuario digitar
        Scanner entrada = new Scanner(System.in);
        Contato[] vetor = new Contato[10];
        int contador = 0;

        do {
            System.out.println("--- Menu ---");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Buscar Contato por numero");
            System.out.println("3 - Remover Contato por numero");
            System.out.println("4 - Editar Contato");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                System.out.println("Digite um número: ");
                numero = entrada.nextInt();
                System.out.println("Digite um nome: ");
                nome = entrada.nextInt();
                System.out.println("Digite um email: ");
                email = entrada.nextInt();
                System.out.println("Digite um telefone: ");
                telefone = entrada.nextInt();

                Contato c = new Contato(numero, nome, email, telefone);
                vetor[contador] = c;
                contador++;
                break;
                case 2:
                break;
                case 3:
                break;
                case 4:
                break;
                case 0:
                System.out.println("Adeus!");
                break;
            }
        } while (opcao != 0);

        

        /*int valor = 3;
        Contato c = new Contato();
        //c.codigo = 1;
        c.setCodigo(1);
        //set para dar o valor, get para pegar o valor
        System.out.println(c.getCodigo());*/

    }
}