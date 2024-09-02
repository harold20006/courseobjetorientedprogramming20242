package ejercicio1;

public class CuentaBancaria {
    
    private String titular;
    private double saldo;
    double depositar;
    double retirar;
    int numeroCuenta;

    public CuentaBancaria(String titular, double saldo, int numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public String titular(){
        return titular;
    }
    public String saldo(double cantidad){
        
       saldo = saldo + cantidad;
       return "El saldo de la cuenta es: " + saldo;

    }
    public String depositar(double cantidad){
        saldo += cantidad;
        return " la cantidad del deposito es de:"+ cantidad +" y el saldo actual es de: " + saldo;
    }
    public String retirar(double cantidad){
        saldo -= cantidad;
        return " la cantidad del retiro es de:"+ cantidad +" y el saldo actual es de: " + saldo;
    }
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 1000, 123456);
        System.out.println("Titular: " + cuenta.titular);
        System.out.println("Saldo: " + cuenta.saldo);
        System.out.println("mumerocuenta: " + cuenta.numeroCuenta);
        System.out.println("depositar: " + cuenta.depositar(1000));
        System.out.println("retirar: " + cuenta.retirar(500));
    }
}


