package br.edu.infnet.appguardavolume.model.service;

import br.edu.infnet.appguardavolume.model.domain.Comida;
import br.edu.infnet.appguardavolume.model.repository.ComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ComidaService {
	
	@Autowired
	private ComidaRepository comidaRepository;

	public void incluir(Comida comida) {
		comidaRepository.save(comida);
	}
	
	public void excluir(Integer id) {
		comidaRepository.deleteById(id);
	}
	
	public Collection<Comida> obterLista(){
		return (Collection<Comida>) comidaRepository.findAll();
	}		
}