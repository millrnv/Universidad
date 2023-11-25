package modelo;
import java.util.*;

public class Universidad {

	private Collection<Trabajador> trabajadores;
	private Collection<Facultad> facultades;
	private String nombreUniversidad;
	private String direccionFacultad;
	private TipoUniversidad tipoUniversidad;


	public Universidad(String nombreUniversidad, String direccionFacultad, TipoUniversidad tipoUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
		this.direccionFacultad = direccionFacultad;
		this.tipoUniversidad = tipoUniversidad;

		this.facultades = new ArrayList<>();
		this.trabajadores = new ArrayList<>();

	}


	public Universidad(){

	}



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


	public Facultad agregarFacultad(Facultad facultad){
		this.facultades.add(facultad);
		return facultad;

	}

	//METODOS A REALIZAR

	//Cambiar a ProfesoresFacultad aquí y en el UML
	public Collection<Profesor> getProfesoresFacultad(Facultad facultad) {

		Collection<Profesor> profesoresFacultad = new ArrayList<>();

		for(Departamento d : facultad.getDepartamentos())
			profesoresFacultad.addAll(d.getProfesores());

			return profesoresFacultad;
	}


	public Collection<CarreraUniversitaria> getCarrerasPorFacultad(Facultad facultad) {

		Collection<CarreraUniversitaria> carrerasPorFacultad = new ArrayList<CarreraUniversitaria>();

		for(Departamento d : facultad.getDepartamentos())
			carrerasPorFacultad.addAll(d.getCarreras());

		return carrerasPorFacultad;

	}


	public Collection<Profesor> getProfesoresTipoContrato(Departamento departamento, TipoContrato tipoContrato) {

		Collection<Profesor> profesoresPorTipoContrato = new ArrayList<>();

		for(Profesor p : departamento.getProfesores()){
			if(p.getTipoContrato().equals(tipoContrato)){
				profesoresPorTipoContrato.add(p);
			}

		}

		return profesoresPorTipoContrato;


	}


	public Collection<Profesor> getAllProfesoresUniversidad(Universidad universidad) {
		Collection<Profesor> profesoresUniversidad = new ArrayList<>();
		for(Trabajador t : trabajadores)
			if(t instanceof  Profesor && t.getUniversidad().equals(universidad)){
				profesoresUniversidad.add((Profesor)t);
			}


		return profesoresUniversidad;


	}


	public Collection<Administrativo> getAllAdministrativosUniversidad(Universidad universidad) {
		Collection<Administrativo> administrativosUniversidad = new ArrayList<>();
		for(Trabajador t : trabajadores)
			if(t instanceof Administrativo && t.getUniversidad().equals(universidad)){
				administrativosUniversidad.add((Administrativo) t);
			}

		return administrativosUniversidad;

	}




}