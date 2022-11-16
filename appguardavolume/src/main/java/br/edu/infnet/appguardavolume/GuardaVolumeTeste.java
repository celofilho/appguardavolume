package br.edu.infnet.appguardavolume;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appguardavolume.model.domain.Bebida;
import br.edu.infnet.appguardavolume.model.domain.GuardaVolume;
import br.edu.infnet.appguardavolume.model.domain.Volume;
import br.edu.infnet.appguardavolume.model.domain.Condomino;
import br.edu.infnet.appguardavolume.model.domain.Usuario;
import br.edu.infnet.appguardavolume.model.service.GuardaVolumeService;

@Order(7)
@Component
public class GuardaVolumeTeste implements ApplicationRunner {
	
	@Autowired
	private GuardaVolumeService guardaVolumeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Guarda Volumes ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Bebida bebida = new Bebida();
		bebida.setId(1);

		Condomino c1 = new Condomino();
		c1.setId(1);

		List<Volume> GuardaVolume01 = new ArrayList<Volume>();
		GuardaVolume01.add(bebida);

		List<Volume> GuardaVolume02 = new ArrayList<Volume>();
		GuardaVolume02.add(bebida);

		GuardaVolume p1 = new GuardaVolume(c1);
		p1.setData(LocalDateTime.now());
		p1.setDescricao("Primeiro Guarda Volume");
		p1.setVolumes(GuardaVolume01);
		p1.setUsuario(usuario);
		guardaVolumeService.incluir(p1);

		GuardaVolume p2 = new GuardaVolume();
		p2.setData(LocalDateTime.now());
		p2.setDescricao("Segundo Guarda Volume");
		p2.setCondomino(c1);
		p2.setVolumes(GuardaVolume02);
		p2.setUsuario(usuario);
		guardaVolumeService.incluir(p2);

//		Condomino c2 = new Condomino();
//		c1.setId(2);
//z
//		GuardaVolume p3 = new GuardaVolume();
//		p3.setData(LocalDateTime.now());
//		p3.setDescricao("Terceiro Guarda Volume");
//		p3.setCondomino(c2);
//		p3.setVolumes(GuardaVolume02);
//		p3.setUsuario(usuario);
//		guardaVolumeService.incluir(p3);

	}
}