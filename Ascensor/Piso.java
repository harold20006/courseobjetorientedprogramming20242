package Ascensor;

public class Piso {
    private int numeroPiso;
    private BotonSolicitar botonSubir;
    private BotonSolicitar botonBajar;

    public Piso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
        // Un piso del último nivel no necesita botón de subir y el primero no necesita botón de bajar
        if (numeroPiso == 1) {
            this.botonSubir = new BotonSolicitar(true, true, "arriba");
            this.botonBajar = null;
        } else if (numeroPiso == SistemaControl.NUMERO_PISO_MAXIMO) { // Definir NUMERO_PISO_MAXIMO en SistemaControl
            this.botonSubir = null;
            this.botonBajar = new BotonSolicitar(true, true, "abajo");
        } else {
            this.botonSubir = new BotonSolicitar(false, false, null);
            this.botonBajar = new BotonSolicitar(false, false, null);
        }
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public BotonSolicitar getBotonSubir() {
        return botonSubir;
    }

    public BotonSolicitar getBotonBajar() {
        return botonBajar;
    }
}
