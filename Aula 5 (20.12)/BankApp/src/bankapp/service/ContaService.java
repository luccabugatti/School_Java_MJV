package bankapp.service;

import bankapp.model.Conta;
import bankapp.model.Historico;

public class ContaService {
	//+2 a 3 recursos que poderia realizar com uma conta
	public void depositar (Conta conta, double valorDepositado ) {
		conta.setSaldo(conta.getSaldo() + valorDepositado);
        conta.getHistoricos().add(new Historico("20/12", valorDepositado,"DEPOSITO"));
	}

    public void transferir(Conta contaPagamento,Conta contaDestino, double valor){
        if (contaPagamento.getSaldo() > valor){
            contaPagamento.setSaldo(contaPagamento.getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            contaPagamento.getHistoricos().add(new Historico("20/12", valor,"TRANSFERENCIA"));
            contaDestino.getHistoricos().add(new Historico("20/12", valor,"TRANSFERENCIA RECEBIDA"));
        }else{
            System.out.println("-- Saldo indisponivel \n");
        }
    }

    public void emprestimo(Conta conta, double valor){
        conta.setEmprestimo(valor);
        conta.setSaldo(conta.getSaldo()+ valor);
        conta.getHistoricos().add(new Historico("20/12", valor,"EMPRESTIMO"));
    }

    public void exibirExtrato(Conta conta) {
		System.out.println("-- Exibindo histórico da conta:");
		for(Historico hst: conta.getHistoricos()) {
			System.out.println(hst.getData() 
					+ "-" + hst.getTipoOperacao()
					+ "-" + hst.getValor() + "\n");
		}
	}
}