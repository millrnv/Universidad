package modelo;

public class CarreraUniversitaria {

	private Departamento departamento;
	private String nombreCarrera;

	public String getNombreCarrera() {
		return this.nombreCarrera;
	}



	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public CarreraUniversitaria(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

}