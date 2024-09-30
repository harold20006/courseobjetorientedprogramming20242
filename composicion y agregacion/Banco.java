public class Banco {
    private String NTI;
    private String razonsocial;
    private Cuenta cuentas;

    public Banco(String NTI, String razonsocial, Cuenta cuentas) {
        this.NTI = NTI;
        this.razonsocial = razonsocial;
        this.cuentas = cuentas;
    }

    public String getNTI() {
        return NTI;
    }

    public void setNTI(String NTI) {
        this.NTI = NTI;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public Cuenta getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta cuentas) {
        this.cuentas = cuentas;
    }

    public String toString() {
        return "NTI: " + NTI + " Razón social: " + razonsocial + " Cuentas: " + cuentas;
    }

    public String esCliente(Cliente cliente) {
        String msg = "No es cliente";
        if (cliente instanceof Cliente) {
            msg = "Es cliente";
        }else{
            msg = "No es cliente";
        }
        return msg;

    }

}