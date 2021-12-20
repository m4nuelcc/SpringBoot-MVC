package es.manu.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Alumno {

	@NotNull
	@Size(min = 2, message = "Campo Requerido")
	private String nombre;

	@NotNull
	@Size(min = 2, message = "Campo Requerido")
	private String apellido;

	@NotBlank(message = "Campo Requerido")
	@Email(message = "Intdocuzca un Email Valido")
	private String email;

	@Min(value = 18, message = "La edad no puede ser menor de 18 años")
	@Max(value = 150, message = "La edad no puede ser mayor de 150 años")
	private int edad;

	@NotNull(message = "Marque una opcion")
	private String optativa;

	private String idiomasAlumno;

	private String ciudadEstudios;
	
	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOptativa() {
		return optativa;
	}

	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}

	public String getCiudadEstudios() {
		return ciudadEstudios;
	}

	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
	}

	public String getIdiomasAlumno() {
		return idiomasAlumno;
	}

	public void setIdiomasAlumno(String idiomasAlumno) {
		this.idiomasAlumno = idiomasAlumno;
	}

}
