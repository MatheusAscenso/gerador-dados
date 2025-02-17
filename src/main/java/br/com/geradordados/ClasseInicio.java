package br.com.geradordados;

import br.com.geradordados.model.UsuarioEntity;
import br.com.geradordados.service.GeradorDadosUsuario;
import br.com.geradordados.view.TelaDadoUsuario;
import br.com.geradordados.view.TelaInicial;

public class ClasseInicio {

	public static void main(String[] args) {
		TelaInicial telaincial = new TelaInicial();
		TelaDadoUsuario telaDadoUsuario = new TelaDadoUsuario();
		GeradorDadosUsuario gerarDadosUsuario = new GeradorDadosUsuario();
		UsuarioEntity usuarioEntity = gerarDadosUsuario.gerarDados();
		
		telaincial.inicio();
		telaDadoUsuario.apresentarUsuario(usuarioEntity);
		
	}
	
}
