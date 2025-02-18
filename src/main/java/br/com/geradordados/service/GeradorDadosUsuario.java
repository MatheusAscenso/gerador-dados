package br.com.geradordados.service;

import com.github.javafaker.Faker;

import br.com.geradordados.model.UsuarioEntity;

public class GeradorDadosUsuario {
	
	private UsuarioEntity usuario;

	public UsuarioEntity gerarDados() {
		Faker faker = new Faker();
		
		usuario = new UsuarioEntity();
		usuario.setNome(faker.name().firstName());
		usuario.setEmail(faker.internet().emailAddress());
		usuario.setTelefone(faker.phoneNumber().cellPhone());
		usuario.setSenha(faker.internet().password());
		
		return usuario;
	}

}
