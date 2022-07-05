import java.util.Scanner;
import java.util.Random;

public class Principal2 {

    public static void main(String[] args) {

        Scanner entradaScanner = new Scanner(System.in);
        
        System.out.println("--------> Crie um personagem <--------");

        //PERSONAGEM 1
        System.out.print("Escolha um nome para seu personagem: ");
        String nomePersonagem = entradaScanner.next();
        System.out.println("Escolha a classe de seu personagem: \n *Digite 1 para escolher Guerreiro; \n *Digite 2 para escolher Arqueiro; \n *Digite 3 para escolher Mago; ");
        int numeroclasse = entradaScanner.nextInt();
       

        switch(numeroclasse){
            case 1:
            Guerreiro g = new Guerreiro(null, 80, 50,30, -3, 0,
                80, 100, 90, 10, 63);
            g.setNome(nomePersonagem);
            System.out.println("Guerreiro " + g.getNome() + " criado.");
            break;
            case 2:
            Arqueiro a = new Arqueiro(null,0, 90, 0, 60, 0,
            30, 75, 0, 5, 60);
            a.setNome(nomePersonagem);
            System.out.println("Arqueiro " + a.getNome() + " criado.");
            break;
            case 3:
            Mago m = new Mago(null, 0, 90, 0, 95, 0,
                50, 40, 45, 85, 100);
            m.setNome(nomePersonagem);
            System.out.println("Mago " + m.getNome() + " criado.");
            break;
        }
        

        //PERSONAGEM 2
        System.out.print("Escolha um nome para seu personagem: ");
        String nomePersonagem2 = entradaScanner.next();
        System.out.println("Escolha a classe de seu personagem: \n *Digite 1 para escolher Guerreiro; \n *Digite 2 para escolher Arqueiro; \n *Digite 3 para escolher Mago; ");
        int numeroclasse2 = entradaScanner.nextInt();
       

        switch(numeroclasse2){
            case 1:
            Guerreiro g2 = new Guerreiro(null, 80, 50,30, -3, 0,
                80, 100, 90, 10, 63);
            g2.setNome(nomePersonagem2);
            System.out.println("Guerreiro " + g2.getNome() + " criado.");
            break;
            case 2:
            Arqueiro a2 = new Arqueiro(null,0, 90, 0, 60, 0,
            30, 75, 0, 5, 60);
            a2.setNome(nomePersonagem2);
            System.out.println("Arqueiro " + a2.getNome() + " criado.");
            break;
            case 3:
            Mago m2 = new Mago(null, 0, 90, 0, 95, 0,
                50, 40, 45, 85, 100);
            m2.setNome(nomePersonagem2);
            System.out.println("Mago " + m2.getNome() + " criado.");
            break;
        }

        //BATALHA

        Random dado = new Random();

        int round = 1;
        while(g.getVida() > 0 && m.getVida() > 0){
            System.out.println("Round: " + round);
            System.out.println("Oponente 1: " + g.getNome());
            System.out.println("Oponente 2: " + m.getNome());

            //turno do mago (m)
            int valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: " + valorDado);
            int valorAtaque = m.atacar(valorDado);
            g.defender(valorAtaque);

            //turno do guerreiro (g)
            valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: " + valorDado);
            valorAtaque = g.atacar(valorDado);
            m.defender(valorAtaque);
            //round = round +1
            round++;
        }
        if(m.getVida() <= 0){
            System.out.println("Gerreiro " + g.getNome() + " foi campeão!!!" );
        }else if(g.getVida() <= 0){
            System.out.println("br.edu.iftm.rpgjava.classes.Mago " + m.getNome() + " foi campeão!!!");
        }

        
        entradaScanner.close();
    }
    
    
}
