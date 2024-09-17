public class Trabajador {
    private String nombre;
    private String area;
    private int id;

    public Trabajador(String nombre, String area, int id) {
        this.nombre = nombre;
        this.area = area;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getArea() {
        return area;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Area: " + area + ", ID: " + id;
    }
    public double salario() {
        double salario = 0.0;
        return salario;
    }
}