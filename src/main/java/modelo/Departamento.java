package modelo;
import java.security.cert.CertPath;
import java.util.*;

public class Departamento {

	private Facultad facultad;
	private Collection<Administrativo> administrativos;
	private Collection<Profesor> profesores;
	private Collection<CarreraUniversitaria> carreras;
	private String nombreDep;



	public Departamento(String nombreDep) {
		this.nombreDep = nombreDep;
		this.administrativos = new ArrayList<>();
		this.profesores = new ArrayList<>();


	}

	public Departamento(){

	}


	public void setFacultad(Facultad facultad){
		this.facultad = facultad;

	}

	public Facultad getFacultad(){
		return facultad;
	}

	public void setCarreras(Collection<CarreraUniversitaria> carreras){
		this.carreras = carreras;
	}

	public Collection<CarreraUniversitaria> getCarreras(){
		return carreras;

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



	public Administrativo agregarAdministrativo(Administrativo administrativo){
		this.administrativos.add(administrativo);
			return administrativo;
	}





	public Profesor agregarProfesor(Profesor profesor){
		this.profesores.add(profesor);
			return profesor;
	}





	public CarreraUniversitaria agregarCarreraUniversitaria(CarreraUniversitaria carreraUniversitaria) {
		this.carreras.add(carreraUniversitaria);
			return carreraUniversitaria;

	}


}