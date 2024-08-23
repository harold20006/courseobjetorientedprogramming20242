// ejercicio 1

import java.util.Scanner;

public class AreaDelCuadrado {
  
    int numero;
    int areaDelCuadrado;
    Scanner scanner = new Scanner(System.in);
   
    // Método para leer el número e imprimir el área del cuadrado
    public void leerNumeroYCalcularArea() {
        System.out.print("Ingresa un número entero: ");
        numero = scanner.nextInt(); 
        
        // Calcular el área del cuadrado
        areaDelCuadrado = numero * numero;
        
        // Mostrar el área del cuadrado
        System.out.println("El área del cuadrado es: " + areaDelCuadrado);
    }
    
    public static void main(String[] args) {
        // Crear una instancia de la clase y ejecutar el método
        AreaDelCuadrado area = new AreaDelCuadrado();
        area.leerNumeroYCalcularArea();
    }
}


