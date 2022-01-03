package portifolio.model;

public enum Estado {
    SP ("SÃO PAULO"),
    RJ ("RIO DE JANEIRO");
	
	private String nome;
	private Estado(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}