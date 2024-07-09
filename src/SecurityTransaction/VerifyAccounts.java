package SecurityTransaction;

import Conta.Conta;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class VerifyAccounts {

    public void verificarContaCriada(JoinPoint joinPoint){

    }

    @Before("execution(void Conta.Sacar(..))")
    public void verificarSaldoSaque(JoinPoint joinPoint){
        Conta conta = (Conta) joinPoint.getTarget();
        Object[] args = joinPoint.getArgs();
        double valor = Double.parseDouble(args[0].toString());
        if(conta.getSaldo() < valor){
            System.out.println("Saldo insuficiente na conta");
        }
    }

    @Before("execution(void Conta.Depositar(..))")
    public void verificarValorDeposito(JoinPoint joinPoint){

    }

    @After("")
    public void verificarSaldoAposDepositado(JoinPoint joinPoint){

    }
}
