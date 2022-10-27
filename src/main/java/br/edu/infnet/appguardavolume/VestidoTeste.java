package br.edu.infnet.appguardavolume;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appguardavolume.model.domain.Vestido;

@Order(6)
@Component
public class VestidoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Vestidos ##");
		
		Vestido s1 = new Vestido();
		s1.setCodigo(123); 
		s1.setNome("Vestido 123");
		s1.setValor(10);
		s1.setImportado(true);
		s1.setTamanho("P");
		System.out.println("> " + s1);
		
		Vestido s2 = new Vestido();
		s2.setCodigo(234); 
		s2.setNome("Vestido 234");
		s2.setValor(15);
		s2.setImportado(true);
		s2.setTamanho("PP");
		System.out.println("> " + s2);
		
		Vestido s3 = new Vestido();
		s3.setCodigo(345); 
		s3.setNome("Vestido 345");
		s3.setValor(20);
		s3.setImportado(true);
		s3.setTamanho("GG");
		System.out.println("> " + s3);
	}
}