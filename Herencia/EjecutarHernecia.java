public class EjecutarHernecia {
    public static void main(String[] args) {
        Trabajador objt1 = new Vendedor("Juan", "Ventas", 1, 20.0);
        Trabajador objt2 = new Vendedor("Pedro", "Produccion", 2, 10.0);
        Trabajador objt3 = new Operario("Maria", "Produccion", 3, 100);
        Trabajador objt4 = new Operario("Luis", "Ventas", 4, 150);

       System.out.println("el salario del vendedor es: " + objt1.salario());
       System.out.println("el salario del vendedor es: " + objt2.salario());
       System.out.println("l salario del operario es: "+ objt3.salario());
       System.out.println("el salario del operario es: "+ objt4.salario());
    }
}