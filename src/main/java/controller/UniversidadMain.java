package controller;
import modelo.*;

import java.sql.SQLOutput;

public class UniversidadMain {

    public static void inicializar(){

        Universidad universidad1 = new Universidad("Ufro","Calle Uruguay",TipoUniversidad.ESTATAL);

        Facultad facultad1 = new Facultad("Fica",3244,2542,universidad1);

        universidad1.agregarFacultad(facultad1);

        Departamento departamento1 = new Departamento("Departamento 1");

        facultad1.agregarDepartamento(departamento1);

        Profesor profesor1 = new Profesor("X","Ing","Casa","Soltero","3241245","08:00",TipoContrato.JORNADA_COMPLETA,departamento1);
        Administrativo administrativo1 = new Administrativo("XX","Administración","Casa","Soltero","1213","08:00",departamento1);
        CarreraUniversitaria carreraUniversitaria = new CarreraUniversitaria("Ingeniería Civil");





        departamento1.agregarProfesor(profesor1);
        departamento1.asociarProfesor(profesor1);


        departamento1.agregarAdministrativo(administrativo1);

        departamento1.agregarCarreraUniversitaria(carreraUniversitaria);


        System.out.println(universidad1.getProfesoresFacultad(facultad1));



    }

    public static void main(String[] args) {

        inicializar();


    }
}