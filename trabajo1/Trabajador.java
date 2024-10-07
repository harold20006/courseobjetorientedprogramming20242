package trabajo1;

public class Trabajador {
      
    private String nombre;
    private int edad;
    private String cargo;
    private int pagar;
    private int id;

    public Trabajador(String nombre, int edad, String cargo, int pagar, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.pagar = pagar;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCargo() {
        return cargo;
    }

    public int getpagar() {
        return pagar;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setpagar(int pagar) {
        this.pagar = pagar;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Cargo: " + cargo + ", pagar" + pagar + ", ID: " + id;
    }

    public double pagar() {
        pagar = 0;
        return pagar();
    }
    


      

}
