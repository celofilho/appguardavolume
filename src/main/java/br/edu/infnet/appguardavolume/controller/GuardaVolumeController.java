package br.edu.infnet.appguardavolume.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appguardavolume.model.domain.GuardaVolume;

@Controller
public class GuardaVolumeController {
	
	private static Map<Integer, GuardaVolume> mapa = new HashMap<Integer, GuardaVolume>();
	private static Integer id = 1;

	public static void incluir(GuardaVolume guardavolume) {
		guardavolume.setId(id++);
		mapa.put(guardavolume.getId(), guardavolume);
		
		System.out.println("> " + guardavolume);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<GuardaVolume> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/guardavolume/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "guardavolume/lista";
	}
	
	@GetMapping(value = "/guardavolume/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/guardavolume/lista";
	}
}