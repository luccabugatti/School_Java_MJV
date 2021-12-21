package bankapp;

import bankapp.model.Conta;
import bankapp.service.ContaService;

public class BankApplication {
	public static void main(String[] args) {
		//de 2 a 3 contas de integrantes
		//para realizar uma jornada nas contas
		
		Conta contaGleyson = new Conta();
		Conta contaJose = new Conta();
		Conta contaLucca = new Conta();
		Conta contaTaty = new Conta();
		Conta contaJoana = new Conta();
		
		ContaService terminal = new ContaService();
		terminal.depositar(contaGleyson, 50.0);
		terminal.depositar(contaJose, 20.0);
		terminal.depositar(contaLucca, 80.0);
		terminal.depositar(contaTaty, 30.0);
		terminal.depositar(contaJoana, 10.0);

		terminal.emprestimo(contaLucca, 50.0);
		terminal.emprestimo(contaJose, 100.0);

		terminal.transferir(contaLucca, contaJoana, 100.00);
		terminal.transferir(contaTaty, contaGleyson, 60);

		terminal.exibirExtrato(contaLucca);
		
		System.out.println(contaGleyson.getSaldo());
		System.out.println(contaJose.getSaldo());
		System.out.println(contaLucca.getSaldo());
		System.out.println(contaTaty.getSaldo());
		System.out.println(contaJoana.getSaldo());
	}
}
