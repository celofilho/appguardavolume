package br.edu.infnet.appguardavolume.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appguardavolume.model.domain.Condomino;

@Repository
public interface CondominoRepository extends CrudRepository<Condomino, Integer> {

}