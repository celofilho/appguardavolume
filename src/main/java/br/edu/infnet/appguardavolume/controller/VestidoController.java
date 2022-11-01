package br.edu.infnet.appguardavolume.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appguardavolume.model.domain.Vestido;

@Controller
public class VestidoController {
	
	private static Map<Integer, Vestido> mapa = new HashMap<Integer, Vestido>();
	private static Integer id = 1;

	public static void incluir(Vestido sobremesa) {
		sobremesa.setId(id++);
		mapa.put(sobremesa.getId(), sobremesa);
		
		System.out.println("> " + sobremesa);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Vestido> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/vestido/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "vestido/lista";
	}
	
	@GetMapping(value = "/vestido/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/vestido/lista";
	}
}