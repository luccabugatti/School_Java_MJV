package mjv.easyjob.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mjv.easyjob.model.Cadastro;
import mjv.easyjob.repository.CadastroRepository;
import mjv.easyjob.service.CadastroService;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {

	@Autowired
	private CadastroService service;
	
	@Autowired
	private CadastroRepository repository;
	
	@GetMapping
	public List<Cadastro> listarCadastros(){
		return repository.findAll();
	}
	
	@PostMapping
	public void salvar(@RequestBody Cadastro cadastro) {
		service.salvarCadastro(cadastro);
	}
	
	@PutMapping
	public void alterar(@RequestBody Cadastro cadastro) {
		service.salvarCadastro(cadastro);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	
}
