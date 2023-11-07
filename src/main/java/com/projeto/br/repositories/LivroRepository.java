package com.projeto.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.br.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
