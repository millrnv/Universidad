package modelo;
import java.security.cert.CertPath;
import java.util.*;

public class Departamento {

	private Facultad facultad;
	private Collection<Administrativo> administrativos;
	private Collection<Profesor> profesores;
	private CarreraUniversitaria carrera;
	private String nombreDep;

	public void setFacultad(Facultad facultad){
		this.facultad = facultad;

	}

	public Facultad getFacultad(){
		return facultad;
	}

	public void setCarrera(CarreraUniversitaria carreraUniversitaria){
		this.carrera = carreraUniversitaria;

	}

	public CarreraUniversitaria getCarrera(){
		return carrera;
	}




	public void setAdministrativos(Collection<Administrativo> administrativos){
		this.administrativos = administrativos;
	}

	public Collection<Administrativo> getAdministrativos(){
		return administrativos;

	}

	public void setProfesores(Collection<Profesor> profesores){
		this.profesores = profesores;

	}

	public Collection<Profesor> getProfesores(){
		return profesores;

	}


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

	public void agregarAdministrativo(Administrativo administrativo){


	}


	public void agregarProfesor(Profesor profesor){


	}


	public void agregarCarreraUniversitaria(CarreraUniversitaria carreraUniversitaria){



	}


}