//ejercicio 5

import java.util.Scanner;

public class ConversionDeDivisas {

    double D = 0.00025;
    double E = 0.00022;
    double pesos;
    double cambiodepesosadolares;
    double cambiodepesosaeuros;

    Scanner scanner = new Scanner(System.in);

    public void leernumerosYcambioDeDivisas() {

        System.out.println("ingrese la cantidad deseada:");

        pesos = scanner.nextInt();
        cambiodepesosadolares = pesos * D;
        cambiodepesosaeuros = pesos * E;

        System.out.println("La cantidad de dolares son:" + cambiodepesosadolares);
        System.out.println("La cantidad de euros son:" + cambiodepesosaeuros);

    }

    public static void main(String[] args) {
        ConversionDeDivisas con = new ConversionDeDivisas();
        con.leernumerosYcambioDeDivisas();
    }
}
