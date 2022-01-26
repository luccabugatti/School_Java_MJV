package mjv.easyjob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import mjv.easyjob.model.Cadastro;
import mjv.easyjob.repository.CadastroRepository;

@Controller
public class CadastroController {
	
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
}
