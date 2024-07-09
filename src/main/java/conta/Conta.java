package conta;

import java.util.Date;

public class Conta {
    protected String tipoConta;
    protected String tipoCliente;
    protected Date dataAbertura;
    protected double saldo;

    public Conta(String tipoConta,String tipoCliente) {
        this.tipoConta = tipoConta;
        this.tipoCliente = tipoCliente;
        this.saldo = 0;
        this.dataAbertura = new Date();
    }

    public void Sacar(double valor){
        this.saldo -= valor;
    }

    public void Depositar(double valor){
        this.saldo += valor;
    }

    public Double getSaldo(){
        return this.saldo;
    }
}
