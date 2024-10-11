package Arraylist;

import java.util.List;

public class Impresion extends Producto {
    private String color;
    private List<Foto> fotos;

    public Impresion(int numero, String color, List<Foto> fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }
}