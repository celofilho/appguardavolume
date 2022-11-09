package br.edu.infnet.appguardavolume.model.service;

import br.edu.infnet.appguardavolume.model.domain.Volume;
import br.edu.infnet.appguardavolume.model.repository.VolumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VolumeService {

	@Autowired
	private VolumeRepository volumeRepository;

	public void incluir(Volume volume) {

		volumeRepository.save(volume);
	}

	public void excluir(Integer id) {
		volumeRepository.deleteById(id);
	}

	public Collection<Volume> obterLista(){
		return (Collection<Volume>) volumeRepository.findAll();
	}
}