package Ascensor;

public class Puerta {
    private boolean abierta;
    private boolean sensorObstaculo;

    public Puerta() {
        this.abierta = false;
        this.sensorObstaculo = false;
    }

    public void abrir() {
        if (!sensorObstaculo) {
            this.abierta = true;
            System.out.println("La puerta está abierta.");
        } else {
            System.out.println("No se puede abrir la puerta debido a un obstáculo.");
        }
    }

    public void cerrar() {
        if (!sensorObstaculo) {
            this.abierta = false;
            System.out.println("La puerta está cerrada.");
        } else {
            System.out.println("No se puede cerrar la puerta debido a un obstáculo.");
        }
    }

    public void activarSensorObstaculo() {
        this.sensorObstaculo = true;
        System.out.println("Sensor de obstáculo activado. La puerta no se cerrará.");
    }

    public void desactivarSensorObstaculo() {
        this.sensorObstaculo = false;
        System.out.println("Sensor de obstáculo desactivado.");
    }

    public boolean isAbierta() {
        return abierta;
    }
    
}
