package br.edu.infnet.appguardavolume.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appguardavolume.model.domain.Vestido;
import br.edu.infnet.appguardavolume.model.service.VestidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VestidoController {

	@Autowired
	private VestidoService vestidoService;

	private static Map<Integer, Vestido> mapa = new HashMap<Integer, Vestido>();
	private static Integer id = 1;

	@GetMapping(value = "/vestido")
	public String telaCadastro() {
		return "vestido/cadastro";
	}

	@PostMapping(value = "/vestido/incluir")
	public String incluir(Vestido vestido) {

		vestido.setId(id++);
		mapa.put(vestido.getId(), vestido);

		vestidoService.incluir(vestido);

		return "redirect:/vestido/lista";
	}

		
	@GetMapping(value = "/vestido/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", vestidoService.obterLista());

		return "vestido/lista";
	}
	
	@GetMapping(value = "/vestido/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		vestidoService.excluir(id);
		
		return "redirect:/vestido/lista";
	}
}