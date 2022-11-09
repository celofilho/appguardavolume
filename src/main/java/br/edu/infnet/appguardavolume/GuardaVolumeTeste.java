package br.edu.infnet.appguardavolume;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appguardavolume.model.service.GuardaVolumeService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appguardavolume.controller.GuardaVolumeController;
import br.edu.infnet.appguardavolume.model.domain.Bebida;
import br.edu.infnet.appguardavolume.model.domain.Comida;
import br.edu.infnet.appguardavolume.model.domain.GuardaVolume;
import br.edu.infnet.appguardavolume.model.domain.Volume;
import br.edu.infnet.appguardavolume.model.domain.Vestido;
import br.edu.infnet.appguardavolume.model.domain.Condomino;

@Order(2)
@Component
public class GuardaVolumeTeste implements ApplicationRunner {

	private GuardaVolumeService guardaVolumeService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Guarda Volumes ##");

		Bebida bebida = new Bebida();
		bebida.setCodigo(123);
		bebida.setNome("Bebida 123");
		bebida.setValor(10);
		bebida.setMarca("Skol");

		Comida comida = new Comida();
		comida.setCodigo(133);
		comida.setNome("Comida 133");
		comida.setValor(10);
		comida.setPeso(100);
		comida.setPerecivel(true);

		Vestido vestido = new Vestido();
		vestido.setCodigo(123);
		vestido.setNome("Vestido 123");
		vestido.setValor(10);
		vestido.setImportado(true);
		vestido.setTamanho("P");

		Condomino c1 = new Condomino();
		c1.setCpf("44316312352");
		c1.setEmail("primeiro@Condomino.com");
		c1.setNome("Primeiro condomino");

		Condomino c2 = new Condomino();
		c2.setCpf("55316312348");
		c2.setEmail("primeiro@Condomino.com");
		c2.setNome("Segundo condomino");

		List<Volume> GuardaVolume01 = new ArrayList<Volume>();
		GuardaVolume01.add(bebida);
		GuardaVolume01.add(comida);

		List<Volume> GuardaVolume02 = new ArrayList<Volume>();
		GuardaVolume02.add(bebida);
		GuardaVolume02.add(comida);
		GuardaVolume02.add(vestido);

		GuardaVolume p1 = new GuardaVolume(c1);
		p1.setData(LocalDateTime.now());
		p1.setDescricao("Primeiro Guarda Volume");
		p1.setCondomino(c1);
		p1.setVolumes(GuardaVolume01);
		GuardaVolumeController.incluir(p1);

		GuardaVolume p2 = new GuardaVolume();
		p2.setData(LocalDateTime.now());
		p2.setDescricao("Segundo Guarda Volume");
		p2.setCondomino(c1);
		p2.setVolumes(GuardaVolume02);
		GuardaVolumeController.incluir(p2);

		GuardaVolume p3 = new GuardaVolume();
		p3.setData(LocalDateTime.now());
		p3.setDescricao("Terceiro Guarda Volume");
		p3.setCondomino(c2);
		p3.setVolumes(GuardaVolume02);
		GuardaVolumeController.incluir(p3);
	}
}