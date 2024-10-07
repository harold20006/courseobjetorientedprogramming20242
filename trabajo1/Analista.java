package trabajo1;

public class Analista  extends  Trabajador{
     private  double salariointegral;
     private double lineasdecodigo;
     private final double VALOR_LINEA_CODIGO = 1000;

    public Analista(String nombre, int edad, String cargo, int salario, int id, double lineasdecodigo) {
        super(nombre, edad, cargo, salario, id);
        this.lineasdecodigo = lineasdecodigo;

    }

    public double getLineasdecodigo() {
        return lineasdecodigo;
    }

    public void setLineasdecodigo(double lineasdecodigo) {
        this.lineasdecodigo = lineasdecodigo;
    }


    public double getSalariointegral() {
        return salariointegral;
    }

    public double pagar() {
        return salariointegral+(lineasdecodigo*VALOR_LINEA_CODIGO);
    }

    
}
