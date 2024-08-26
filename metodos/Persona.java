import java.util.Scanner;

public class Persona {
     char nombre;
     int peso;
     double altura;
     int edad;
     Scanner scanner = new Scanner(System.in);

     public void leerDatos() {
        System.out.println("ingrese su nombre:");
        nombre = scanner.next().charAt(0);
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
