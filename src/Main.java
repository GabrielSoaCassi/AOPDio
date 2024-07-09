import Conta.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrenteCliente = new ContaCorrente("Pessoa Fisíca");
        contaCorrenteCliente.Depositar(23165);
    }
}