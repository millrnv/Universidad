package modelo;
import java.util.*;

public class Universidad {

	private Collection<Trabajador> trabajadores;
	private Collection<Facultad> facultades;
	private String nombreUniversidad;
	private String direccionFacultad;
	private TipoUniversidad tipoUniversidad;

	public String getNombreUniversidad() {
		return this.nombreUniversidad;
	}


	public void setNombreUniversidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
	}

	public TipoUniversidad getTipoUniversidad() {
		// TODO - implement Universidad.getTipoUniversidad
		throw new UnsupportedOperationException();
	}

	public String getDireccionFacultad() {
		return this.direccionFacultad;
	}


	public void setDireccionFacultad(String direccionFacultad) {
		this.direccionFacultad = direccionFacultad;
	}


	public List<Profesor> getProfesorFacultad(String nombreProfesor) {
		// TODO - implement Universidad.getProfesorFacultad
		throw new UnsupportedOperationException();
	}

	public List<CarreraUniversitaria> getCarrerasPorFacultad() {
		// TODO - implement Universidad.getCarrerasPorFacultad
		throw new UnsupportedOperationException();
	}

	public List<Profesor> getProfesoresTipoContrato() {
		// TODO - implement Universidad.getProfesoresTipoContrato
		throw new UnsupportedOperationException();
	}

	public List<Profesor> getAllProfesoresUniversidad() {
		// TODO - implement Universidad.getAllProfesoresUniversidad
		throw new UnsupportedOperationException();
	}

	public List<Administrativo> getAllAdministrativosUniversidad() {
		// TODO - implement Universidad.getAllAdministrativosUniversidad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombreUniversidad
	 * @param direccionFacultad
	 */
	public Universidad(String nombreUniversidad, String direccionFacultad, TipoUniversidad tipoUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
		this.direccionFacultad = direccionFacultad;
		this.tipoUniversidad = tipoUniversidad;

	}

}