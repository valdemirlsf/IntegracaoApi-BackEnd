package br.com.apiquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apiquiz.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
