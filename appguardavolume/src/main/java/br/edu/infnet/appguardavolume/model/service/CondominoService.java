package br.edu.infnet.appguardavolume.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appguardavolume.model.domain.Condomino;
import br.edu.infnet.appguardavolume.model.domain.Usuario;
import br.edu.infnet.appguardavolume.model.repository.CondominoRepository;

@Service
public class CondominoService {

	@Autowired
	private CondominoRepository condominoRepository;

	public void incluir(Condomino condomino) {
		condominoRepository.save(condomino);
	}

	public void excluir(Integer id) {
		condominoRepository.deleteById(id);
	}

	public Collection<Condomino> obterLista(){
		return (Collection<Condomino>) condominoRepository.findAll();
	}
	public Collection<Condomino> obterLista(Usuario usuario){
		return (Collection<Condomino>) condominoRepository.obterLista(usuario.getId());
	}
}