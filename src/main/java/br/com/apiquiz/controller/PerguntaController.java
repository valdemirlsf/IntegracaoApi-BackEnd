package br.com.apiquiz.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiquiz.model.Pergunta;
import br.com.apiquiz.repository.PerguntaRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/pergunta")
public class PerguntaController {

	@Autowired
	PerguntaRepository repository;
	
	@GetMapping("/{id}")
	public  <Pergunta>Optional geta(@PathVariable int id) {
		return repository.findById(id);
		
	}
	
	@GetMapping("/")
	public List<Pergunta> getAll() {
		return repository.findAll();
	}
	
	@PostMapping(" ")
	public Pergunta create(@RequestBody Pergunta entrada) {
		repository.save(entrada);
		return entrada;
	}
	
	@PutMapping("/{id}")
	public Pergunta edit(@RequestBody Pergunta entrada, @PathVariable int id){
		entrada.setId(id);
		return repository.save(entrada);
	}
	
	@DeleteMapping("/{id}")
	public void pessoaDelete(@PathVariable int id) {
		repository.deleteById(id);
	}
}
