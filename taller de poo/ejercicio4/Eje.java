import java.util.Scanner;

public class Eje {

    public static void main(String[] args) {
      Perfume objper1 = new Perfume("sauvage", "Dior", 100, 200);
        Perfume objper2 = new Perfume("212", "Carolina Herrera", 100, 150);
        Perfume objper3 = new Perfume("black xs", "Paco Rabanne", 100, 120);
        Perfume objper4 = new Perfume("boss", "Hugo Boss", 100, 100);

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("1. aplicar perfume");
            System.out.println("2. cambiar precio");
            System.out.println("3. consultar estado del perfume");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("ingrese el perfume que desea aplicar");
                    int NumDeProducto = sn.nextInt();
                    switch(NumDeProducto){
                        case 1:
                            System.out.println(objper1.aplicar(100));
                            break;
                        case 2:
                            System.out.println(objper2.aplicar(100));
                            break;
                         case 3:
                            System.out.println(objper3.aplicar(100));
                            break;
                         case 4:
                           System.out.println(objper4.aplicar(100));
                            break;
                         default:
                            System.out.println("Solo números entre 1 y 4");
                    }
                    break;
            
                case 2:
                    System.out.println("ingrese el numero del perfume que desea cambiar el precio");
                    int monto = sn.nextInt();
                    switch(monto){
                        case 1:
                           System.out.println(objper1.cambiarPrecio(200));
                            break;
                        case 2:
                            System.out.println(objper2.cambiarPrecio(150));
                            break;
                         case 3:
                            System.out.println(objper3.cambiarPrecio(120));
                            break;
                         case 4:
                            System.out.println(objper4.cambiarPrecio(100));
                            break;
                         default:
                            System.out.println("Solo números entre 1 y 4");
                    }
                    break;
                 case 3:
                    System.out.println("ingrese el numero del perfume que desea consultar");
                    int NumDeProduconsu = sn.nextInt();
                    switch(NumDeProduconsu){
                        case 1:
                            System.out.println(objper1.consultarEstado());
                            break;
                        case 2:
                            System.out.println(objper2.consultarEstado());
                            break;
                         case 3:
                            System.out.println(objper3.consultarEstado());
                            break;
                         case 4:
                            System.out.println(objper4.consultarEstado());
                            break;
                         default:
                            System.out.println("Solo números entre 1 y 4");
                    }
                    break;
                 case 4:
                    salir=true;
                    break;
                 default:
                    System.out.println("Solo números entre 1 y 4");
            }
            
        }
       sn.close(); 
     }

}