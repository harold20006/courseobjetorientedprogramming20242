public class banco {
    private String NIT;
    private String razonSocial;
    private Cuenta cuenta;

    

    public banco(String nIT, String razonSocial, Cuenta cuenta) {
        NIT = nIT;
        this.razonSocial = razonSocial;
        this.cuenta = cuenta;
    }
 
    
    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }


    public Cuenta getCuenta() {
        return cuenta;
    }


    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "banco [NIT=" + NIT + ", razonSocial=" + razonSocial + ", cuenta=" + cuenta + "]";
    }
    

    public String esCliente(Cliente cliente){
        String msg = "no es cliente";
        if (cliente instanceof Cliente){
            msg = "si es cliente";
        }

        return msg;
    }

    

}