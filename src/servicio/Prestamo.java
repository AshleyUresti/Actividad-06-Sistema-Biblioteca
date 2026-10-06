package servicio;

import modelo.Ejemplar;
import modelo.EstadoEjemplar;
import modelo.Usuario;
import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo (LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String realizarPrestamo(Usuario usuario, Ejemplar ejemplar) {

        if(ejemplar.getEstado() != EstadoEjemplar.DISPONIBLE){
            return "El ejemplar: " + ejemplar.getCodigo() + " no esta disponible";
        }
        ejemplar.setEstado(EstadoEjemplar.PRESTADO);

        return "Usuario: "+ usuario.getNombre() + " tiene el ejemplar " + ejemplar.getCodigo();
    }

    public void devolver(Ejemplar ejemplar){
        if(ejemplar.getEstado() == EstadoEjemplar.PRESTADO){
            ejemplar.setEstado(EstadoEjemplar.DISPONIBLE);
        }
        else{
            System.out.println("No hay nada que devolver");
        }
    }

    public boolean estaVencido(){
        return LocalDate.now().isAfter(fechaDevolucion);
    }

}
