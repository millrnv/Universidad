package controller;
import modelo.*;

public class UniversidadMain {

    public static void inicializar(){

        Universidad universidad1 = new Universidad("Ufro","Calle Uruguay",TipoUniversidad.ESTATAL);

        Facultad facultad1 = new Facultad("Fica",3244,2542,universidad1);

        universidad1.agregarFacultad(facultad1);

        Departamento departamento1 = new Departamento("Departamento 1");

        facultad1.agregarDepartamento(departamento1);

        Profesor profesor = new Profesor("X","Ing","Casa","Soltero","3241245","",departamento1);
        Administrativo administrativo = new Administrativo();
        CarreraUniversitaria carreraUniversitaria = new CarreraUniversitaria();

        departamento1.agregarProfesor(profesor);

        departamento1.agregarAdministrativo(administrativo);

        departamento1.agregarCarreraUniversitaria(carreraUniversitaria);








    }







    public static void main(String[] args) {

        inicializar();


    }
}