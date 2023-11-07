package com.projeto.br.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.projeto.br.entities.Usuario;
import com.projeto.br.exceptions.NotFoundException;
import com.projeto.br.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public List<Usuario> procuraTodos() {
		return repository.findAll();
	}

	public Usuario procuraPorId(Integer id) {
		return repository.findById(id)
				.orElseThrow(() -> new NotFoundException("ID inválido! Usuário não encontrado."));
	}

	public String adicionaUsuario(Usuario usuario) {
		usuario.setSenha(new BCryptPasswordEncoder().encode(usuario.getSenha()));
		repository.save(usuario);
		return "Usuário adicionado com sucesso!";
	}

	public String editarUsuario(Integer id, Usuario usuario) {
		Usuario response = repository.findById(id).get();

		response.setNome(usuario.getNome());
		response.setEmail(usuario.getEmail());
		response.setSenha(usuario.getSenha());

		repository.save(response);
		return "Usuário editado com sucesso!";
	}

	public void excluirUsuario(Integer id) {
		Usuario response = repository.findById(id).get();
		repository.delete(response);
	}
}
