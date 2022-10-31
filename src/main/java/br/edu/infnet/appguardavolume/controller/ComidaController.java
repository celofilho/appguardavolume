package br.edu.infnet.appguardavolume.controller;

import br.edu.infnet.appguardavolume.model.domain.Bebida;
import br.edu.infnet.appguardavolume.model.domain.Comida;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ComidaController {
	
	@GetMapping(value = "/comida/lista")
	public String telaLista(Model model) {

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

		List<Comida> comidas = new ArrayList<Comida>();
		comidas.add(c1);
		comidas.add(c2);
		comidas.add(c3);

		model.addAttribute("listagem", comidas);

		return "comida/lista";
	}
}