/*Exercício Elevador
Criar uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
Construtor: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
Entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
Sair: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
Subir: para subir um andar (não deve subir se já estiver no último andar);
Descer: para descer um andar (não deve descer se já estiver no térreo).*/


public class Elevador {

    private int AndarAtual;
    private int quantidadeAndares;
    private int quantidadePessoas;
    private int limitePessoas;

    

    public Elevador(int andarAtual, int quantidadeAndares, int quantidadePessoas, int limitePessoas) {
        AndarAtual = andarAtual;
        this.quantidadeAndares = quantidadeAndares;
        this.quantidadePessoas = quantidadePessoas;
        this.limitePessoas = limitePessoas;
    }

    public void Entrar(){
        while (quantidadePessoas < limitePessoas){
            quantidadePessoas++;
        }

    }

    public void Sair(){
        while (quantidadePessoas > 0){
            quantidadePessoas--;
        }
        
    }

    public void Subir(){
        while (AndarAtual < quantidadeAndares){
            AndarAtual++;
        }
        
    }

    public void Descer(){
        while (AndarAtual > 0){
            AndarAtual--;
        }
        
    }

    
}
