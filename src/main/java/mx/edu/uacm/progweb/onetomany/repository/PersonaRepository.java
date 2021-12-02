package mx.edu.uacm.progweb.onetomany.repository;

import mx.edu.uacm.progweb.onetomany.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
}
