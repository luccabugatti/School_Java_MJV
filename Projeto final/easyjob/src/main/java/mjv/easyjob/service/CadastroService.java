package mjv.easyjob.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mjv.easyjob.repository.CadastroRepository;


@Component
public class CadastroService implements CommandLineRunner {
	
	@Autowired
	private CadastroRepository repository;
	
	@Override
	public void run(String...args) throws Exception {
		//Cadastro membro1 = new Cadastro();
		//membro1.setNome("JOAO MENEZES");
		//membro1.setCpf("334.576.928-07");
		//membro1.setDataNascimento(LocalDate.of(1991, 10, 21));
		//membro1.setTelefone("(21) 9141-9999");
		//membro1.setProfissao("TECH LEAD");
		//membro1.setEscolaridade(Escolaridade.SUPERIOR);
		//membro1.setEmail("taty@gmail.com");
		//membro1.setEndereco(new Endereco("RUA TREZE", "10", "LARANJEIRAS", "RIO DE JANEIRO"));
		
		//repository.save(membro1);
	}
	
	
}

