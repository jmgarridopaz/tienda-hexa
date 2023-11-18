package es.uhu.etsi.tallerhexagonal.tiendahexa.configurador;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import es.uhu.etsi.tallerhexagonal.tiendahexa.negocio.ClienteService;
import es.uhu.etsi.tallerhexagonal.tiendahexa.negocio.ClienteServiceImpl;
import es.uhu.etsi.tallerhexagonal.tiendahexa.negocio.ClienteStore;
import es.uhu.etsi.tallerhexagonal.tiendahexa.persistencia.ClienteRepository;
import es.uhu.etsi.tallerhexagonal.tiendahexa.persistencia.ConversorStoreSpringJpa;


@Configuration
public class TiendaHexaConfiguracion {

	@Bean
	public ClienteStore clienteStore ( ClienteRepository clienteRepository) {
		return new ConversorStoreSpringJpa(clienteRepository);
	}
	
	@Bean
	public ClienteService clienteService ( ClienteStore clienteStore ) {
		return new ClienteServiceImpl(clienteStore);
	}
	
}
