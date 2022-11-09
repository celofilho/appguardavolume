package br.edu.infnet.appguardavolume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appguardavolume.model.domain.Condomino;
import br.edu.infnet.appguardavolume.model.domain.Usuario;
import br.edu.infnet.appguardavolume.model.service.CondominoService;

@Order(3)
@Component
public class CondominoTeste implements ApplicationRunner {

	@Autowired
	private CondominoService solicitanteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Solicitantes ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Condomino s1 = new Condomino();
		s1.setCpf("12312312312");
		s1.setEmail("solicita@primeiro.com");
		s1.setNome("Primeiro solicitante");
		s1.setUsuario(usuario);
		solicitanteService.incluir(s1);
		
		Condomino s2 = new Condomino();
		s2.setCpf("23423423423");
		s2.setEmail("solicita@segundo.com");
		s2.setNome("Segundo solicitante");
		s2.setUsuario(usuario);
		solicitanteService.incluir(s2);
		
		Condomino s3 = new Condomino();
		s3.setCpf("34534534534");
		s3.setEmail("solicita@terceiro.com");
		s3.setNome("Terceiro solicitante");
		s3.setUsuario(usuario);
		solicitanteService.incluir(s3);
	}
}