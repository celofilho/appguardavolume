package br.edu.infnet.appguardavolume.model.repository;

import br.edu.infnet.appguardavolume.model.domain.Volume;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolumeRepository extends CrudRepository<Volume, Integer> {

    void deleteById(Volume id);
}
