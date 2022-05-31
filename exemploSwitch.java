import java.util.Scanner;

public class exemploSwitch {
        public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o final da placa: ");
        int finalPlaca = entrada.nextInt();

        switch (finalPlaca) {
            case 1:
            System.out.println("Vencimento dia 11 de Janeiro.");
            break;

            case 2:
            System.out.println("Vencimento dia 12 de Janeiro.");
            break;
            
            case 3:
            System.out.println("Vencimento dia 12 de Janeiro.");
            break;

            default:
            System.out.println("Vencimento sem data, desculpe");

            //OPERADOR TERNARIO
            //atalho: sysout
            System.out.print("Insira sua idade: ");
            int idade = 10;
            System.out.println("Digite um ano futuro: ");
            int ano = entrada.nextInt();
            
            int aux = ano - 2022;
            int idadeFutura = idade + aux;

            System.out.println("Idade: " + idade);
            System.out.println("Nova Idade: " + idadeFutura);
            System.out.println("Minha idade em " + ano + "será" + idadeFutura);

            //decrementando e incrementando
            //int novaIdade = idade1++;//idade = idade + 1
            //int novaIdade = --idade;
                                                //if true  //if false
            //String indicacao = (idade >= 18) ?  "adulto" : "criança/adolescente";
            //System.out.println("Resultado: " + indicacao);



            

        }

    }


}