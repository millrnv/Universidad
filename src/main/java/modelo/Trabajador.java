package modelo;
import java.util.Date;

public abstract class Trabajador {

	private Universidad universidad;
	private String nombreTrabajador;
	private String tituloProfesional;
	private String direccion;
	private String estadoCivil;
	private String rut;
	private Date horario;

	public String getNombreTrabajador() {
		return this.nombreTrabajador;
	}


	public void setNombreTrabajador(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}


	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getDireccion() {
		return this.direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRut() {
		return this.rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}

	public Date getHorario() {
		return this.horario;
	}


	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public abstract String getTipo();


	public Trabajador(String nombreTrabajador, String tituloProfesional, String direccion, String estadoCivil, String rut, Date horario) {
		this.nombreTrabajador = nombreTrabajador;
		this.tituloProfesional = tituloProfesional;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.rut = rut;
		this.horario = horario;
	}

}