package ejercicosdepractica;

public class Cliente1 {

    private String nombre;
    private String cedula;
    private String contacto;

    public Cliente1(String nombre, String cedula, String contacto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getContacto() {
        return contacto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

}
