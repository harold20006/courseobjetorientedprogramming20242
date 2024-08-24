//ejercicio 4

import java.util.Scanner;

public class CaluloDeSalario {
    int salariobruto;
    int deducciones;
    int comision;
    int SalarioNeto;
    Scanner scanner = new Scanner(System.in);

    public void leernumerosYcalculoSalario() {
        System.out.println("ingrese numeros:");
        salariobruto = scanner.nextInt();
        deducciones = scanner.nextInt();
        comision = scanner.nextInt();

        SalarioNeto = (salariobruto - deducciones) + comision;

        System.out.println("El salario Neto es:" + SalarioNeto);

    }

    public static void main(String[] args) {
        CaluloDeSalario cal = new CaluloDeSalario();
        cal.leernumerosYcalculoSalario();

    }
}
