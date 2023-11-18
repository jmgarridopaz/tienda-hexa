package es.uhu.etsi.tallerhexagonal.tiendahexa.negocio;

import java.util.List;


public interface ClienteStore {

    public void guardar (Cliente cliente);

    public List<Cliente> recuperarTodos();

}
