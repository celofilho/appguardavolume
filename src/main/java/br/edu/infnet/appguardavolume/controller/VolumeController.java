package br.edu.infnet.appguardavolume.controller;

import br.edu.infnet.appguardavolume.model.domain.Bebida;
import br.edu.infnet.appguardavolume.model.domain.Comida;
import br.edu.infnet.appguardavolume.model.domain.Vestido;
import br.edu.infnet.appguardavolume.model.domain.Volume;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VolumeController {
	
	@GetMapping(value = "/volume/lista")
	public String telaLista(Model model) {

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

		Vestido v1 = new Vestido();
		v1.setCodigo(123);
		v1.setNome("Vestido 123");
		v1.setValor(10);
		v1.setImportado(false);
		v1.setTamanho("GG");
		System.out.println("> " + v1);

		List<Volume> volumes = new ArrayList<Volume>();
		volumes.add(b1);
		volumes.add(c1);
		volumes.add(v1);

		model.addAttribute("listagem", volumes);

		return "volume/lista";
	}

}