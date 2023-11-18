package es.uhu.etsi.tallerhexagonal.tiendahexa.presentacion;

import java.util.Objects;


public class DarAltaClienteRequest {

	private String email;
	private String nombre;
	
	public DarAltaClienteRequest() {
	}
	
	public DarAltaClienteRequest(String email, String nombre) {
		this.email = email;
		this.nombre = nombre;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(email, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		DarAltaClienteRequest other = (DarAltaClienteRequest) obj;
		return Objects.equals(email, other.email) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return String.format("DarAltaClienteRequest [email=%s, nombre=%s]", email, nombre);
	}

}
