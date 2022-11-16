package br.edu.infnet.appguardavolume.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appguardavolume.model.domain.Volume;

@Repository
public interface VolumeRepository extends CrudRepository<Volume, Integer> {

	@Query("from Volume p where p.usuario.id =:userid")
	List<Volume> obterLista(Integer userid);
}