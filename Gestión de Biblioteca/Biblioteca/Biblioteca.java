import java.util.*;
/**
 * Write a description of class Biblioteca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Biblioteca{
    private String nombre;
    private ArrayList<Socio> socios;
    private ArrayList<Libro> libros;
    
    /**
     * Constructor de la clase Biblioteca que recibe solo el nombre.
     * Inicializa la lista de socios y libros como listas vacías.
     * 
     * @param p_nombre El nombre de la biblioteca.
     */
    public Biblioteca (String p_nombre){
        this.setNombre(p_nombre);
        this.setSocios(new ArrayList<Socio>());
        this.setLibros(new ArrayList<Libro>());
    }
    
    /**
     * Constructor que recibe el nombre, lista de socios y lista de libros.
     * 
     * @param p_nombre El nombre de la biblioteca.
     * @param p_socios Lista de socios a asignar.
     * @param p_libros Lista de libros a asignar.
     */
    public Biblioteca (String p_nombre, ArrayList<Socio> p_socios, ArrayList<Libro> p_libros){
        this.setNombre(p_nombre);
        this.setSocios(p_socios);
        this.setLibros(p_libros);
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

    /**
     * Devuelve true o false si se elimina o no un libro de la biblioteca.
     * Se ingresa por parametro el titulo del libro a eliminar y por cada libro que este agregado
     * se compara su titulo con el ingresado por parametro. Si coinciden ambos titulos, se elimina el libro actual.
     * 
     * @return true o false según se haya podido eliminar o no el libro.
     */
    public boolean eliminarLibro(String p_titulo){
        for(Libro libro : this.getLibros()){
            if(libro.getTitulo().equalsIgnoreCase(p_titulo)){
                return this.getLibros().remove(libro);
          }
        }
        return false;
    }

    public boolean agregarSocio(Socio p_socio){
        return this.getSocios().add(p_socio);
    }
    
     /**
     * Devuelve true o false si se elimina o no un socio de la biblioteca.
     * Se ingresa por parametro el DNI del socio a eliminar y por cada socio que este agregado
     * se compara su DNI con el ingresado por parametro. Si coinciden ambos DNI, se elimina el socio actual.
     * 
     * @return true o false según se haya podido eliminar o no el socio.
     */
    //
    public boolean eliminarSocio(int p_dni){
        for(Socio socio: this.getSocios()){
            if(socio.getDniSocio() == p_dni){
                return this.getSocios().remove(socio);
            }
        }
        return false;
    }
    
    public boolean hayLibro(Libro p_libro){
        return this.getLibros().contains(p_libro);
    }
        
    public boolean haySocio(Socio p_socio){
        return this.getSocios().contains(p_socio);
    }
    
    /**
     * Crea y agrega un nuevo libro a la biblioteca.
     * Recibe por parametro los datos del objeto libro y lo instancia.
     * Si el libro pudo o no ser agregado se imprime un mensaje de aviso.
     */
    public void nuevoLibro(String p_titulo, int p_edicion, String p_editorial, int p_anio){
        Libro libro = new Libro(p_titulo, p_edicion, p_editorial, p_anio);
        boolean agregarLibro = this.getLibros().add(libro);
        if(agregarLibro == true){
            System.out.println("El libro " + p_titulo + "\nEdicion: " + p_edicion + " se ha agregado con exito");  
        }else{
            System.out.println("Ocurrio un error al momento de agregar el libro");
        }
        
    }
    
    /**
     * Crea y agrega un nuevo socio estudiante a la biblioteca.
     * Recibe por parametro los datos del objeto socio estudiante y lo instancia.
     * Si el socio pudo o no ser agregado se imprime un mensaje de aviso.
     */
    public void nuevoSocioEstudiante(int p_dniSocio, String p_nombre, String p_carrera){
        Estudiante socioEstudiante = new Estudiante(p_dniSocio, p_nombre, 20, p_carrera);
        boolean agregarSocio= this.getSocios().add(socioEstudiante);
        if(agregarSocio == true){
            System.out.println("El socio " + p_dniSocio  + " " + p_nombre + " se ha agregado con exito");  
        }else{
            System.out.println("Ocurrio un error al momento de agregar el socio");
        }
    }
    
    /**
     * Método para agregar un nuevo socio docente a la lista de socios.
     * 
     * @param p_dniSocio DNI del nuevo socio docente.
     * @param p_nombre Nombre del nuevo socio docente.
     * @param p_area Área del docente.
     */
    public void nuevoSocioDocente(int p_dniSocio, String p_nombre, String p_area){
        Docente nuevoSocioDocente = new Docente (p_dniSocio, p_nombre, 5, p_area);
        boolean agregarSocio = this.getSocios().add(nuevoSocioDocente);
        if(agregarSocio == true){
            System.out.println("El socio " + p_dniSocio + " " + p_nombre + " se ha agregado con exito");  
        }else{
            System.out.println("Ocurrio un error al momento de agregar el socio");
        }
    }
    
    public boolean prestarLibro(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro){
        if (p_libro.prestado() || !p_socio.puedePedir()){
            return false;
        }else{
            Prestamo nuevoPrestamo = new Prestamo(p_fechaRetiro, p_libro, p_socio);
            
            nuevoPrestamo.getLibro().agregarPrestamo(nuevoPrestamo);
            nuevoPrestamo.getSocio().agregarPrestamo(nuevoPrestamo);

            return true;
        }
    }
    
    public void devolverLibro(Libro p_libro) throws LibroNoPrestadoException{
        if(p_libro.prestado() == false){
            throw new LibroNoPrestadoException("El libro " + p_libro.getTitulo() + "  no se puede devolver ya que se encuentra en la biblioteca");
        } else {
            Prestamo ultimoPrestamo = p_libro.ultimoPrestamo();
            ultimoPrestamo.registrarFechaDevolucion(Calendar.getInstance());
        }
    }
    
    public int cantidadDeSociosPorTipo(String p_objeto){
        int total = 0;
        for(Socio socio: this.getSocios()){
            if(socio.soyDeLaClase().equals(p_objeto)){
                total++;
            }
        }
        return total;
    }
    
    public ArrayList<Prestamo> prestamosVencidos(){
         ArrayList<Prestamo> prestamosVencidos = new ArrayList<Prestamo>();
        for(Libro libro: this.getLibros()){
            if(libro.ultimoPrestamo().vencido(Calendar.getInstance())){
                prestamosVencidos.add(libro.ultimoPrestamo());
            }
        }
        return prestamosVencidos;
    }
    
    /**
     * Se crea y devuelve una colección de docentes responsables.
     * Recorre la colección de socios docentes que tenga la biblioteca y consulta por cada uno
     * si es responsable. En caso de serlo, se agrega a la nueva colección.
     * 
     * @return el ArrayList de docentes responsables.
     */
    public ArrayList<Docente> docentesResponsables(){
        ArrayList<Docente> listaResponsables = new ArrayList<Docente>();

        for(Socio socio: this.getSocios()){
            if(socio.soyDeLaClase().equals("Docente")){
                Docente docente = (Docente)socio;
                if(docente.esResponsable()){
                    listaResponsables.add(docente);
                }
            }
        }
        return listaResponsables;
    }
    
    public String quienTieneElLibro(Libro p_libro) throws LibroNoPrestadoException{
        if(p_libro.prestado()){
            return p_libro.ultimoPrestamo().getSocio().getNombre();
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
    
    /**
     * Método que imprime la lista enumerada de socios en la consola.
     * 
     * @return Un string con la lista de socios.
     */
    public String listaDeSocios(){
        HashSet<String> lista = new HashSet<String>();
        int i =1;
        for(Socio unSocio : this.getSocios()){  
            lista.add(i + ") " + unSocio.toString() + "\n");
            i++;
        }    
        return String.join ("Lista de socios: \n", lista);
    }
    
    /**
     * Recorre la colección de libros de la biblioteca y por cada uno devuelve un string del 
     * titulo y si está o no prestado.
     * 
     * @return titulo y leyenda de prestamo de cada libro.
     */
    public String listaDeLibros(){
        HashSet<String> lista = new HashSet<String>();
        for(Libro libro : this.getLibros()){
            if(libro.prestado()){
                lista.add( "Titulo: " + libro.getTitulo() + " || Prestado: SI"); 
            }else{
                lista.add( "Titulo: " + libro.getTitulo() + " || Prestado: NO"); 
            }
        }
        return String.join ("\n", lista);
    }
    
    public String listaDeTitulos() {
        String listado = "";
        for(Libro libro: this.getLibros()) {
            listado += libro.toString() + "\n";
        }
        return listado;
    }
    
     /**
     * Recorre la colección de socios docentes responsables de la biblioteca y por cada uno devuelve un string 
     * del DNI, nombre y apellido y tipo de socio.
     * 
     * @return titulo y leyenda de prestamo de cada libro.
     */
    public String listaDeDocentesResponsables(){
        HashSet<String> lista = new HashSet<String>();
        for(Socio socio : this.docentesResponsables()){
            lista.add(socio.toString());
        }
        return String.join ("\n", lista);
    }
}
