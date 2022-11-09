package br.edu.infnet.appguardavolume.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appguardavolume.model.domain.Condomino;
import br.edu.infnet.appguardavolume.model.domain.Usuario;
import br.edu.infnet.appguardavolume.model.service.ComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appguardavolume.model.domain.Comida;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class ComidaController {

	@Autowired
	private ComidaService comidaService;

	private static Map<Integer, Comida> mapa = new HashMap<Integer, Comida>();	
	private static Integer id = 1;

	@GetMapping(value = "/comida")
	public String telaCadastro() {
		return "comida/cadastro";
	}


	@PostMapping(value = "/comida/incluir")
	public String incluir(Comida comida) {

		comida.setId(id++);
		mapa.put(comida.getId(), comida);

		comidaService.incluir(comida);

		return "redirect:/comida/lista";
	}
		
	@GetMapping(value = "/comida/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", comidaService.obterLista());

		return "comida/lista";
	}
	
	@GetMapping(value = "/comida/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		comidaService.excluir(id);
		
		return "redirect:/comida/lista";
	}
}