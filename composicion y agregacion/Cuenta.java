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

    public String consignar (String nrocuenta,double monto) {
        String msg= "error transacción";
        if (this.nrocuenta.equals("001-001-0001") && this.nrocuenta.equals("001-001-0002")) {
            this.saldo += monto;
            msg="transacción exitosa";
        
        }else{
            msg="cuenta no encontrada";
        }
        return msg;
    }

    public String retirar (String nrocuenta,double monto) {
        String msg= "error transacción";
        if (this.nrocuenta.equals("001-001-0001") && this.nrocuenta.equals("001-001-0002")) {
            if (this.saldo >= monto) {
                this.saldo -= monto;
                msg="transacción exitosa";
            }else {
                msg="saldo insuficiente";
            }
        }
        return msg;
    }

    public String transferir (String nrocuenta,double monto){
        String msg= "error transacción";
        if (this.nrocuenta.equals("001-001-0001") && this.nrocuenta.equals("001-001-0002")) {
            if (this.saldo >= monto) {
                this.saldo -= monto;
                msg="transacción exitosa";
            }else {
                msg="saldo insuficiente";
            }
        }
        return msg;
    }

    public String consultarSaldo (String nrocuenta){
        String msg= "error transacción";
        if (this.nrocuenta.equals("001-001-0001")) {
            msg="saldo: "+this.saldo;
        }
        return msg;
    }


}