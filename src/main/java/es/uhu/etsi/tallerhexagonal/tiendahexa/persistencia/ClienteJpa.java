package es.uhu.etsi.tallerhexagonal.tiendahexa.persistencia;

import jakarta.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "cliente")
public class ClienteJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "email", nullable = false, unique = true, length = 320)
    private String email;

    @Column(name = "nombre", length = 50)
    private String nombre;
    
	public ClienteJpa() {
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
		ClienteJpa other = (ClienteJpa) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return String.format("Cliente [id=%s, email=%s, nombre=%s]", id, email, nombre);
	}
	
}
