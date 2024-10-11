package Arraylist;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("123456789", "Juan Pérez");

        // Crear fotos
        Foto foto1 = new Foto("foto1");
        Foto foto2 = new Foto("foto2");

        // Crear una lista de fotos
        List<Foto> fotos = new ArrayList<>();
        fotos.add(foto1);
        fotos.add(foto2);

        // Crear un producto tipo Impresion
        Impresion impresion = new Impresion(1, "Rojo", fotos);

        // Crear un producto tipo Camara
        Camara camara = new Camara(1, "Nikon", "D3500");

        // Crear una lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(impresion);
        productos.add(camara);

        // Crear un pedido
        Pedido pedido = new Pedido(cliente, productos, new Date(), 987654321);

        // Mostrar la información del pedido
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Cédula: " + pedido.getCliente().getCedula());
        System.out.println("Fecha del pedido: " + pedido.getFecha());
        System.out.println("Número de tarjeta: " + pedido.getNumeroTarjetaCredito());

        System.out.println("Productos del pedido:");
        for (Producto producto : pedido.getProductos()) {
            if (producto instanceof Impresion) {
                Impresion imp = (Impresion) producto;
                System.out.println("- Impresión (número: " + imp.getNumero() + ", color: " + imp.getColor() + ")");
                for (Foto foto : imp.getFotos()) {
                    foto.print();
                }
            } else if (producto instanceof Camara) {
                Camara cam = (Camara) producto;
                System.out.println("- Cámara (número: " + cam.getNumero() + ", marca: " + cam.getMarca() + ", modelo: " + cam.getModelo() + ")");
            }
        }
    }
}

