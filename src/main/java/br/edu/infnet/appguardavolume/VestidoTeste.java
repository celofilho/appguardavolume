package br.edu.infnet.appguardavolume;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appguardavolume.controller.VestidoController;
import br.edu.infnet.appguardavolume.model.domain.Vestido;

@Order(6)
@Component
public class VestidoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Vestidos ##");
		
		Vestido v1 = new Vestido();
		v1.setCodigo(123);
		v1.setNome("Vestido 123");
		v1.setValor(10);
		v1.setImportado(true);
		v1.setTamanho("P");
		VestidoController.incluir(v1);
		
		Vestido v2 = new Vestido();
		v2.setCodigo(234);
		v2.setNome("Vestido 234");
		v2.setValor(15);
		v2.setImportado(true);
		v2.setTamanho("PP");
		VestidoController.incluir(v2);
		
		Vestido v3 = new Vestido();
		v3.setCodigo(345);
		v3.setNome("Vestido 345");
		v3.setValor(20);
		v3.setImportado(true);
		v3.setTamanho("GG");
		VestidoController.incluir(v3);
	}
}