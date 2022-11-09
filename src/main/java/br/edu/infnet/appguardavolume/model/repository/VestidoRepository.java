package br.edu.infnet.appguardavolume.model.repository;

import br.edu.infnet.appguardavolume.model.domain.Vestido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VestidoRepository extends CrudRepository<Vestido, Integer> {

}