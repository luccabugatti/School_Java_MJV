package bankapp.model;
public class Conta {
	private double saldo;
    private int agencia;
    private double emprestimo;
    private String numeroConta;

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
}