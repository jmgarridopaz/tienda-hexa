package es.uhu.etsi.tallerhexagonal.tiendahexa.negocio;

import java.util.Objects;


public class Cliente {

    private Long id;
    private final String email;
    private String nombre;
    
	public Cliente(String email) {
		this.email = email;
		this.id = null;
		this.nombre = "";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(email);
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
		Cliente other = (Cliente) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return String.format("Cliente [id=%s, email=%s, nombre=%s]", id, email, nombre);
	}
	
}
