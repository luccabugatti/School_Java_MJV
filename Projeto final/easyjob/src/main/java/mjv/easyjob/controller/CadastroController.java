package mjv.easyjob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mjv.easyjob.model.Cadastro;
import mjv.easyjob.repository.CadastroRepository;
import mjv.easyjob.service.CadastroService;

@Controller
@RequestMapping("/cadastros")
public class CadastroController {

	@Autowired
	private CadastroService service;
	
	@Autowired
	private CadastroRepository repository;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("cadastros", repository.findAll());		
		return mv;		
	}
	
	@PostMapping("/grava")
	public ModelAndView salvar(@Validated Cadastro cadastro) {
		repository.save(cadastro);
		return index();
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
