package mjv.easyjob.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mjv.easyjob.model.Cadastro;
import mjv.easyjob.repository.CadastroRepository;
import mjv.easyjob.repository.ProfissaoRepository;

@Service
public class CadastroService {
	
	@Autowired
	private CadastroRepository repository;
	
	@Autowired
	private ProfissaoRepository profRepository;
	
	public void salvarCadastro(Cadastro cadastro) {
		boolean existeProf = profRepository.existsById(cadastro.getProfissao().getId());
		if(existeProf) {
			repository.save(cadastro);
		}
	}
}
