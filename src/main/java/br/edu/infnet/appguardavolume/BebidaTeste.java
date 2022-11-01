package br.edu.infnet.appguardavolume;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appguardavolume.controller.BebidaController;
import br.edu.infnet.appguardavolume.model.domain.Bebida;

@Order(4)
@Component
public class BebidaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Bebidas ##");
		
		Bebida b1 = new Bebida();
		b1.setCodigo(123);
		b1.setNome("Bebida 123");
		b1.setValor(10);
		b1.setMarca("Skol");
		BebidaController.incluir(b1);
		
		Bebida b2 = new Bebida();
		b2.setCodigo(124);
		b2.setNome("Bebida 124");
		b2.setValor(15);
		b2.setMarca("Brahma");
		BebidaController.incluir(b2);
		
		Bebida b3 = new Bebida();
		b3.setCodigo(125);
		b3.setNome("Bebida 125");
		b3.setValor(20);
		b3.setMarca("Heineiken");
		BebidaController.incluir(b3);
	}
}