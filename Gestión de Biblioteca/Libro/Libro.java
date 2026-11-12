package biblioteca;

import java.util.*;
import java.util.ArrayList;

/**
 * Representa un libro con sus datos principales y el registro de sus préstamos.
 */
public class Libro {
    private String titulo;
    private int edicion;
    private String editorial;
    private int anio;
    private ArrayList<Prestamo> prestamos;
    
    /**
     * Constructor para crear un libro con sus datos básicos e inicializar la lista de préstamos vacía.
     * 
     * @param p_titulo Título del libro.
     * @param p_edicion Edición del libro.
     * @param p_editorial Editorial del libro.
     * @param p_anio Año de publicación del libro.
     */
    public Libro(String p_titulo, int p_edicion, String p_editorial, int p_anio) {
        this.setTitulo(p_titulo);
        this.setEdicion(p_edicion);
        this.setEditorial(p_editorial);
        this.setAnio(p_anio);
        this.setPrestamos(new ArrayList<Prestamo>()); // Se inicializa la lista vacía por defecto
    }
    
    /**
     * Constructor para crear un libro con todos sus datos incluyendo una lista de préstamos existente.
     * 
     * @param p_titulo Título del libro.
     * @param p_edicion Edición del libro.
     * @param p_editorial Editorial del libro.
     * @param p_anio Año de publicación del libro.
     * @param p_prestamos Lista de préstamos del libro.
     */
    public Libro(String p_titulo, int p_edicion, String p_editorial, int p_anio, ArrayList<Prestamo> p_prestamos) {
        this.setTitulo(p_titulo);
        this.setEdicion(p_edicion);
        this.setEditorial(p_editorial);
        this.setAnio(p_anio);
        this.setPrestamos(p_prestamos); 
    }
    
    // --- SETTERS ---
    private void setTitulo(String p_titulo) {
        this.titulo = p_titulo;
    }
    
    private void setEdicion(int p_edicion) {
        this.edicion = p_edicion;
    }
    
    private void setEditorial(String p_editorial) {
        this.editorial = p_editorial;
    }
    
    private void setAnio(int p_anio) {
        this.anio = p_anio;
    }
    
    private void setPrestamos(ArrayList<Prestamo> p_prestamos) {
        this.prestamos = p_prestamos;
    }
    
    // --- GETTERS ---
    /**
     * Retorna el título del libro.
     * @return El título del libro.
     */
    public String getTitulo() {
        return this.titulo;
    }
    
    /**
     * Retorna la edición del libro.
     * @return El número de edición.
     */
    public int getEdicion() {
        return this.edicion;
    }
    
    /**
     * Retorna la editorial del libro.
     * @return El nombre de la editorial.
     */
    public String getEditorial() {
        return this.editorial;
    }
    
    /**
     * Retorna el año de publicación del libro.
     * @return El año del libro.
     */
    public int getAnio() {
        return this.anio;
    }
    
    private ArrayList<Prestamo> getPrestamos() {
        return this.prestamos;
    }
    
    // -- MÉTODOS --
    
    /**
     * Se agrega una prestamo a la lista.
     * @return agrego un prestamo a la lista de prestamos.
     */
    public boolean agregarPrestamo(Prestamo p_prestamos){
        return this.getPrestamos().add(p_prestamos);
    }
    
    /**
     * Se quita un prestamo de la lista.
     * @return quita un prestamo a la lista de prestamos.
     */
    public boolean quitarPrestamo(Prestamo p_prestamos){
        return this.getPrestamos().remove(p_prestamos);
    }
    
    /**
     * Comprueba si el libro se encuentra actualmente prestado.
     * @return true si el último préstamo aún no tiene fecha de devolución; false en caso contrario.
     */
    public boolean prestado() {
        if(this.getPrestamos().isEmpty()) {
            return false;
        }
        
        // Comprobamos si el último préstamo AÚN NO tiene fecha de devolución
        if (this.ultimoPrestamo().getFechaDevolucion() == null) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Retorna el último préstamo registrado del libro.
     * @return El objeto Prestamo correspondiente al ultimo elemento de la lista, o null si está vacía.
     */
    public Prestamo ultimoPrestamo() {
        if(this.getPrestamos().isEmpty()){
            return null;
        }
        
        int elUltimo = this.getPrestamos().size() - 1;
        
        return this.getPrestamos().get(elUltimo);
    }
    
    /**
     * Retorna una representación en cadena del libro.
     * @return Una cadena con el formato "Titulo: <<titulo>>".
     */
    public String toString() {
        return "Titulo: " + this.getTitulo();
    }
}
