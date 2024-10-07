package trabajo1;

public class Analista  extends  Trabajador{
     private final double salariointegral = 2000000;

    public Analista(String nombre, int edad, String cargo, int salario, int id) {
        super(nombre, edad, cargo, salario, id);

    }


    public double getSalariointegral() {
        return salariointegral;
    }

    public double salario() {
        return salariointegral;
    }

    
}
