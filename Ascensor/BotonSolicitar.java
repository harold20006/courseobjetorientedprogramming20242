package Ascensor;

public class BotonSolicitar extends Boton {

    private String direccion; // arriba o abajo 

    public BotonSolicitar(boolean Color, boolean sonido, String direccion) {
        super(Color, sonido);
        this.direccion = direccion;
    }

    public void presionar() {
        this.emitirSonido();
        this.encenderLuz();
        System.out.println("El botón ha sido presionada en la dirección "+direccion+". Esta iluminado:"+this.isIluminado()+" y emitiendo sonido:"+this.isSonido());
    }

    public String getDireccion() {
        return direccion;
    }       
}