package br.edu.infnet.appguardavolume.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appguardavolume.model.domain.Condomino;

@Controller
public class CondominoController {
	
	private static Map<Integer, Condomino> mapa = new HashMap<Integer, Condomino>();
	private static Integer id = 1;

	public static void incluir(Condomino condomino) {
		condomino.setId(id++);
		mapa.put(condomino.getId(), condomino);
		
		System.out.println("> " + condomino);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Condomino> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/condomino/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "condomino/lista";
	}
	
	@GetMapping(value = "/condomino/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/condomino/lista";
	}
}