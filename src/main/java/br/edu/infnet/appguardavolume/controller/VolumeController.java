package br.edu.infnet.appguardavolume.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appguardavolume.model.domain.Vestido;
import br.edu.infnet.appguardavolume.model.service.VestidoService;
import br.edu.infnet.appguardavolume.model.service.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appguardavolume.model.domain.Volume;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VolumeController {

	@Autowired
	private VolumeService volumeService;

	private static Map<Integer, Volume> mapa = new HashMap<Integer, Volume>();
	private static Integer id = 1;

	@GetMapping(value = "/volume")
	public String telaCadastro() {
		return "volume/cadastro";
	}

	@PostMapping(value = "/volume/incluir")
	public String incluir(Volume volume) {

		volume.setId(id++);
		mapa.put(volume.getId(), volume);

		volumeService.incluir(volume);

		return "redirect:/volume/lista";
	}

		
	@GetMapping(value = "/volume/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", volumeService.obterLista());

		return "volume/lista";
	}
	
	@GetMapping(value = "/volume/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		volumeService.excluir(id);
		
		return "redirect:/volume/lista";
	}
}