//ejercicio 6

import java.util.Scanner;

public class HorasDeParqueadero {
    int hora;
    double iva = 0.20;
    final int valorH = 2;
    double pagoparquedaro;
    Scanner scanner = new Scanner(System.in);

    public void leerhorasYcalculopago() {

        System.out.println("ingrese la cantidad de horas en el parqueadero");
        hora = scanner.nextInt();
        pagoparquedaro = ((valorH * hora) * iva) + (valorH * hora);

        System.out.println("El valor a pagar del parqueadero es:" + pagoparquedaro);
    }

    public static void main(String[] args) {
        HorasDeParqueadero hor = new HorasDeParqueadero();
        hor.leerhorasYcalculopago();
    }
}
