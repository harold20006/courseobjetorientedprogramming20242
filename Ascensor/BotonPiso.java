package Ascensor;

public class BotonPiso extends Boton {

    private String direccion;// subida o bajada

    // Constructor que recibe la dicrección del ascensor

    public BotonPiso(String direccion) {
        super("piso");
        this.direccion = direccion;
    }

    // Método que se ejecuta al presionar el botón
    public String getPisoDestino() {
        return direccion;
    }

}
