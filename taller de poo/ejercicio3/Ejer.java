package ejercicio3;

import java.util.Scanner;

public class Ejer {

    public static void main(String[] args) {
        Producto Producto1 = new Producto("coca-cola", 3000, 5);
        Producto Producto2 = new Producto("papas", 2500, 5);
        Producto Producto3 = new Producto("chocoramo", 1500, 5);
        Producto Producto4 = new Producto("speed-max", 1800, 5);
        Producto Producto5 = new Producto("salchipapa", 4500, 5);
        Producto Producto6 = new Producto("salcipapa-con-queso", 5000, 5);

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. Añadir stock");
            System.out.println("2. Reducir stock");
            System.out.println("3. Valor total del inventario");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el numero del producto al que desea añadir stock");
                    int numopcion = sn.nextInt();
                    switch (numopcion) {
                        case 1:
                            System.out.println("Ingrese la cantidad de unidades que desea añadir");
                            int monto = sn.nextInt();
                            System.out.println(Producto1.añadirstock(monto));
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad de unidades que desea añadir");
                            monto = sn.nextInt();
                            System.out.println(Producto2.añadirstock(monto));
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad de unidades que desea añadir");
                            monto = sn.nextInt();
                            System.out.println(Producto3.añadirstock(monto));
                            break;
                        case 4:
                            System.out.println("Ingrese la cantidad de unidades que desea añadir");
                            monto = sn.nextInt();
                            System.out.println(Producto4.añadirstock(monto));
                            break;
                        case 5:
                            System.out.println("Ingrese la cantidad de unidades que desea añadir");
                            monto = sn.nextInt();
                            System.out.println(Producto5.añadirstock(monto));
                            break;
                        case 6:
                            System.out.println("Ingrese la cantidad de unidades que desea añadir");
                            monto = sn.nextInt();
                            System.out.println(Producto6.añadirstock(monto));
                            break;
                        case 7:
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 7");
                    }

                    break;
                case 2:
                    System.out.println("ingrese el numero del producto al que desea reducir stock");
                    numopcion = sn.nextInt();
                    switch (numopcion) {
                        case 1:
                            System.out.println("Ingrese la cantidad de unidades que desea reducir");
                            int monto = sn.nextInt();
                            System.out.println(Producto1.reducirstock(monto));
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad de unidades que desea reducir");
                            monto = sn.nextInt();
                            System.out.println(Producto2.reducirstock(monto));
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad de unidades que desea reducir");
                            monto = sn.nextInt();
                            System.out.println(Producto3.reducirstock(monto));
                            break;
                        case 4:
                            System.out.println("Ingrese la cantidad de unidades que desea reducir");
                            monto = sn.nextInt();
                            System.out.println(Producto4.reducirstock(monto));
                            break;
                        case 5:
                            System.out.println("Ingrese la cantidad de unidades que desea reducir");
                            monto = sn.nextInt();
                            System.out.println(Producto5.reducirstock(monto));
                            break;
                        case 6:
                            System.out.println("Ingrese la cantidad de unidades que desea reducir");
                            monto = sn.nextInt();
                            System.out.println(Producto6.reducirstock(monto));
                            break;
                        case 7:
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 7");
                    }
                    break;
                case 3:
                    int total = Producto1.valortotal() + Producto2.valortotal() + Producto3.valortotal()
                            + Producto4.valortotal() + Producto5.valortotal() + Producto6.valortotal();
                    System.out.println("El valor total del inventario es: " + total);
                    break;
                case 4:
                    salir = true;
                    break;
                default:

                    System.out.println("Solo números entre 1 y 7");
            }

        }
        sn.close();
    }
}
