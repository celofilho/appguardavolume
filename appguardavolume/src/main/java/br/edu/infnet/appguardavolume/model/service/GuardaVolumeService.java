package br.edu.infnet.appguardavolume.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appguardavolume.model.domain.GuardaVolume;
import br.edu.infnet.appguardavolume.model.domain.Usuario;
import br.edu.infnet.appguardavolume.model.repository.GuardaVolumeRepository;

@Service
public class GuardaVolumeService {
	
	@Autowired
	private GuardaVolumeRepository guardaVolumeRepository;

	public void incluir(GuardaVolume guardavolume) {
		guardaVolumeRepository.save(guardavolume);
	}
	
	public void excluir(Integer id) {
		guardaVolumeRepository.deleteById(id);
	}
	
	public Collection<GuardaVolume> obterLista(){
		return (Collection<GuardaVolume>) guardaVolumeRepository.findAll();
	}		

	public Collection<GuardaVolume> obterLista(Usuario usuario){
		return (Collection<GuardaVolume>) guardaVolumeRepository.obterLista(usuario.getId());
	}		
}