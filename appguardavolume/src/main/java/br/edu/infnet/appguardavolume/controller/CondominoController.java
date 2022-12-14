package br.edu.infnet.appguardavolume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appguardavolume.model.domain.Condomino;
import br.edu.infnet.appguardavolume.model.domain.Usuario;
import br.edu.infnet.appguardavolume.model.service.CondominoService;

@Controller
public class CondominoController {
	
	@Autowired
	private CondominoService condominoService;
	
	@GetMapping(value = "/condomino/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", condominoService.obterLista(usuario));

		return "condomino/lista";
	}
	
	@GetMapping(value = "/condomino")
	public String telaCadastro() {
		return "condomino/cadastro";
	}

	@PostMapping(value = "/condomino/incluir")
	public String incluir(Condomino condomino, @SessionAttribute("user") Usuario usuario) {

		condomino.setUsuario(usuario);
		
		condominoService.incluir(condomino);
		
		return "redirect:/condomino/lista";
	}
	
	@GetMapping(value = "/condomino/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		condominoService.excluir(id);
		
		return "redirect:/condomino/lista";
	}
}