package br.edu.infnet.appguardavolume;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appguardavolume.model.domain.Bebida;
import br.edu.infnet.appguardavolume.model.domain.Comida;
import br.edu.infnet.appguardavolume.model.domain.Vestido;

@Order(3)
@Component
public class VolumeTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Volumes ##");

		Bebida b1 = new Bebida();
		b1.setCodigo(123);
		b1.setNome("Bebida 123");
		b1.setValor(10);
		b1.setQuantidade(10);
		b1.setMarca("Heineken");
		System.out.println("> " + b1);

		Comida c1 = new Comida();		
		c1.setCodigo(123); 
		c1.setNome("Comida 123");
		c1.setValor(10);
		c1.setPeso(100);
		c1.setPerecivel(true);
		System.out.println("> " + c1);

		Vestido s1 = new Vestido();
		s1.setCodigo(123); 
		s1.setNome("Vestido 123");
		s1.setValor(10);
		s1.setImportado(false);
		s1.setTamanho("GG");
		System.out.println("> " + s1);
	}
}