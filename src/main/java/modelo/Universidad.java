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

	//METODOS A REALIZAR

	//Cambiar a ProfesoresFacultad aquí y en el UML
	public List<Profesor> getProfesorFacultad(String nombreProfesor) {
		return null;


	}

	public List<CarreraUniversitaria> getCarrerasPorFacultad() {
		// TODO - implement Universidad.getCarrerasPorFacultad
		throw new UnsupportedOperationException();
	}

	public List<Profesor> getProfesoresTipoContrato(String nombreDepartamento, TipoContrato tipoContrato) {
		List<Profesor> profesoresPorTipoContrato = new ArrayList<>();

		return null;

	}

	public List<Profesor> getAllProfesoresUniversidad() {
		List<Profesor> profesoresUniversidad = new ArrayList<>();


		return null;
	}

	public List<Administrativo> getAllAdministrativosUniversidad() {
		List<Administrativo> administrativosUniversidad = new ArrayList<>();

		return null;

	}

	//TERMINA

	public Universidad(String nombreUniversidad, String direccionFacultad, TipoUniversidad tipoUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
		this.direccionFacultad = direccionFacultad;
		this.tipoUniversidad = tipoUniversidad;

	}

}