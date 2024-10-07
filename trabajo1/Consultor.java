package trabajo1;

public class Consultor extends Trabajador {
    private final double salariofijo= 1600000;
    private double comision;


    public Consultor(String nombre, int edad, String cargo, int salario, int id, double comision) {
        super(nombre, edad, cargo, salario, id);
        this.comision = comision;
    }

    public double getSalariofijo() {
        return salariofijo;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double pagar() {
        return salariofijo + comision;
    }




}
