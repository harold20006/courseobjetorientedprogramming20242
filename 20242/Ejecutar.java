
public class Ejecutar {
    public static void main(String[] args) {
        System.out.println("ejercicios");

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

        //ejercicio 4

       int salariobruto = 1200000;
       int deducciones = 80000;
       int comision = 50000;
       int salarioneto = (salariobruto - deducciones) + comision;

     System.out.println("El salario es:"+ salarioneto);

     // ejercicio 5

     double D = 0.00025;
     double E = 0.00022;
     int pesos= 50000;
     double cambiodepesosadolares= pesos*D;
     double cambiodepesosaeuros= pesos*E;
     System.out.println("el cambio de pesos a dolares es:"+cambiodepesosadolares);
     System.out.println("el cambio de pesos a euros es:"+cambiodepesosaeuros);

     //ejercicio 6

     int hora= 10;
     double iva=0.20;
     final int valorH=2000;
     double pagoparquedaro=((valorH*hora)*iva)+(valorH*hora);
     System.out.println("el valor del parqueadero es:"+pagoparquedaro);









    }
}
