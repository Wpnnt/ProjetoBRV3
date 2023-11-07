package com.projeto.br.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.br.entities.Livro;
import com.projeto.br.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;
	
	public List<Livro> getAll() {
		return repository.findAll();
	}
	
	public void saveLivro(Livro livro) {
		repository.save(livro);
	}
}
