package es.uhu.etsi.tallerhexagonal.tiendahexa.persistencia;

import java.util.ArrayList;
import java.util.List;
import es.uhu.etsi.tallerhexagonal.tiendahexa.negocio.Cliente;


public final class ClienteMapper {

	public static ClienteJpa toJpa(Cliente cliente) {
		ClienteJpa clienteJpa = new ClienteJpa();
		clienteJpa.setId(cliente.getId());
		clienteJpa.setEmail(cliente.getEmail());
		clienteJpa.setNombre(cliente.getNombre());
		return clienteJpa;
	}

	public static List<Cliente> fromJpaList ( List<ClienteJpa> clientesJpa ) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		if ( clientesJpa==null || clientesJpa.isEmpty() ) {
			return clientes;
		}
		for ( ClienteJpa clienteJpa : clientesJpa ) {
			Cliente cliente = ClienteMapper.fromJpa(clienteJpa);
			clientes.add(cliente);
		}
		return clientes;
	}

	private static Cliente fromJpa(ClienteJpa clienteJpa) {
		Cliente cliente = new Cliente(clienteJpa.getEmail());
		cliente.setId(clienteJpa.getId());
		cliente.setNombre(clienteJpa.getNombre());
		return cliente;
	}

}
