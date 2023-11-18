package es.uhu.etsi.tallerhexagonal.tiendahexa.negocio;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ClienteServiceImpl implements ClienteService {

	private final ClienteStore clienteStore;
	
	public ClienteServiceImpl(ClienteStore clienteStore) {
		this.clienteStore = clienteStore;
	}
	
	@Override
	public void darAltaCliente ( String email, String nombre ) {
		lanzarExeptionSiEmailIncorrecto(email);
		Cliente cliente = new Cliente(email);
		cliente.setNombre(nombre);
		this.clienteStore.guardar(cliente);
		return;
	}

	@Override
	public List<Cliente> obtenerTodosClientes() {
		return this.clienteStore.recuperarTodos();
	}

	private void lanzarExeptionSiEmailIncorrecto ( String email ) {
		if ( email==null ) {
			throw new EmailIncorrectoException("El email no puede ser nulo");
		}
		if ( email.trim().length()==0 ) {
			throw new RuntimeException("El email no puede estar en blanco");
		}
		if ( ! formatoEmailEsCorrecto(email) ) {
			throw new RuntimeException("El formato del email no es correcto");
		}
		return;
	}
	
	private boolean formatoEmailEsCorrecto(String email) {
		String patronEmail =
	            "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
	            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	    Pattern pattern = Pattern.compile(patronEmail);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
	}
	
}
