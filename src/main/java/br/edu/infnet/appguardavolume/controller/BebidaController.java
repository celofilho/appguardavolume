package br.edu.infnet.appguardavolume.controller;

import br.edu.infnet.appguardavolume.model.domain.Bebida;
import br.edu.infnet.appguardavolume.model.domain.Comida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appguardavolume.model.service.BebidaService;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BebidaController {
	
	@Autowired
	private BebidaService bebidaService;

	private static Map<Integer, Bebida> mapa = new HashMap<Integer, Bebida>();
	private static Integer id = 1;

	@GetMapping(value = "/bebida")
	public String telaCadastro() {
		return "bebida/cadastro";
	}

	@PostMapping(value = "/bebida/incluir")
	public String incluir(Bebida bebida) {

		bebida.setId(id++);
		mapa.put(bebida.getId(), bebida);

		bebidaService.incluir(bebida);

		return "redirect:/bebida/lista";
	}

	@GetMapping(value = "/bebida/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", bebidaService.obterLista());

		return "bebida/lista";
	}
	
	@GetMapping(value = "/bebida/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		bebidaService.excluir(id);
		
		return "redirect:/bebida/lista";
	}
}