package Ascensor;

public abstract class Boton {

    protected boolean Color;
    protected boolean sonido;

    public Boton(boolean Color, boolean sonido) {
        this.Color = Color;
        this.sonido = sonido;
    }

    public abstract void presionar();

    public void apagarLuz() {
        this.Color = false;
        System.out.println("La luz del botón está apagada.");
    }

    public void encenderLuz() {
        this.Color = true;
        System.out.println("La luz del botón está encendida.");
    }

    public void emitirSonido() {
        this.sonido = true;
        System.out.println("El botón está emitiendo un sonido.");
    }

    public void detenerSonido() {
        this.sonido = false;
        System.out.println("El botón ha dejado de emitir sonido.");
    }

    public boolean isSonido() {
        return sonido;
    }

    public boolean isIluminado() {
        return Color;
    }

}
