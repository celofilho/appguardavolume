package br.edu.infnet.appguardavolume;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appguardavolume.model.domain.Condomino;

@Order(2)
@Component
public class CondominoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Condominos ##");

		Condomino s1 = new Condomino();
		s1.setCpf("33344412312");
		s1.setEmail("condomino123@mrv.com.br");
		s1.setNome("Primeiro condomino");
		System.out.println("> " + s1);
		
		Condomino s2 = new Condomino();
		s2.setCpf("43354412312");
		s2.setEmail("condomino423@mrv.com.br");
		s2.setNome("Segundo condomino");
		System.out.println("> " + s2);
		
		Condomino s3 = new Condomino();
		s3.setCpf("63355412555");
		s3.setEmail("condomino543@mrv.com.br");
		s3.setNome("Terceiro condomino");
		System.out.println("> " + s3);
	}
}