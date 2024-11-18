package Ascensor;

public class Ejecoutor {
    
    // Método principal para ejecutar el ejemplo de funcionamiento del sistema de control de ascensores.
     
    public static void main(String[] args) {
        SistemaControl sistemaControl = new SistemaControl(10, 1);
        sistemaControl.ejemploFuncionamiento();
    }
}
