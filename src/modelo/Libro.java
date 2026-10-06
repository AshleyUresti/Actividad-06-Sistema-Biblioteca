package modelo;

public class Libro {
    private String titulo;
    private String autor;

    public Libro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }
}
