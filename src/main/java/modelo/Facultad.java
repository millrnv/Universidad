package modelo;
import java.util.*;


public class Facultad {

	private Collection<Administrativo> administrativos;
	private Universidad universidad;
	private Collection<Departamento> departamentos;
	private String nombreFacultad;
	private double latitud;
	private double longitud;

	public String getNombreFacultad() {
		return this.nombreFacultad;
	}

	/**
	 * 
	 * @param nombreFacultad
	 */
	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}

	public double getLatitud() {
		return this.latitud;
	}

	/**
	 * 
	 * @param latitud
	 */
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return this.longitud;
	}

	/**
	 * 
	 * @param longitud
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/**
	 * 
	 * @param nombreFacultad
	 * @param latitud
	 * @param longitud
	 */
	public Facultad(String nombreFacultad, double latitud, double longitud) {
		// TODO - implement Facultad.Facultad
		throw new UnsupportedOperationException();
	}

	public void operation() {
		// TODO - implement Facultad.operation
		throw new UnsupportedOperationException();
	}

}