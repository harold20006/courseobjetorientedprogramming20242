package Ascensor;

public class Ascensor {
    private int pisoActual; // muestra la ubicación actual del ascensor
    private String direccion; // "subiendo" o "bajando"
    private boolean puertasAbiertas; // muestra si las puertas del ascensor están abiertas
    private boolean enMovimiento; // muestra si el ascensor está en movimiento

    // constructor que recibe el piso inicial del ascensor

    public Ascensor(int pisoInicial) {
        this.pisoActual = pisoInicial;
        this.direccion = "subiendo";
        this.puertasAbiertas = false;
        this.enMovimiento = true;
    }

    // metodo para mover el ascensor al piso destino
    public void mover(int pisoDestino) {
        if (!enMovimiento) { // si el ascensor está detenido por emergencia
            System.out.println("Ascensor detenido por emergencia.");
            return;
        }
        // verifica si el ascensor esta en movimiento y en que direccion
        if (pisoDestino > pisoActual) {
            direccion = "subiendo";
        } else if (pisoDestino < pisoActual) {
            direccion = "bajando";
        }
        pisoActual = pisoDestino;
        System.out.println("Ascensor movido al piso " + pisoActual);
    }

    // metodo para abrir las puertas del ascensor
    public void abrirPuertas() {
        puertasAbiertas = true;
        System.out.println("Puertas abiertas en el piso " + pisoActual);
    }

    // metodo para cerrar las puertas del ascensor

    public void cerrarPuertas() {
        puertasAbiertas = false;
        System.out.println("Puertas cerradas en el piso " + pisoActual);
    }

    // metodo para detener el ascensor por emergencia
    public void detenerAscensor() {
        enMovimiento = false;
        abrirPuertas();
        System.out.println("Ascensor detenido en el piso " + pisoActual + " por activación de emergencia.");
    }

    // metodo para reanudar el movimiento del ascensor
    public void reanudarMovimiento() {
        enMovimiento = true;
        System.out.println("Ascensor reanudado.");
    }

    // metodos getter y setter
    public boolean arePuertasAbiertas() {
        return puertasAbiertas;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEnMovimiento() {
        return enMovimiento;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public int getPisoDestino() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }
}
