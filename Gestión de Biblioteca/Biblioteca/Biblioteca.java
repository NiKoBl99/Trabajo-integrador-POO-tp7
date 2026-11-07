import java.util.ArrayList;
import java.util.Calendar;

public class Biblioteca
{
    private String nombre;
    private ArrayList <Libro> libros;
    private ArrayList <Socio> socios;
  
    public Biblioteca(String p_nombre, ArrayList<Libro> p_libros, ArrayList<Socio> p_socios){
        this.setNombre(p_nombre);
        this.setLibros(p_libros);
        this.setSocios(p_socios);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setLibros(ArrayList<Libro> p_libros){
        this.libros = p_libros;
    }

    private void setSocios(ArrayList<Socio> p_socios){
        this.socios = p_socios;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public ArrayList<Libro> getLibros(){
        return this.libros;
    }
    
    public ArrayList<Socio> getSocios(){
        return this.socios;
    }
    
    public boolean agregarLibro(Libro p_libro){
        return this.getLibros().add(p_libro);
    }

    public boolean quitarLibro(Libro p_libro){
        return this.getLibros().remove(p_libro);
    }

    public boolean agregarSocio(Socio p_socio){
        return this.getSocios().add(p_socio);
    }
    
    public boolean quitarSocio(Socio p_socio){
        return this.getSocios().add(p_socio);
    }
    
    public boolean hayLibro(Libro p_libro){
        return this.getLibros().contains(p_libro);
    }
        
    public boolean haySocio(Socio p_socio){
        return this.getSocios().contains(p_socio);
    }

    // prestarLibro()

    public void devolverLibro(Libro p_libro) throws LibroNoPrestadoException{
        if(p_libro.prestado() == false){
            throw new LibroNoPrestadoException("El libro " + p_libro.getTitulo() + "    no esta prestado");
        } else {
            Prestamo ultimoPrestamo = p_libro.ultimoPrestamo();
            ultimoPrestamo.registrarFechaDevolucion(Calendar.getInstance());
        }
    }

    // cantidadDeSociosPorTipo()

    // prestamosVencidos()

    // docentesResponsables()
    
    public String quienTieneElLibro(Libro p_libro) throws LibroNoPrestadoException{
        if(p_libro.prestado()){
            return p_libro.ultimoPrestamo().getSocio().toString();
        }else{
            throw new LibroNoPrestadoException("El libro se encuentra en la biblioteca");
        }
    }

    public Socio buscarSocio(int p_dni){
        for(Socio socio: this.getSocios()){
            if(socio.getDniSocio() == p_dni){
                return socio;
            }     
        }
        return null;
    }
    
    // listaDeSocios()
    
    // listaDeLibros()
    
    public String listaDeTitulos() {
        String listado = "";
        for(Libro libro: this.getLibros()) {
            listado += libro.toString() + "\n";
        }
        return listado;
    }
    
    // listaDeDocentesResponsables()
  
}
