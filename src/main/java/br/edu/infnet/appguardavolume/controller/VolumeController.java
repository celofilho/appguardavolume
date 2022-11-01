package br.edu.infnet.appguardavolume.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appguardavolume.model.domain.Volume;

@Controller
public class VolumeController {
	
	private static Map<Integer, Volume> mapa = new HashMap<Integer, Volume>();
	private static Integer id = 1;

	public static void incluir(Volume produto) {
		produto.setId(id++);
		mapa.put(produto.getId(), produto);
		
		System.out.println("> " + produto);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Volume> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/volume/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "volume/lista";
	}
	
	@GetMapping(value = "/volume/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/volume/lista";
	}
}