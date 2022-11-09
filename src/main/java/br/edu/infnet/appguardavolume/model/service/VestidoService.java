package br.edu.infnet.appguardavolume.model.service;

import br.edu.infnet.appguardavolume.model.domain.Vestido;
import br.edu.infnet.appguardavolume.model.repository.VestidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VestidoService {
	
	@Autowired
	private VestidoRepository vestidoRepository;

	public void incluir(Vestido vestido) {

		vestidoRepository.save(vestido);
	}
	
	public void excluir(Integer id) {
		vestidoRepository.deleteById(id);
	}
	
	public Collection<Vestido> obterLista(){
		return (Collection<Vestido>) vestidoRepository.findAll();
	}		
}