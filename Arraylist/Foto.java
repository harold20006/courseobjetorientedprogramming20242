package Arraylist;

public class Foto {

    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    // Método print
    public void print() {
        System.out.println("Imprimiendo foto: " + fichero);
    }

    // Getters y Setters
    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }
}
