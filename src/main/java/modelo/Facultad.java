package modelo;
import java.util.*;


public class Facultad {

	private Universidad universidad;
	private Collection<Departamento> departamentos;
	private String nombreFacultad;
	private double latitud;
	private double longitud;


	public Facultad(String nombreFacultad, double latitud, double longitud, Universidad universidad) {
		this.nombreFacultad = nombreFacultad;
		this.latitud = latitud;
		this.longitud = longitud;
		this.universidad = universidad;
		this.departamentos = new ArrayList<>();


	}

	public Facultad(){


	}

	public void setUniversidad(Universidad universidad){
		this.universidad = universidad;

	}

	public Universidad getUniversidad(){
		return universidad;
	}

	public void setDepartamento(Collection<Departamento> departamentos){
		this.departamentos = departamentos;

	}

	public Collection<Departamento> getDepartamento(){
		return departamentos;

	}



	public Collection<Departamento> getDepartamentos(){
		return departamentos;

	}

	public String getNombreFacultad() {
		return this.nombreFacultad;
	}


	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}

	public double getLatitud() {
		return this.latitud;
	}


	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return this.longitud;
	}


	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}




	public Departamento agregarDepartamento(Departamento departamento){
		this.departamentos.add(departamento);
		return departamento;

	}


}