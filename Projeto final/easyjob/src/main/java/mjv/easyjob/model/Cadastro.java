package mjv.easyjob.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro")
public class Cadastro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 1, columnDefinition = "char(1)")
	private Sexo sexo;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride( name = "logradouro", column = @Column(name = "logradouro")),
		@AttributeOverride( name = "numero", column = @Column(name = "numero")),
	})
	private Endereco endereco;
	
	@Column(length = 200, nullable = false)
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "profissao_id")
	private Profissao profissao;

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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cadastro(Integer id, String nome, Sexo sexo, Endereco endereco, String email, Profissao profissao) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.endereco = endereco;
		this.email = email;
		this.profissao = profissao;
	}
	
	public Cadastro() {
		
	}
}
