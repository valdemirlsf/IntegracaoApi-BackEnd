package br.com.apiquiz.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.apiquiz.model.Pessoa;
import br.com.apiquiz.repository.PessoaRepository;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	PessoaRepository repository;
	
	
	@GetMapping("/{id}")
	public  <Pessoa>Optional geta(@PathVariable int id) {
		return repository.findById(id);
		
	}
	
	@GetMapping("/")
	public List<Pessoa> getAll() {
		return repository.findAll();
	}
	
	@PostMapping(" ")
	public Pessoa create(@RequestBody Pessoa entrada) {
		repository.save(entrada);
		return entrada;
	}
	
	@PutMapping("/{id}")
	public Pessoa edit(@RequestBody Pessoa entrada, @PathVariable int id){
		entrada.setId(id);
		return repository.save(entrada);
	}
	
	@DeleteMapping("/{id}")
	public void pessoaDelete(@PathVariable int id) {
		repository.deleteById(id);
	}
	
}
