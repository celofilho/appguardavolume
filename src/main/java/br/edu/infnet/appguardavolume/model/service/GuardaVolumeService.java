package br.edu.infnet.appguardavolume.model.service;

import br.edu.infnet.appguardavolume.model.domain.GuardaVolume;
import br.edu.infnet.appguardavolume.model.repository.GuardaVolumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GuardaVolumeService {
	
	@Autowired
	private GuardaVolumeRepository guardaVolumeRepository;

	public void incluir(GuardaVolume guardaVolume) {
		guardaVolumeRepository.save(guardaVolume);
	}
	
	public void excluir(Integer id) {
		guardaVolumeRepository.deleteById(id);
	}
	
	public Collection<GuardaVolume> obterLista(){
		return (Collection<GuardaVolume>) guardaVolumeRepository.findAll();
	}		
}