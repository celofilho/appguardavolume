package br.edu.infnet.appguardavolume;

import br.edu.infnet.appguardavolume.model.service.CondominoService;
import br.edu.infnet.appguardavolume.model.service.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appguardavolume.controller.VolumeController;
import br.edu.infnet.appguardavolume.model.domain.Bebida;
import br.edu.infnet.appguardavolume.model.domain.Comida;
import br.edu.infnet.appguardavolume.model.domain.Vestido;

@Order(3)
@Component
public class VolumeTeste implements ApplicationRunner {

	@Autowired
	private VolumeService volumeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Volumes ##");

		Bebida b1 = new Bebida();
		b1.setCodigo(123);
		b1.setNome("Bebida 123");
		b1.setValor(10);
		b1.setQuantidade(10);
		b1.setMarca("Heineken");
		volumeService.incluir(b1);

		Comida c1 = new Comida();
		c1.setCodigo(123);
		c1.setNome("Comida 123");
		c1.setValor(10);
		c1.setPeso(100);
		c1.setPerecivel(true);
		volumeService.incluir(c1);

		Vestido v1 = new Vestido();
		v1.setCodigo(123);
		v1.setNome("Vestido 123");
		v1.setValor(10);
		v1.setImportado(false);
		v1.setTamanho("GG");
		volumeService.incluir(v1);
	}
}