package com.usuario.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.usuario.service.repositorio.UsuarioRepository;

@SpringBootTest
class UsuarioServiceApplicationTests {
	
	/*@Autowired
	private UsuarioRepository usuarioRepository;

	@Test
	@Rollback(false)
	void guardarUsuario() {
		Usuario usuario = new Usuario("Luis","lhirano@gmail.com");
		usuarioRepository.getById(1);
	}*/

}
