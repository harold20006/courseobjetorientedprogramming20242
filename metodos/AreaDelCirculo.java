// ejercicio 2

import java.util.Scanner;

public class AreaDelCirculo {

    double r;
    final double PI= 3.1416;
    double AreaDelCirculo;
    Scanner scanner = new Scanner(System.in);
   
    public void leerNumeroYCalcularArea(){

        System.out.println("ingrese un numero:");
        r=scanner.nextInt();

        AreaDelCirculo= PI * (r*r);

        System.out.println("El area del circulo es:"+AreaDelCirculo);

      
   }
   public static void main(String[] args) {
    AreaDelCirculo area = new AreaDelCirculo();
    area.leerNumeroYCalcularArea();
   }
}
