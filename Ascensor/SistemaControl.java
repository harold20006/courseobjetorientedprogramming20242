package Ascensor;

import java.util.ArrayList;
import java.util.List;

public class SistemaControl {
    public static final int NUMERO_PISO_MAXIMO = 5; // Definir el número total de pisos

    private List<Piso> pisos;
    private Ascensor ascensor;

    public SistemaControl(int totalPisos) {
        if (totalPisos < 1) {
            throw new IllegalArgumentException("El edificio debe tener al menos un piso.");
        }
        // Ajustar NUMERO_PISO_MAXIMO si es necesario
        // Inicializamos pisos con agregación
        this.pisos = new ArrayList<>();
        for (int i = 1; i <= totalPisos; i++) {
            pisos.add(new Piso(i));
        }

        // Crear botones internos para el ascensor
        List<BotonDestino> botonesAscensor = new ArrayList<>();
        for (int i = 1; i <= totalPisos; i++) {
            botonesAscensor.add(new BotonDestino(i));
        }

        // Inicializar ascensor en el piso 1 con composición
        this.ascensor = new Ascensor(1, botonesAscensor);
    }

    public void solicitarAscensor(int pisoSolicitado, String direccion) {
        if (pisoSolicitado < 1 || pisoSolicitado > pisos.size()) {
            System.out.println("Solicitud inválida: piso " + pisoSolicitado + " no existe.");
            return;
        }
        System.out.println("Solicitud de ascensor en el piso " + pisoSolicitado + " dirección: " + direccion);

        Piso piso = pisos.get(pisoSolicitado - 1);
        // Presionar el botón correspondiente
        if ("subir".equalsIgnoreCase(direccion) && piso.getBotonSubir() != null) {
            piso.getBotonSubir().presionar();
        } else if ("bajar".equalsIgnoreCase(direccion) && piso.getBotonBajar() != null) {
            piso.getBotonBajar().presionar();
        } else {
            System.out.println("No hay botón de " + direccion + " en el piso " + pisoSolicitado);
        }

        // Mover el ascensor al piso solicitado
        ascensor.moverAscensor(pisoSolicitado);
        ascensor.abrirPuertas();
    }

    public void seleccionarPisoAscensor(int pisoDestino) {
        if (pisoDestino < 1 || pisoDestino > pisos.size()) {
            System.out.println("Selección inválida: piso " + pisoDestino + " no existe.");
            return;
        }
        System.out.println("Selección de piso " + pisoDestino + " desde el ascensor.");

        // Presionar el botón dentro del ascensor
        Boton BotonDestino = ascensor.getBotones().get(pisoDestino - 1);
        BotonDestino.presionar();

        // Cerrar puertas antes de mover
        ascensor.cerrarPuertas();

        // Mover el ascensor al piso destino
        ascensor.moverAscensor(pisoDestino);
        ascensor.abrirPuertas();
    }

    public void mantenerPuertasAbiertas() {
        System.out.println("Manteniendo puertas abiertas.");
        ascensor.getPuerta().abrir(); // Simula mantener las puertas abiertas
    }

    public void activarSensorObstaculoAscensor() {
        ascensor.getPuerta().activarSensorObstaculo();
    }

    public void desactivarSensorObstaculoAscensor() {
        ascensor.getPuerta().desactivarSensorObstaculo();
    }

    public void mostrarEstadoAscensor() {
        System.out.println("Estado del Ascensor:");
        System.out.println("Piso actual: " + ascensor.getPisoActual());
        System.out.println("Dirección: " + ascensor.getDireccion());
        System.out.println("Puertas abiertas: " + ascensor.getPuerta().isAbierta());
    }
}