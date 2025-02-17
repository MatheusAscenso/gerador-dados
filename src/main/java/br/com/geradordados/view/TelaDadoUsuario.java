package br.com.geradordados.view;

import br.com.geradordados.model.UsuarioEntity;

public class TelaDadoUsuario {

	public void apresentarUsuario(UsuarioEntity usuario) {
		System.out.println("******** Dados Usuario ********");
		System.out.println("Nome: "+ usuario.getNome());
		System.out.println("Email: "+ usuario.getEmail());
		System.out.println("Telefone: "+ usuario.getTelefone());
		System.out.println("Senha: "+ usuario.getSenha());
		System.out.println("************************");
	}
	
}
