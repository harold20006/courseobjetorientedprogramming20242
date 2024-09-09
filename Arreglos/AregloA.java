public class AregloA {

    public static void main(String[] args) {
        int[] arreglo = new int[5];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i;
            System.out.println("arreglo["+i+"] = "+ arreglo[i]);
        }
    }
}