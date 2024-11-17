package Ascensor;

public class BotonEmergencia extends Boton {

    private boolean emergencia;// true si se presiona el botón de emergencia

    // constructor que recibe el estado de la emergencia

    public BotonEmergencia(boolean emergencia) {
        super("piso");
        this.emergencia = emergencia;
    }

    // Método que se ejecuta al presionar el botón
    public void presionar() {
        emergencia = true;
        System.out.println("Botón de emergencia presionado, 'Emitiendo sonido'..'luz Encendida'......apagado");
        emergencia = false;
    }

    // Getters
    public boolean getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(boolean emergencia) {
        this.emergencia = emergencia;
    }
}
