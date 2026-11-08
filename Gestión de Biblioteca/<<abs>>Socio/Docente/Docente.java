import java.util.Calendar;

public class Docente extends Socio{
    private String area;
    
public Docente(int p_dniSocio, String p_nombre, int p_diasPrestamo, String p_area){
       super(p_dniSocio, p_nombre, p_diasPrestamo);
       this.setArea(p_area);
    }
    
private void setArea(String p_area){
        this.area = p_area;
    }
    
public String getArea(){
        return this.area;
    }
    
public String soyDeLaClase(){
        return "Docente";
    }
    
public boolean puedePedir(){
        Calendar hoy = Calendar.getInstance();
        
        for (Prestamo unPrestamo : getListaPrestamos()) {
            if(unPrestamo.getFechaDevolucion() == null && unPrestamo.vencido(hoy))
            return false;
        }
        
        return true;
    }
    
public boolean esResponsable() {
    Calendar hoy = Calendar.getInstance();
    
        for (Prestamo unPrestamo : this.getListaPrestamos()) {
            if (unPrestamo.getFechaDevolucion() == null) {
            // Aún lo tiene: vemos si HOY ya se le venció
            if (unPrestamo.vencido(hoy)) {
                return false;
            }
            } else {
            // Ya lo devolvió: vemos si en la fecha que lo entregó, ya estaba vencido
                if (unPrestamo.vencido(unPrestamo.getFechaDevolucion())) {
                return false;
            }
        }
    }
    return true;
}   
    
public void cambiarDiasDePrestamo(int p_dias){
    if (this.esResponsable()) {
        super.actualizarDias(super.getDiasPrestamo() + p_dias);
    }
}
}
