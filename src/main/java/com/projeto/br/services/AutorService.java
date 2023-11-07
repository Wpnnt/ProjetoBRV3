package com.projeto.br.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.br.entities.Autor;
import com.projeto.br.repositories.AutorRepository;

@Service
public class AutorService {
	
	@Autowired
	private AutorRepository repository;
	
	public List<Autor> getAll() {
		return repository.findAll();
	}
	
	public void saveAutor(Autor autor) {
		repository.save(autor);
	}
}
