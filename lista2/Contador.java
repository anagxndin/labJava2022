
/* Exercício Contador
Criar uma classe Contador que encapsule um valor usado para a contagem de itens ou eventos. A classe deve conter métodos que devem:
Zerar o contador;
Incrementar o contador em uma unidade;
Retornar o valor do contador;
O programa deve instanciar objetos da classe Contador e utilizar seus métodos.
*/

public class Contador {

    private int valor;

    public void Incrementar(){
        valor++;
    }

    public void Zerar(){
        valor = 0;
    }

    public int retornarValor(){
        return valor;
    }
    
}
