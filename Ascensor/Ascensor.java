package Ascensor;

import java.util.List;

public class Ascensor {
    private int pisoActual;
    private String direccion; // "subiendo" o "bajando"
    private Puerta puerta; 
    private List<BotonDestino> botones;

    public Ascensor(int pisoInicial, List<BotonDestino> botones) {
        this.pisoActual = pisoInicial;
        this.direccion = "subiendo";
        this.puerta = new Puerta();
        this.botones = botones;
    }

    public void moverAscensor(int pisoDestino) {
        if (pisoDestino > pisoActual) {
            direccion = "subiendo";
        } else if (pisoDestino < pisoActual) {
            direccion = "bajando";
        } else {
            System.out.println("El ascensor ya está en el piso " + pisoActual);
            return;
        }
        System.out.println("El ascensor se está moviendo de piso " + pisoActual + " a piso " + pisoDestino + " en dirección " + direccion + ".");
        pisoActual = pisoDestino;
        System.out.println("El ascensor ha llegado al piso: " + pisoActual);
    }

    public void abrirPuertas() {
        puerta.abrir();
    }

    public void cerrarPuertas() {
        puerta.cerrar();
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public List<BotonDestino> getBotones() {
        return botones;
    }
}
