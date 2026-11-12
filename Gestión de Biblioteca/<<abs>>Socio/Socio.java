package biblioteca;

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
    
    protected void setDiasPrestamo(int p_diasPrestamo){
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
    
    /**
     * METODO ADD PRESTAMO
     * @param p_prestamo
     * @return TRUE SI fue agregado el prestamo
     */
    public boolean agregarPrestamo(Prestamo p_prestamo){
        return this.getListaPrestamos().add(p_prestamo);
    }
    
    /**
     * METODO REMOVE PRESTAMO
     * @param p_prestamo
     * @return TRUE SI fue eliminado el prestamo
     */
    public boolean quitarPrestamo(Prestamo p_prestamo){
        return this.getListaPrestamos().remove(p_prestamo);
    }
    
    public int cantLibrosPrestados() {
        int prestamoActivos = 0;
        for(Prestamo prestamo: this.getListaPrestamos()){
            if(prestamo.getFechaDevolucion() == null){
                prestamoActivos++;
            }
        }
        return prestamoActivos;
    }
    
    public String toString (){
        return "D.N.I: " + this.getDniSocio() + " ||" + this.getNombre() + " (" + soyDeLaClase() + ") || Libros prestados: " + cantLibrosPrestados();
    }
    
     /**
     * Verifica si el socio puede solicitar más préstamos, basado en si tiene préstamos vencidos. 
     * @return verdadero si el socio puede pedir un nuevo préstamo, falso si tiene algún préstamo vencido
     */
    public boolean puedePedir() {
        Calendar hoy = Calendar.getInstance();
        for(Prestamo prestamo: this.getListaPrestamos()) {
            if(prestamo.getFechaDevolucion() == null) { 
                if(prestamo.vencido(hoy)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public abstract String soyDeLaClase();
}
