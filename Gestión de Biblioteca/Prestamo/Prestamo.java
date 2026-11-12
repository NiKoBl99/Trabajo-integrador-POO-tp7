import java.util.Calendar;
import java.util.GregorianCalendar;
/**
TP 7. CLASE PRESTAMO
 */
public class Prestamo{
    private Calendar fechaRetiro;
    private Calendar fechaDevolucion;
    private Libro libro;
    private Socio socio;
    
    public Prestamo(Calendar p_fechaRetiro, Calendar p_fechaDevolucion, Libro p_libro, Socio p_socio){
        this.setFechaRetiro(p_fechaRetiro);
        this.setFechaDevolucion(null);
        this.setSocio(p_libro);
        this.setLibro(p_socio);
    }
    
    private void setFechaRetiro(Calendar p_fechaRetiro){
        this.fechaRetiro = p_fechaRetiro;
    }
    
    private void setFechaDevolucion(Calendar p_fechaDevolucion){
        this.fechaDevolucion = p_fechaDevolucion;
    }  
    
    private void setSocio(Calendar p_fechaRetiro){
        this.fechaRetiro = p_fechaRetiro;
    }
    
    private void setLibro(Libro p_libro){
        this.libro = p_libro;
    }
    
    private void setSocio(Socio p_socio){
        this.socio = p_socio;
    }
    
    public Calendar getFechaRetiro(){
        return this.fechaRetiro;
    }
    
    public Calendar getFechaDevolucion(){
        return this.fechaDevolucion;
    }
    
    public Socio getSocio(){
        return this.socio;
    }
    
    public Libro getLibro(){
        return this.libro;
    }
    
    public boolean vencido(Calendar fecha) {
        Calendar fechaLimite = (Calendar) fechaRetiro.clone();
        fechaLimite.add(Calendar.DATE, socio.getDiasPrestamo());
        return fecha.after(fechaLimite);
    }

    public void registrarFechaDevolucion(Calendar p_fechaDevolucion){
        this.setFechaDevolucion(p_fechaDevolucion);
    }

    public String toString() {
        String fechaRet = fechaRetiro.get(Calendar.YEAR) + "/" + (fechaRetiro.get(Calendar.MONTH) + 1) + "/" + fechaRetiro.get(Calendar.DAY_OF_MONTH);
        String fechaDevol = (fechaDevolucion != null) ? (fechaDevolucion.get(Calendar.YEAR) + "/" + (fechaDevolucion.get(Calendar.MONTH) + 1) + "/" + fechaDevolucion.get(Calendar.DAY_OF_MONTH)) : "Pendiente";
        
        return "Retiro: " + fechaRet + " - Devolución: " + fechaDevol + 
               "\nLibro: " + this.getLibro().getTitulo() + 
               "\nSocio: " + this.getSocio().getNombre();
    }

    
}
