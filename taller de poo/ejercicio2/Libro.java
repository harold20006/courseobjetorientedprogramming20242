package ejercicio2;

public class Libro {
    String titulo;
    String autor;
    int ISBN;
    int paginas;
    boolean disponibilidad;

    public Libro(String titulo, String autor, int ISBN, int paginas, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.disponibilidad = disponibilidad;
    }

    public String disponibilidad() {
        if (disponibilidad == true) {
            return "El libro esta disponible";
        } else {
            return "El libro no esta disponible";
        }
    }

    public String prestamo() {
        if (disponibilidad == true) {
            disponibilidad = false;
            return "El libro ha sido prestado";
        } else {
            return "El libro no esta disponible";
        }
    }

    public String devolucion() {
        if (disponibilidad == false) {
            disponibilidad = true;
            return "El libro ha sido devuelto";
        } else {
            return "El libro no ha sido prestado";
        }
    }
}
    