
import java.util.Scanner;

public class Persona {
    String nombre;
    int peso;
    double altura;
    int edad;
    Scanner scanner = new Scanner(System.in);

    // constructor
    public Persona(String nombre, int peso, double altura, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public Persona() {
    }

    public void leerDatos() {
        System.out.println("ingrese su nombre:");
        nombre = scanner.next();
        System.out.println("ingrese su peso:");
        peso = scanner.nextInt();
        System.out.println("ingrese su altura:");
        altura = scanner.nextDouble();
        System.out.println("ingrese su edad:");
        edad = scanner.nextInt();

    }
    public static void main(String[] args) {
        Persona objper = new Persona();
        objper.leerDatos();
    }
}
