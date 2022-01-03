package portifolio.model;

import java.time.LocalDate;

public class Registro {
	private String profissao;
	private String nomeCompleto;
	private Double minimoSalario;
	private Double maximoSalario;
	private LocalDate dataNascimento;
	private String cpf;
	private String rg;
	private String logradouro;
	private Integer numeroCasa;
	private String bairro;
	private String cidade;
	private Estado uf;
	private String cep;
	private String telefone;
	private String celular;
	private String naturalidade;
	private String pais;
	private String email;
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Double getMinimoSalario() {
		return minimoSalario;
	}
	public void setMinimoSalario(Double minimoSalario) {
		this.minimoSalario = minimoSalario;
	}
	public Double getMaximoSalario() {
		return maximoSalario;
	}
	public void setMaximoSalario(Double maximoSalario) {
		this.maximoSalario = maximoSalario;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Integer getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(Integer numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Estado getUf() {
		return uf;
	}
	public void setUf(Estado uf) {
		this.uf = uf;
	
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Registro [profissao=" + profissao + ", nomeCompleto=" + nomeCompleto + ", minimoSalario="
				+ minimoSalario + ", maximoSalario=" + maximoSalario + ", dataNascimento=" + dataNascimento + ", cpf="
				+ cpf + ", rg=" + rg + ", logradouro=" + logradouro + ", numeroCasa=" + numeroCasa + ", bairro="
				+ bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep +", telefone=" + telefone + ",celular=" + celular
				+ ", naturalidade=" + naturalidade + ", pais=" + pais + ", email=" + email + "]";
	}
	

}