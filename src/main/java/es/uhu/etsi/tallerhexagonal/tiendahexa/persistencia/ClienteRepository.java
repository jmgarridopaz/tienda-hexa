package es.uhu.etsi.tallerhexagonal.tiendahexa.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ClienteRepository extends JpaRepository<ClienteJpa, Long> {

    public ClienteJpa save (ClienteJpa cliente);

    public List<ClienteJpa> findAll();

}
