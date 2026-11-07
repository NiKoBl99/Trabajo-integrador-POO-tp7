import java.util.ArrayList;

/**
Clase Abstracta Socio
 */
public abstract class Socio {
    private int dniSocio;
    private String nombre;
    private int diasPrestamo;
    private ArrayList<Prestamo> prestamos;
    
    public Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo){
        this.setDniSocio(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setListaPrestamos(new ArrayList<Prestamo>());
    }
    
    private void setDniSocio(int p_dni){
        this.dniSocio = p_dni;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDiasPrestamo(int p_diasPrestamo){
        this.diasPrestamo = p_diasPrestamo;
    }
    
    private void setListaPrestamos(ArrayList <Prestamo> p_prestamos){
        this.prestamos = p_prestamos;
    }
    
    public ArrayList<Prestamo> getListaPrestamos(){
        return this.prestamos;
    }
    
    public int getDniSocio(){
        return this.dniSocio;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getDiasPrestamo(){
        return this.diasPrestamo;
    }
    
    public int cantLibrosPrestados(){
        return this.getListaPrestamos().size();
    }
    
    public abstract String soyDeLaClase();
    
    public String toString (){
        return "D.N.I: " + this.getDniSocio() + " ||" + this.getNombre() + " (" + soyDeLaClase() + ") || Libros prestados: " + cantLibrosPrestados();
    }
    
    
    
}
