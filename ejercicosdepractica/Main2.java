package ejercicosdepractica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente1 cliente = new Cliente1("harold", "1110293129", "3104966910");

        // crear productos

        Computadores computadores1 = new Computadores(1, "hp", "3312", "Ryzen5", "8gb");

        Televesores televesores1 = new Televesores(3, "samsung", "smart", "32 pulgadas", "hd");

        // Crear una lista de productos

        List<Productos> productos = new ArrayList<>();
        productos.add(computadores1);
        productos.add(televesores1);

        // Crear un pedido

        Pedido pedido = new Pedido(cliente, productos, new Date(), 987654321);

        // Mostrar la información del pedido

        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Cedula: " + pedido.getCliente().getCedula());
        System.out.println("contacto: " + pedido.getCliente().getContacto());
        System.out.println("Numero de tarjeta: " + pedido.getNumeroTarjetaC());
        System.out.println("Fecha del pedido: " + pedido.getFecha());

        System.out.println("Productos del pedido:");

        for (Productos producto : pedido.getProductos()) {
            if (producto instanceof Computadores) {
                Computadores comp = (Computadores) producto;
                System.out.println("- Computadores (numero: " + comp.getNumero() + ", marca: " + comp.getMarca()
                        + ", modelo: " + comp.getModelo() + ", procesador: " + comp.getProcesador() + ", ram: "
                        + comp.getRam() + ")");
            } else if (producto instanceof Televesores) {
                Televesores televesores = (Televesores) producto;
                System.out.println("- Televesores (numero: " + televesores.getNumero() + ", marca: " + televesores1.getMarca() + ", modelo: "
                        + televesores1.getModelo() + ", pulgadas: " + televesores1.getPulgadas() + ", resolucion: " + televesores1.getResolucion()
                        + ")");
            }
        }

    }
}