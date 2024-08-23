import java.util.Scanner;

public class ConversionDeGrados {
    double F;
    double C;
    double gradoscentigrados;
    double gradosfarenheit;
    Scanner scanner = new Scanner(System.in);
     
    public void leernumeroYcalculodeGrasdos(){
      System.out.println("ingrese un numero");
      F=scanner.nextInt();
      C=scanner.nextInt();

      gradosfarenheit=(C * 1.8) +32;
      gradoscentigrados=(F - 32) /1.8;
      
      System.out.println("los grados centigrados son:"+gradoscentigrados);
      System.out.println("los grados farenheit son:32"+gradosfarenheit);

    }
      public static void main(String[] args) {
      ConversionDeGrados grados= new ConversionDeGrados();
      grados.leernumeroYcalculodeGrasdos();

    }
}
