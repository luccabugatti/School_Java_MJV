package bankapp.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	private double saldo;
    private String nomeCorrentista;
    private int agencia;
    private double emprestimo;
    private String numeroConta;
    private List<Historico> historicos = new ArrayList();

	//+2 a 3 atributos relevantes para o negocio
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    public int getAgencia(){
        return agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public double getEmprestimo(){
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo){
        this.emprestimo = emprestimo;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

    public List<Historico> getHistoricos(){
        return historicos;
    }

    @Override
	public String toString() {
		return "Conta [nomeCorrentista=" + nomeCorrentista + ", numero=" + numeroConta + "]";
	}
}