package br.com.apiquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apiquiz.model.Pergunta;

public interface PerguntaRepository extends JpaRepository<Pergunta, Integer>{

}
