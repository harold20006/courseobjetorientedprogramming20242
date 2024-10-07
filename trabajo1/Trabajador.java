package trabajo1;

public class Trabajador {
      
    private String nombre;
    private int edad;
    private String cargo;
    private int salario;
    private int id;

    public Trabajador(String nombre, int edad, String cargo, int salario, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.salario = salario;
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

    public int getSalario() {
        return salario;
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

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Cargo: " + cargo + ", Salario: " + salario + ", ID: " + id;
    }

    public double salario() {
        salario= 0;
        return salario;
    }
    


      

}
