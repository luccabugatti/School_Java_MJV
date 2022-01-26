package mjv.easyjob.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_profissao")
public class Profissao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(nullable = false, name = "slar_medio", precision = 8, scale = 2)
	private Double salarioMedio;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalarioMedio() {
		return salarioMedio;
	}
	public void setSalarioMedio(Double salarioMedio) {
		this.salarioMedio = salarioMedio;
	}
	
	
}
