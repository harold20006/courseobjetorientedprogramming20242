
package Ascensor;

public class Ascensor {

    private int pisoActual;
    private String direccion;
    private boolean PuertasAbiertas;
    private boolean enMovimiento;

    public Ascensor(int pisoActual, String direccion, boolean PuertasAbiertas, boolean enMovimiento) {
        this.pisoActual = pisoActual;
        this.direccion = "subiendo";
        this.PuertasAbiertas = false;
        this.enMovimiento = false;
    }

    public void movimiento(int pisoDestino) {
        if (!enMovimiento) {
            System.out.println("el ascensor se en Emergencia ");
            return;
        }
        if (pisoDestino > pisoActual) {
            direccion = "subiendo";
        } else if (pisoDestino < pisoActual) {
            direccion = "bajando";
        }

        pisoActual = pisoDestino;
        System.out.println("el ascensor se ha movido al piso " + pisoDestino);

    }

    public void abrirPuertas() {
        PuertasAbiertas = true;
        System.out.println("las puertas se han abierto");
    }

    public void cerrarPuertas() {
        PuertasAbiertas = false;
        System.out.println("las puertas se han cerrado");

    }

    public void emergencia() {
        enMovimiento = false;
        System.out.println("el ascensor se ha detenido" + pisoActual + " por emergencia");

    }

    public void reiniciar() {
        enMovimiento = true;
        System.out.println("el ascensor se ha reiniciado");
    }
}
