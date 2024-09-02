package ejercicio3;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadDeStock;


    public Producto(String nombre, double precio, int cantidadDeStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDeStock = cantidadDeStock;

    }

public String añadirstock(int monto){
    this.cantidadDeStock+=monto;
    return "Se añadieron "+monto+" unidades de"+nombre;
}

public String reducirstock(int monto){
    this.cantidadDeStock-=monto;
    if(this.cantidadDeStock<0){
        return "No hay suficiente stock";
    }
    return "Se redujeron "+monto+" unidades de"+nombre;
 }

public int valortotal(){
    int total= (int) (this.cantidadDeStock * precio);
    return total;
}
} 
