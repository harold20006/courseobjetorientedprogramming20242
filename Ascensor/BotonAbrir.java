package Ascensor;

public class BotonAbrir extends Boton {
    private boolean abrir; // true si la puerta está abierta

    // constructor que recibe el estado de la puerta

    public BotonAbrir(boolean abrir) {
        super("tiempo extra");
        this.abrir = abrir;
    }

    // Método que se ejecuta al presionar el botón
    public void presionar() {
        abrir = true;
        System.out.println("Botón de " + getTipo() + " presionado, 'Emitiendo sonido'..'Luz Encendida'.....apagado");
        abrir = false;

    }

    // Getters
    public boolean isAbrir() {
        return abrir;
    }
}
