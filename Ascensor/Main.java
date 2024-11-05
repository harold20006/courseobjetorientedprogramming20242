package Ascensor;

public class Main {
    public static void main(String[] args) {
        // Inicializar el sistema con 5 pisos
        SistemaControl sistema = new SistemaControl(5);

        // Mostrar estado inicial del ascensor
        sistema.mostrarEstadoAscensor();
        System.out.println();

        // Solicitar ascensor al piso 3 para subir
        sistema.solicitarAscensor(3, "subir");
        System.out.println();

        // Seleccionar piso 5 desde el ascensor
        sistema.seleccionarPisoAscensor(5);
        System.out.println();

        // Mantener puertas abiertas en el piso 5
        sistema.mantenerPuertasAbiertas();
        System.out.println();

        // Activar sensor de obstáculo y tratar de cerrar puertas
        sistema.activarSensorObstaculoAscensor();
        sistema.desactivarSensorObstaculoAscensor();
        sistema.abrirPuertas();
        sistema.cerrarPuertas();
        System.out.println();

        // Mostrar estado final del ascensor
        sistema.mostrarEstadoAscensor();
    }
}

