package modelo;
import java.util.*;

public class Departamento {

	private Facultad facultad;
	private Collection<Administrativo> administrativos;
	private Collection<Profesor> profesores;
	private CarreraUniversitaria carrera;
	private String nombreDep;

	public String getNombreDep() {
		return this.nombreDep;
	}


	public void setNombreDep(String nombreDep) {
		this.nombreDep = nombreDep;
	}


	public Departamento(String nombreDep) {
		this.nombreDep = nombreDep;
		this.administrativos = new ArrayList<>();
		this.profesores = new ArrayList<>();


	}

}