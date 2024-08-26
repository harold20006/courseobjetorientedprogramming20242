

public class Ejecutar {
    public static void main(String[] args) {
        Marcador objmar = new Marcador("charoie", "azul", 0.5, true);
        objmar.rayar();
        System.out.println(objmar.recargar(0.5));
    }
}
