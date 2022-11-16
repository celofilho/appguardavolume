package br.edu.infnet.appguardavolume.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appguardavolume.model.domain.GuardaVolume;

@Repository
public interface GuardaVolumeRepository extends CrudRepository<GuardaVolume, Integer> {

	@Query("from GuardaVolume p where p.usuario.id =:userid")
	List<GuardaVolume> obterLista(Integer userid);
}