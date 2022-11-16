package br.edu.infnet.appguardavolume.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appguardavolume.model.domain.Condomino;

@Repository
public interface CondominoRepository extends CrudRepository<Condomino, Integer> {

	@Query("from Condomino s where s.usuario.id = :userid")
	List<Condomino> obterLista(Integer userid);
}