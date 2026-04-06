package org.example;

public class Conta {

    private String numero;
    private String titular;
    private double saldo;

    public Conta(String numero, String titular, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = (saldo > 0) ? saldo : 0;
    }

    public double sacar(double valor){
        this.saldo = (valor > saldo) ? 0 : saldo - valor;
        return this.saldo;
    }

    public double depositar(double valor){
        this.saldo = (valor > saldo) ? 0 : saldo + valor;
        return this.saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString(){
        return String.format("Conta: %s%nTitular: %s%nSaldo; %.2f", titular, numero, saldo);
    }
}
