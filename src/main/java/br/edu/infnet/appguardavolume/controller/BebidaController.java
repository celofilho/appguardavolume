package br.edu.infnet.appguardavolume.controller;

import br.edu.infnet.appguardavolume.model.domain.Bebida;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BebidaController {
	
	@GetMapping(value = "/bebida/lista")
	public String telaLista(Model model) {

		Bebida b1 = new Bebida();
		b1.setCodigo(123);
		b1.setNome("Bebida 123");
		b1.setValor(10);
		b1.setMarca("Skol");
		System.out.println("> " + b1);

		Bebida b2 = new Bebida();
		b2.setCodigo(124);
		b2.setNome("Bebida 124");
		b2.setValor(15);
		b2.setMarca("Brahma");
		System.out.println("> " + b2);

		Bebida b3 = new Bebida();
		b3.setCodigo(125);
		b3.setNome("Bebida 125");
		b3.setValor(20);
		b3.setMarca("Heineiken");
		System.out.println("> " + b3);

		List<Bebida> bebidas = new ArrayList<Bebida>();
		bebidas.add(b1);
		bebidas.add(b2);
		bebidas.add(b3);

		model.addAttribute("listagem", bebidas);

		return "bebida/lista";
	}
}