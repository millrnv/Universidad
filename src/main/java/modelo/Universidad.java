package modelo;
import java.util.*;

public class Universidad {

	private Collection<Trabajador> trabajadores;
	private Collection<Facultad> facultades;
	private String nombreUniversidad;
	private String direccionFacultad;
	private TipoUniversidad tipoUniversidad;


	public Collection<Trabajador> getTrabajadores(){
		return this.trabajadores;
	}

	public void setTrabajadores(Collection<Trabajador> trabajadores){
		this.trabajadores = trabajadores;

	}

	public Collection<Facultad> getFacultades(){
		return this.facultades;
	}

	public void setFacultades(Collection<Facultad> facultades){
		this.facultades = facultades;
	}


	public String getNombreUniversidad() {
		return this.nombreUniversidad;
	}


	public void setNombreUniversidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
	}

	public TipoUniversidad getTipoUniversidad() {
		return tipoUniversidad;
	}

	public void setTipoUniversidad(TipoUniversidad tipoUniversidad){
		this.tipoUniversidad = tipoUniversidad;
	}

	public String getDireccionFacultad() {
		return this.direccionFacultad;
	}


	public void setDireccionFacultad(String direccionFacultad) {
		this.direccionFacultad = direccionFacultad;
	}






	public void agregarFacultad(Facultad facultad){


	}
















	//METODOS A REALIZAR

	//Cambiar a ProfesoresFacultad aquí y en el UML
	public Collection<Profesor> getProfesorFacultad(String nombreProfesor) {







		return null;


	}




	public Collection<CarreraUniversitaria> getCarrerasPorFacultad() {
		return null;
	}





	public Collection<Profesor> getProfesoresTipoContrato(String nombreDepartamento, TipoContrato tipoContrato) {
		Collection<Profesor> profesoresPorTipoContrato = new ArrayList<>();

		return null;

	}





	public Collection<Profesor> getAllProfesoresUniversidad() {
		Collection<Profesor> profesoresUniversidad = new ArrayList<>();


		return null;






	}







	public Collection<Administrativo> getAllAdministrativosUniversidad() {
		Collection<Administrativo> administrativosUniversidad = new ArrayList<>();

		return null;

	}

	//TERMINA










	public Universidad(String nombreUniversidad, String direccionFacultad, TipoUniversidad tipoUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
		this.direccionFacultad = direccionFacultad;
		this.tipoUniversidad = tipoUniversidad;

	}

}