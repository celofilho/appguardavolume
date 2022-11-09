package br.edu.infnet.appguardavolume.model.repository;

import br.edu.infnet.appguardavolume.model.domain.GuardaVolume;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuardaVolumeRepository extends CrudRepository<GuardaVolume, Integer> {

}