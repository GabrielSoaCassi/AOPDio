package transactions.verify;

import conta.Conta;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TransactionVerify {

    @Around("execution(void Conta+.Sacar(..))")
    public void verificarSaldoSaque(ProceedingJoinPoint  joinPoint) throws Throwable {
        Conta conta = (Conta) joinPoint.getTarget();
        Object[] args = joinPoint.getArgs();
        double valor = Double.parseDouble(args[0].toString());
        if(conta.getSaldo() < valor){
            System.out.println("Saldo insuficiente na conta");
        }
        else{
            joinPoint.proceed();
        }
    }

    @Around("execution(void Conta+.Depositar(..))")
    public void verificarValorDeposito(ProceedingJoinPoint joinPoint) throws Throwable {
        Conta conta = (Conta) joinPoint.getTarget();
        Object[] args = joinPoint.getArgs();
        double valor = Double.parseDouble(args[0].toString());
        if(valor < 0){
            System.out.println("Valor insuficiente para deposito na conta");
        }
        else{
            joinPoint.proceed();
        }
    }

}
