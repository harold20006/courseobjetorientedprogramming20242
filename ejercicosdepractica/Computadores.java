package ejercicosdepractica;

public class Computadores extends Productos {

    private String marca;
    private String modelo;
    private String procesador;
    private String ram;

    public Computadores(int numero, String marca, String modelo, String procesador, String ram) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String toString() {
        return "Computadores{" + "marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", ram=" + ram + '}';
    }

    
}
