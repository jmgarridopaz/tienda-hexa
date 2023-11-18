package es.uhu.etsi.tallerhexagonal.tiendahexa.persistencia;

import java.util.List;
import es.uhu.etsi.tallerhexagonal.tiendahexa.negocio.Cliente;
import es.uhu.etsi.tallerhexagonal.tiendahexa.negocio.ClienteStore;


public class ConversorStoreSpringJpa implements ClienteStore {

	private final ClienteRepository clienteRepository;

	public ConversorStoreSpringJpa(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@Override
	public void guardar(Cliente cliente) {
		ClienteJpa clienteJpa = ClienteMapper.toJpa(cliente);
		this.clienteRepository.save(clienteJpa);
		return;
	}

	@Override
	public List<Cliente> recuperarTodos() {
		List<ClienteJpa> clientesJpa = this.clienteRepository.findAll();
		return ClienteMapper.fromJpaList(clientesJpa);
	}

}
