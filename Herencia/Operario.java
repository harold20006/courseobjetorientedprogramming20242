public class Operario extends Trabajador {
    private double horas;
    public final double SALARIO_HORA = 60000.0;

    public Operario(String nombre, String area, int id, double horas) {
        super(nombre, area, id);
        this.horas = horas;
    }

    public double horas() {
        return horas;
    }

    public double salario() {
        return horas * SALARIO_HORA;
    }
}