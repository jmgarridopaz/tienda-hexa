package es.uhu.etsi.tallerhexagonal.tiendahexa.negocio;

import java.util.List;


public interface ClienteService {

	public void darAltaCliente ( String email, String nombre );

	public List<Cliente> obtenerTodosClientes();
	
}
