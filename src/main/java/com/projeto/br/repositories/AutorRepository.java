package com.projeto.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.br.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{

}
