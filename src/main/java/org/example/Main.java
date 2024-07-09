package org.example;

import conta.ContaCorrente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrenteCliente = new ContaCorrente("Pessoa Fisíca");
        contaCorrenteCliente.Sacar(56);
        System.out.println(contaCorrenteCliente.getSaldo());
        contaCorrenteCliente.Depositar(23165);
    }
}