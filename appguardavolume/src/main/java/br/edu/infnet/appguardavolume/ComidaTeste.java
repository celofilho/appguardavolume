package br.edu.infnet.appguardavolume;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appguardavolume.controller.ComidaController;
import br.edu.infnet.appguardavolume.model.domain.Comida;

@Order(5)
@Component
public class ComidaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Comidas ##");

		Comida c1 = new Comida();
		c1.setCodigo(133);
		c1.setNome("Comida 133");
		c1.setValor(10);
		c1.setPeso(100);
		c1.setPerecivel(true);
		ComidaController.incluir(c1);

		Comida c2 = new Comida();
		c2.setCodigo(134);
		c2.setNome("Comida 134");
		c2.setValor(15);
		c2.setPeso(200);
		c2.setPerecivel(true);
		ComidaController.incluir(c2);

		Comida c3 = new Comida();
		c3.setCodigo(135);
		c3.setNome("Comida 135");
		c3.setValor(20);
		c3.setPeso(400);
		c3.setPerecivel(false);
		ComidaController.incluir(c3);
	}
}