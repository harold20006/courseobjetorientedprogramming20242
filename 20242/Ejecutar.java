
public class Ejecutar {
    public static void main(String[] args) {
        System.out.println("ejercicio 1");

        // comentario de una sola linea

        /*
         * comentario
         * de
         * varias
         * lineas
         */

        /*
         * tipos de datos en java
         * numericos -->(enteros) int, long (reales),float,double
         * logicos-->boolean
         * cadena-->char, string
         */

        // ejercicio 1

        int b = 2;
        int areadecuadrado = b * b;
        System.out.println("area del cuadrado = " + areadecuadrado);

        // ejercicio 2

        double r = 3;
        final double PI = 3.1416;
        double areacirculo = PI * (r * r);
        System.out.println("el area del circulo es =" + areacirculo);

        // ejercicio 3

        double C = 32;
        double F = 96;
        double gradoscentigrados = (F - 32) /1.8;
        double gradosfarenheit = (C * 1.8) +32;
        System.out.println(F +" farenheit a Grados centigrados ="+ gradoscentigrados);
        System.out.println(C +" centigrados a Grados farengehit ="+ gradosfarenheit);

    }
}
