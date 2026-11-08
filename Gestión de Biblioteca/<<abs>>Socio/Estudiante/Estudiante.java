import java.util.Calendar;

public class Estudiante extends Socio{
    private String carrera;
    private Calendar fechaDevolucion;
    
    public Estudiante(int p_dniSocio, String p_nombre, int p_diasPrestamo, String p_carrera){
       super(p_dniSocio, p_nombre, p_diasPrestamo);
       this.setCarrera(p_carrera);
    }
    
    private void setCarrera(String p_carrera){
        this.carrera = p_carrera;
    }
    
     public String getCarrera(){
        return this.carrera;
    }
    
    public String soyDeLaClase(){
        return "Estudiante";
    }
    
    @Override
    public boolean puedePedir() {
          boolean noTieneLibrosVencidos = super.puedePedir();
          
          boolean tiene3Libros = this.cantLibrosPrestados() <= 3;
          
          return noTieneLibrosVencidos && tiene3Libros;
    }
    
}
