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

	/**
	 * 
	 * @param nombreDep
	 */
	public void setNombreDep(String nombreDep) {
		this.nombreDep = nombreDep;
	}

	/**
	 * 
	 * @param nombreDep
	 */
	public Departamento(String nombreDep) {
		// TODO - implement Departamento.Departamento
		throw new UnsupportedOperationException();
	}

}