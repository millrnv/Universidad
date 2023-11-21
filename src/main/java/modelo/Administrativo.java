package modelo;

import java.util.Date;

public class Administrativo extends Trabajador {

	private Facultad facultad;
	private Departamento departamento;

	public String getTipo() {
		// TODO - implement Administrativo.getTipo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombreTrabajador
	 * @param tituloProfesional
	 * @param direccion
	 * @param estadoCivil
	 * @param rut
	 * @param horario
	 */
	public Administrativo(String nombreTrabajador, String tituloProfesional, String direccion, String estadoCivil, String rut, Date horario) {
		super(nombreTrabajador, tituloProfesional, direccion,estadoCivil,rut,horario);

	}

	public String toString() {
		// TODO - implement Administrativo.toString
		throw new UnsupportedOperationException();
	}

}