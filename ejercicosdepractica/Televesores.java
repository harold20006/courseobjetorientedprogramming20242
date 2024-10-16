package ejercicosdepractica;

public class Televesores extends Productos {
     private String marca;
     private String modelo;
     private String pulgadas;
     private String resolucion;

        public Televesores(int numero, String marca, String modelo, String pulgadas, String resolucion) {
            super(numero);
            this.marca = marca;
            this.modelo = modelo;
            this.pulgadas = pulgadas;
            this.resolucion = resolucion;
        }   

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getPulgadas() {
            return pulgadas;
        }

        public void setPulgadas(String pulgadas) {
            this.pulgadas = pulgadas;
        }

        public String getResolucion() {
            return resolucion;
        }

        public void setResolucion(String resolucion) {
            this.resolucion = resolucion;
        }

        public String toString() {
            return "Televesores{" + "marca=" + marca + ", modelo=" + modelo + ", pulgadas=" + pulgadas + ", resolucion=" + resolucion + '}';
        }
        



}
