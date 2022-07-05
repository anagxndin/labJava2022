/*Exercício Conta
Criar uma classe Conta que contenha o nome do cliente, o número da conta e o saldo. Estes valores deverão ser informados no construtor da classe;
Criar um método depositar e um método sacar para realizar o depósito e o saque de valores da conta;
Criar métodos getters para cada atributo da classe.
O programa deve instanciar objetos da classe Conta e utilizar seus métodos.*/

public class Conta {

    private String nomeCliente;
    private int numeroConta;
    private double saldo;
    
    public Conta(String nomeCliente, int numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void Depositar(){

    }

    public void Sacar(){

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    

    
    
}
