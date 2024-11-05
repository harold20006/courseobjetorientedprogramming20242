package Ascensor;

public class BotonDestino extends Boton {
    private int pisoDestino;


    public BotonDestino(boolean Color, boolean sonido, int pisoDestino) {
        super(Color, sonido);
        this.pisoDestino = pisoDestino;
    }

    public void presionar() {
        this.emitirSonido();
        this.encenderLuz();
        System.out.println("El botón de"+pisoDestino+" ha sido presionado. Esta iluminado:"+this.isIluminado()+" y emitiendo sonido:"+this.isSonido());
    }

    public int getPisoDestino() {
        return pisoDestino;
    }

}
