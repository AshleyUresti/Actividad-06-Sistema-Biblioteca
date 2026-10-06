package modelo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    List<Usuario> usuarios = new ArrayList<>();

    public Biblioteca (String nombre) {
        this.nombre = nombre;
    }

    public void agregarUsuario (Usuario usuario) {
        usuarios.add(usuario);
    }
}
