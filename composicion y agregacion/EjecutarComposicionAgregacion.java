public class EjecutarComposicionAgregacion {
    public static void main(String[] args) {
        Cliente objcliente1 = new Cliente("1110293243  ", "Juan", "Perez");
        Cliente objcliente2 = new Cliente ("1110293244", "Maria", "Lopez");

        Cuenta objcuenta1 = new Cuenta("001-001-0001", "Ahorros", 1000.00);
        Cuenta objcuenta2 = new Cuenta("001-001-0002", "Corriente", 2000.00);

        Banco objbanco1 = new Banco("001", "Banco UCC", objcuenta1);

        System.out.println(objbanco1);
        System.out.println(objbanco1.esCliente(objcliente1));
        System.out.println(objbanco1.esCliente(objcliente2));

        System.out.println(objcuenta1.consignar("001-001-0001", 500.00));
        System.out.println(objcuenta1.retirar("001-001-0001", 200.00));
        System.out.println(objcuenta1.consultarSaldo("001-001-0001"));
        

        System.out.println(objcuenta2.consignar("001-001-0002", 500.00));
        System.out.println(objcuenta2.retirar("001-001-0002", 200.00));
        System.out.println(objcuenta2.consultarSaldo("001-001-0002"));
       

       
        

    }
}
