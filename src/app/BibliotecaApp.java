import modelo.*;
import servicio.Prestamo;

import java.sql.SQLOutput;

void main() {
    Biblioteca biblioteca = new Biblioteca("BIBLIOuv");
    Usuario u1 = new Usuario("Isa","s25");

    biblioteca.agregarUsuario(u1);
    Libro libro1 = new Libro("BD","Magdielito");

    Ejemplar ej1 = new Ejemplar("147", EstadoEjemplar.DISPONIBLE);

    System.out.println("Libro: "+ libro1.getTitulo() + " - " + libro1.getAutor());
    System.out.println("Estado inicial: " + ej1.getEstado());

    Prestamo prestamo1 = new Prestamo(LocalDate.now(), LocalDate.now().plusDays(1));
    String resultado = prestamo1.realizarPrestamo(u1, ej1);

    System.out.printf(resultado);
    System.out.println("Estado tras prestamo: " + ej1.getEstado());
    System.out.println("¿Vencido?" + prestamo1.estaVencido());

    prestamo1.devolver(ej1);
    System.out.println("Estado tras devolver: " + ej1.getEstado());

}