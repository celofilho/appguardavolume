package br.edu.infnet.appguardavolume;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appguardavolume.model.domain.GuardaVolume;

@Order(1)
@Component
public class GuardaVolumeTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Guarda Volume ##");

		GuardaVolume p1 = new GuardaVolume();
		p1.setData(LocalDateTime.now());
		p1.setDescricao("Primeiro Guarda Volume");
		System.out.println("> " + p1);
		
		GuardaVolume p2 = new GuardaVolume();
		p2.setData(LocalDateTime.now());
		p2.setDescricao("Segundo Guarda Volume");
		System.out.println("> " + p2);
		
		GuardaVolume p3 = new GuardaVolume();
		p3.setData(LocalDateTime.now());
		p3.setDescricao("Terceiro Guarda Volume");
		System.out.println("> " + p3);
	}
}