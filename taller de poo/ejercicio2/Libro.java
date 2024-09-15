package ejercicio2;

public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;
    private int numPaginas;
    private boolean prestado;

    public Libro(String titulo, String autor, int ISBN, int numPaginas, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String info() {
        if (prestado) {
            return "El libro " + titulo + " , " + autor + "; ISBN: " + ISBN + ", " + numPaginas + " pgs. "
                    + " no esta disponible";
        } else {
            return "El libro " + titulo + " , " + autor + "; ISBN: " + ISBN + ", " + numPaginas + " pgs. "
                    + " esta disponible";
        }
    }

    public String prestar() {
        if (prestado) {
            return "El libro " + titulo + " no se puede prestar";
        } else {
            prestado = true;
            return "El libro " + titulo + " ahora es tuyo, recuerda devolverlo";
        }
    }

    public String devolver() {
        if (prestado) {
            prestado = false;
            return "El libro " + titulo + " se ha devuelto";
        } else {
            return "no puedes devolvel el " + titulo + " si no lo has prestado?";
        }
    }

}
