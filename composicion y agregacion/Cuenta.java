public class Cuenta {
    private String nrocuenta;
    private String tipocuenta;
    private double saldo;

    public Cuenta(String nrocuenta, String tipocuenta, double saldo) {
        this.nrocuenta = nrocuenta;
        this.tipocuenta = tipocuenta;
        this.saldo = saldo;
    }

    public String getNrocuenta() {
        return nrocuenta;
    }

    public void setNrocuenta(String nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Número de cuenta: " + nrocuenta + " Tipo de cuenta: " + tipocuenta + " Saldo: " + saldo;
    }
}