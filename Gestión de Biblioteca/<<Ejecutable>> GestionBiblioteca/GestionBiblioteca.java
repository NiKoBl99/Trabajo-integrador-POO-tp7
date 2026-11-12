package biblioteca;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;

public class GestionBiblioteca{
    public static void main(String[] args) {
        Biblioteca biblioteca = elementosConstantes();
        Libro libroNuevo = new Libro("Programando con Java", 1, "Oracle", 2003);
        biblioteca.agregarLibro(libroNuevo);

        System.out.println("ESTADÍSTICAS GENERALES");
        System.out.println("Cantidad actual de socios (Estudiantes): " + biblioteca.cantidadDeSociosPorTipo("Estudiante"));
        System.out.println("--------------------------------------------------");
        
        System.out.println("REPORTE DE DOCENTES RESPONSABLES");
        System.out.println(biblioteca.listaDeDocentesResponsables());
        System.out.println("--------------------------------------------------");
        
        System.out.println("CATÁLOGO DE LIBROS");
        System.out.println(biblioteca.listaDeLibros());
        System.out.println("--------------------------------------------------"); 
        
        System.out.println("NÓMINA DE SOCIOS");
        System.out.println(biblioteca.listaDeSocios());
        System.out.println("--------------------------------------------------");
  
        System.out.println("ESTADO DEL LIBRO NUEVO ('" + libroNuevo.getTitulo() + "')");
        try{
            String poseedor = biblioteca.quienTieneElLibro(libroNuevo);
            System.out.println("El libro está actualmente en poder de: " +poseedor);
        }
        catch(LibroNoPrestadoException e){
            System.out.println(e);
        }
        
    }

    private static Biblioteca elementosConstantes(){
        Libro libro1 = new Libro("Harry Potter",1,"J.K. Rowling",1997);
        Libro libro2 = new Libro("Luna de Plutón",2,"DrossRotzank",2015);
        Libro libro3 = new Libro("Virtual Hero",3,"ELRubiusOMG",2015);
        Libro libro4 = new Libro("#ChupaElPerro",4,"German Garmendia",2016);
        Libro libro5 = new Libro("El lado oculto de PEPE",5,"Anonimo",1981);

        Docente socio1 = new Docente(12345,"Pepe Diaz",5,"POO");
        Estudiante socio2 = new Estudiante(13579,"Actis Lautaro",10,"POO");
        Estudiante socio3 = new Estudiante(24680,"Aiello Mariano",10,"POO");
        Estudiante socio4 = new Estudiante(97531,"Pepito Diaz",10,"POO");
        Docente socio5 = new Docente(54321,"Jesica Fernandez",5,"POO");
        
        ArrayList<Libro> libros = new ArrayList<Libro>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        libros.add(libro5);

        ArrayList<Socio> socios = new ArrayList<Socio>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);
        socios.add(socio5);

        Biblioteca biblioteca = new Biblioteca("UNNE",socios,libros);
        
        biblioteca.prestarLibro(Calendar.getInstance(), socio1, libro1);
        biblioteca.prestarLibro(Calendar.getInstance(), socio3, libro5);
        
        return biblioteca;
    }
}

