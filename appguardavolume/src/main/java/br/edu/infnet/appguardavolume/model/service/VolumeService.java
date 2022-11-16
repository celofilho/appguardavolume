package br.edu.infnet.appguardavolume.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appguardavolume.model.domain.Volume;
import br.edu.infnet.appguardavolume.model.domain.Usuario;
import br.edu.infnet.appguardavolume.model.repository.VolumeRepository;

@Service
public class VolumeService {
	
	@Autowired
	private VolumeRepository volumeRepository;

	public void incluir(Volume produto) {
		volumeRepository.save(produto);
	}
	
	public void excluir(Integer id) {
		volumeRepository.deleteById(id);
	}
	
	public Collection<Volume> obterLista(){
		return (Collection<Volume>) volumeRepository.findAll();
	}		

	public Collection<Volume> obterLista(Usuario usuario){
		return (Collection<Volume>) volumeRepository.obterLista(usuario.getId());
	}		
}