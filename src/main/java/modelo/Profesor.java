package modelo;

import java.util.Date;

public class Profesor extends Trabajador {

	private Departamento departamento;

	public TipoContrato getTipoContrato() {
		// TODO - implement Profesor.getTipoContrato
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		// TODO - implement Profesor.getTipo
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
	 * @param tipoContrato
	 */
	public Profesor(String nombreTrabajador, String tituloProfesional, String direccion, String estadoCivil, String rut, Date horario, TipoContrato tipoContrato) {

		super(nombreTrabajador,tituloProfesional,direccion,estadoCivil,rut,horario);

	}

}