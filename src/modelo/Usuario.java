package modelo;

public class Usuario {
    private String nombre;
    private String numeroIdentificacion;

    public Usuario (String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNumeroIdentificacion() {
        return this.numeroIdentificacion;
    }
}
