package modelo;

import java.util.Date;

public class Profesor extends Trabajador {

	private Departamento departamento;
	private TipoContrato tipoContrato;

	public TipoContrato getTipoContrato() {
		// TODO - implement Profesor.getTipoContrato
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		return "Este trabajador es un profesor";
	}

	public Profesor(String nombreTrabajador, String tituloProfesional, String direccion, String estadoCivil, String rut, Date horario, TipoContrato tipoContrato, Departamento departamento) {

		super(nombreTrabajador,tituloProfesional,direccion,estadoCivil,rut,horario);
		this.tipoContrato = tipoContrato;
		this.departamento = departamento;
	}

}