package Ascensor;

public class Boton {
    private String tipo;
    private boolean ilumnidado;
    private boolean sonido;

    public Boton(String tipo, boolean iluminado, boolean sonido) {
        this.tipo = tipo;
        this.ilumnidado = false;
        this.sonido = false;
    }

    public void Presionar() {
        this.ilumnidado = true;
        this.sonido = true;
        System.out.println(
                "el boton ha sido " + tipo + "presionado y se ha iluminado" + ilumnidado + "y ha sonado" + sonido);
        this.ilumnidado = false;
        this.sonido = false;
    }

}
