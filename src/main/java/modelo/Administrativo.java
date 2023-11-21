package modelo;

import java.util.Date;

public class Administrativo extends Trabajador {

	private Departamento departamento;

	private Departamento getDepartamento(){
		return departamento;

	}

	private void setDepartamento(Departamento departamento){
		departamento = this.departamento;
	}


	public String getTipo() {
		return "Este trabajador es un administrativo";
	}


	public Administrativo(String nombreTrabajador, String tituloProfesional, String direccion, String estadoCivil, String rut, Date horario, Departamento departamento) {
		super(nombreTrabajador, tituloProfesional, direccion,estadoCivil,rut,horario);
		this.departamento = departamento;

	}

	public String toString() {

		return "Nombre: " + getNombreTrabajador() + ", Titulo Profesional: " + getTituloProfesional()+
				", Dirección: " +getDireccion()+ ", Estado Civil: " +getEstadoCivil()+
				", Rut: " +getRut()+ ", Horario: " +getHorario()+ ", Departamento: " +getDepartamento();

	}

}