public class Vendedor extends Trabajador {
    public static final double VENTAS = 120000.0;
    private double comision;

    public Vendedor(String nombre, String area, int id, double comision) {
        super(nombre, area, id);
        this.comision = comision;
    }

    public double comision() {
        return comision;
    }

    public double salario() {
        return (VENTAS * (comision / 100)) + VENTAS;
    }

    
}