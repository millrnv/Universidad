package modelo;

public class CarreraUniversitaria {

	private Departamento departamento;
	private String nombreCarrera;


	public CarreraUniversitaria(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public CarreraUniversitaria(){

	}



	public void setDepartamento(Departamento departamento){
		this.departamento = departamento;

	}

	public Departamento getDepartamento(){
		return departamento;

	}

	public String getNombreCarrera() {
		return this.nombreCarrera;
	}



	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}



}