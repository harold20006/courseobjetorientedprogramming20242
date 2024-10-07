package trabajo1;

public class Operario extends Trabajador {
    
    private final double salariofijo= 1200000;
    private int horasextras;
    private final int valorextrahora= 40000;
    

    public Operario(String nombre, int edad, String cargo, int salario, int id, int horasextras) {
        super(nombre, edad, cargo, salario, id);
        this.horasextras = horasextras;
    }

    public double getSalariofijo() {
        return salariofijo;
    }

    public int getHorasextras() {
        return horasextras;
    }

    public void setHorasextras(int horasextras) {
        this.horasextras = horasextras;
    }

    public int getValorextrahora() {
        return valorextrahora;
    }


    public double salario() {
        return salariofijo + (horasextras * valorextrahora);
    }
}
