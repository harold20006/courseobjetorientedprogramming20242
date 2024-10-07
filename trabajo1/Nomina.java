package trabajo1;

public class Nomina {
    
    public static void main(String[] args) {
        Trabajador[] trabajadores = new Trabajador[4];
        trabajadores[0] = new Operario("Juan", 25, "Operario", 0, 1, 10);
        trabajadores[1] = new Analista("Pedro", 30, "Analista", 0, 2, 100);
        trabajadores[2] = new Consultor("Maria", 35, "Consultor", 0, 3, 500000);
        trabajadores[3] = new Operario("Luis", 40, "Operario", 0, 4, 20);
        
       double totalsalario= 0.0;
        for (Trabajador trabajador : trabajadores) {
            totalsalario += trabajador.salario();
            System.out.println(trabajador.getNombre() + " = " + trabajador.salario());
        }
        
        System.out.println("Total de la nomina: " + totalsalario);
    }
}
