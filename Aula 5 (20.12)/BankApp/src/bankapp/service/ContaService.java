package bankapp.service;

import bankapp.model.Conta;

public class ContaService {
	//+2 a 3 recursos que poderia realizar com uma conta
	public void depositar (Conta conta, double valorDepositado ) {
		conta.setSaldo(conta.getSaldo() + valorDepositado);
	}

    public void transferir(Conta contaPagamento,Conta contaDestino, double valor){
        if (contaPagamento.getSaldo() > valor){
            contaPagamento.setSaldo(contaPagamento.getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        }else{
            System.out.println("Saldo indisponivel");
        }
    }

    public void emprestimo(Conta conta, double valor){
        conta.setEmprestimo(valor);
        conta.setSaldo(conta.getSaldo()+ valor);
    }
}