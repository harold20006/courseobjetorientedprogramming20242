public class Perfume {
    private String nombre;
    private String marca;
    private int precio;
    private double cantidad; 


    public Perfume(String nombre, String marca, int cantidad, int precio){
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad; 
    }


    public String aplicar(double cantidad) {
        if (this.cantidad >= 5) {
            this.cantidad -= 5;
            return "Se ha aplicado el perfume, resta un " + this.cantidad + "ml de perfume";
        } else {
            return "el perfume se ha acabado";
        }
    }

    public String cambiarPrecio(int precio) {
        this.precio = precio;
        return "El precio de: " + this.nombre + " ha sido cambiado a " + precio;
    }

    public String consultarEstado() {
        return "El perfume '" + this.nombre + "', de la marca '" + this.marca + "', tiene un costo de: " + this.precio
                + "$ y tiene un " + this.cantidad + "ml de perfume restante";
    }

}