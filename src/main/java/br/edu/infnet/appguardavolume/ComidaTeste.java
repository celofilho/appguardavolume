package br.edu.infnet.appguardavolume;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

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
		System.out.println("> " + c1);

		Comida c2 = new Comida();
		c1.setCodigo(134);
		c1.setNome("Comida 134");
		c1.setValor(15);
		c1.setPeso(200);
		c1.setPerecivel(true);
		System.out.println("> " + c2);

		Comida c3 = new Comida();
		c1.setCodigo(135);
		c1.setNome("Comida 135");
		c1.setValor(20);
		c1.setPeso(400);
		c1.setPerecivel(false);
		System.out.println("> " + c3);
		

	}
}