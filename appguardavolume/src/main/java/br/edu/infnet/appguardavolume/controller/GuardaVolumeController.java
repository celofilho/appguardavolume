package br.edu.infnet.appguardavolume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appguardavolume.model.domain.GuardaVolume;
import br.edu.infnet.appguardavolume.model.domain.Usuario;
import br.edu.infnet.appguardavolume.model.service.GuardaVolumeService;
import br.edu.infnet.appguardavolume.model.service.VolumeService;
import br.edu.infnet.appguardavolume.model.service.CondominoService;

@Controller
public class GuardaVolumeController {
	
	@Autowired
	private GuardaVolumeService guardaVolumeService;
	@Autowired
	private CondominoService condominoService;
	@Autowired
	private VolumeService volumeService;

	@GetMapping(value = "/guardavolume")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("condominos", condominoService.obterLista(usuario));

		model.addAttribute("volumes", volumeService.obterLista(usuario));
		
		return "guardavolume/cadastro";
	}
	
	@GetMapping(value = "/guardavolume/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", guardaVolumeService.obterLista(usuario));

		return "guardavolume/lista";
	}
	
	@PostMapping(value = "/guardavolume/incluir")
	public String incluir(GuardaVolume guardavolume, @SessionAttribute("user") Usuario usuario) {
		
		System.out.println("Condomino: " + guardavolume.getCondomino());
		System.out.println("Volumes: " + guardavolume.getVolumes());

		guardavolume.setUsuario(usuario);
		
		guardaVolumeService.incluir(guardavolume);
		
		return "redirect:/guardavolume/lista";
	}

	@GetMapping(value = "/guardavolume/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		guardaVolumeService.excluir(id);
		
		return "redirect:/guardavolume/lista";
	}
}