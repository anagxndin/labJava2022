/*Faça um programa que simule o menu de uma agenda eletrônica. Agenda deve possuir opções tais como: (só precisa criar o menu)
Adicionar contato;
buscar contato;
remover contato;
editar contato;
sair*/

import java.util.Scanner;
public class exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("*** AGENDA ELETRÔNICA *** ");

        int i = 1;

        while (i > 0){System.out.println("--- Menu ---\n *Disque '1' para Adicionar Contato; \n *Disque '2' para Buscar Contato; \n *Disque '3' para remover Contato; \n *Disque '4' para editar Contato; \n *Disque '5' para sair.");
        int menu = entrada.nextInt();


        if (menu > 0 && menu < 6){
            switch(menu){
                case 1:
                System.out.println("--- ADICIONAR CONTATO ---");
                break;
                case 2:
                System.out.println("--- BUSCAR CONTATO ---");
                break;
                case 3:
                System.out.println("--- REMOVER CONTATO ---");
                break;
                case 4:
                System.out.println("--- EDITAR CONTATO ---");
                break;
                case 5:
                System.out.println("--- SAIR ---");
                break;    
            }
        } else {
            System.out.println("Ação inválida.");
        }

        i++;
        }
        
    }
    
}
